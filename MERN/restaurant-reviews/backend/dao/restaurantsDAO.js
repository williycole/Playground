import mongodb from "mongodb"
const ObjectId = mongodb.ObjectID

// variable used to store a reference to the database
let restaurants

export default class RestaurantsDAO {
    /**
     * @description this method is how initial connection to the db is made,
     * called as soon as sever starts and gets reference to restaurants database
     * @param {*} conn
     * @returns reference to resturants reference
     */
  static async injectDB(conn) {
    if (restaurants) {
      return
    }
    try {
        // connection to database and trys to get the collection resturants
        restaurants = await conn.db(process.env.RESTREVIEWS_NS).collection("restaurants")
    } catch (e) {
      console.error(
        `Unable to establish a collection handle in restaurantsDAO: ${e}`,
      )
    }
  }

  /**
   *
   * @description called to get a list of all the restaurants in the database
   * @returns list of all the resturants
   */
  static async getRestaurants({
    filters = null,
    page = 0,
    restaurantsPerPage = 20,
  } = {}) {
    let query
    if (filters) {
      // name filter
      if ("name" in filters) {
        query = { $text: { $search: filters["name"] } }
      }// cuisine filter
      else if ("cuisine" in filters) {
        query = { "cuisine": { $eq: filters["cuisine"] } }
      }// zipcode filter
      else if ("zipcode" in filters) {
        query = { "address.zipcode": { $eq: filters["zipcode"] } }
      }
    }

    let cursor

    try { // finds all the restaurants or returns all restaurants or returns error if error
      cursor = await restaurants.find(query)
    } catch (e) {
      console.error(`Unable to issue find command, ${e}`)
      return { restaurantsList: [], totalNumRestaurants: 0 }
    }
    // limits the resturants per page and gets the actual page number current index
    const displayCursor = cursor.limit(restaurantsPerPage).skip(restaurantsPerPage * page)

    try {
        // set resturant list to an array then return the array
      const restaurantsList = await displayCursor.toArray()
      const totalNumRestaurants = await restaurants.countDocuments(query)

      return { restaurantsList, totalNumRestaurants }
    } catch (e) {
      console.error(
        `Unable to convert cursor to array or problem counting documents, ${e}`,
      )
      return { restaurantsList: [], totalNumRestaurants: 0 }
    }
  }
  static async getRestaurantByID(id) {
    try {
      const pipeline = [
        {
            $match: {
                _id: new ObjectId(id),
            },
        },
              {
                  $lookup: {
                      from: "reviews",
                      let: {
                          id: "$_id",
                      },
                      pipeline: [
                          {
                              $match: {
                                  $expr: {
                                      $eq: ["$restaurant_id", "$$id"],
                                  },
                              },
                          },
                          {
                              $sort: {
                                  date: -1,
                              },
                          },
                      ],
                      as: "reviews",
                  },
              },
              {
                  $addFields: {
                      reviews: "$reviews",
                  },
              },
          ]
      return await restaurants.aggregate(pipeline).next()
    } catch (e) {
      console.error(`Something went wrong in getRestaurantByID: ${e}`)
      throw e
    }
  }

  static async getCuisines() {
    let cuisines = []
    try {
      cuisines = await restaurants.distinct("cuisine")
      return cuisines
    } catch (e) {
      console.error(`Unable to get cuisines, ${e}`)
      return cuisines
    }
  }
}