/*eslint-env node*/
/* eslint-disable */
const mongoose = require('mongoose');
const express = require('express');
const app = express();
const morgan = require('morgan');
const {urlencoded, json} = require('body-parser')
// (schema for a note)
const noteSchema = new mongoose.Schema({
    title: {
        type: String,
        required: true,
        unique: true
    },
    body : {
        type: String,
        minlength: 10
    }
})
// Mongoose model
const Note = mongoose.model('note', noteSchema)

// Middleware setup
app.use(morgan('dev'))
app.use(urlencoded({extended: true}))
app.use(json())

/** First thing you have to do is crate a route and then a funcitons that takes a request and
 * a response this is all done within a controller and your models you just usually
 * import and require them but...{we are just making a (schema) here on [line 8 - 19]}
 * after that we ahve our not model on line [20 -21]
 * */
// -->@Controller (GET)
app.get('/note', async (req, res) => {
    try{
        // here we will query all the notes so its async and use find({})
        const notes = await Note.find({})
        // pagenations in mongo is easily handled with .sort(), skip(), and .limit()
        // to take some heavy lifting off mongoose when needed --> means just give me the json
        .lean() // .lean() only works for queries
        .exec()
        // for express we then set the status code to 200 and send back some json
        res.status(200).json(notes)
    }catch (e) {
        res.status(500).send()
    }
})
// -->@Controller (POST)
app.post('/note', async (req, res) => {
    const noteTobeCreated = req.body
    const note = await Note.create(noteTobeCreated)
    res.status(201)
})

/**
 * a really good pattern to follow is instead of importing all of your models into one file
 * attach them to some objeact that you can inject into your controllers so every controller has
 * every model. So here with express it may be a good idea to attach you models to the request object
 */

/** STEP 1: Connecting to the DB*/
const connect  = () => {
    return mongoose.connect('mongodb://localhost:27017/femexpressmongodbintro');
}

connect()
    .then(async connection => {
        app.listen(5000) // how you start a server in express
    })
    .catch(e => console.error(e))