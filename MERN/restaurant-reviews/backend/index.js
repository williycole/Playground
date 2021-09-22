import app from "./server.js"
import mongodb from "mongodb"
import RestaurantsDAO from "./dao/restaurantsDAO.js"
import dotenv from "dotenv"
dotenv.config()//access .env file

const MongoClient = mongodb.MongoClient
const port = process.env.PORT || 8000 // 8000 if port can't be accessed

MongoClient.connect(
    process.env.RESTREVIEWS_DB_URI, // pass in UIR from .env here
    {
        maxPoolSize:50,
        wtimeoutMS:2500,
        useNewUrlParser:true
    })
    .catch(err => {
        console.error(err.stack)
        process.exit(1)
    })
    .then(async client => {// after database is connected above the web server is started here
        // here before server is started the DAO is injected via injectDB
        await RestaurantsDAO.injectDB(client)
        app.listen(port, () => {
        console.log(`listening on port ${port}`)
    })
})