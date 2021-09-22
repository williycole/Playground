import express from 'express'
import RestaurantsController from './restaurants.controller.js'

const router = express.Router()

// router.route("/").get((req, res) => res.send("hello world"))// demo router for root route
router.route("/").get(RestaurantsController.apiGetRestaurants)// demo router for root route


export default router