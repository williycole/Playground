/*eslint-env node*/
/* eslint-disable */


/**
 * STEP 1:
 * Connecting to the DB
 */
const mongoose = require('mongoose');

const connect  = () => {
    return mongoose.connect('mongodb://localhost:27017/mydb');
}

/**
 * STEP 2:
 * Creating Collections(Schemas)
 */
const student = new mongoose.Schema({
    firstName: {
        type: String,
        required: true
    },
    info: {
        school: {
            type: String,
            required: true
        },
        faveFoods: [{type: String}],
        shoeSize: {
            type: Number,
            required: true
        }
    }
});

/**
 * STEP 3:
 * Convert Schema to Mongoose Model,
 * the model will create a collection for us
 * keep all colletions lowercase and singular,
 * mongo will make it plural.
 *
 * Models begin with
 * a Capital letter.
 */
const Student = mongoose.model('student', student);

/**
 * STEP 4:
 * Run connect[-->returns a promise via mongoose.connect()], and connect to the db
 * using the create method on the actual model is the prefered way to create data
 */
connect()
    .then(async connection => {
        const student = await Student.create({firstName: 'Cole'});
        /*
        * Note what is being logged out here is not a JS Object, its a Mongoose Document
        * sometimes this is not desirable and you can convert it to JSON
        * Note you can also run various queries on your data like
        * Student.find()
        */
        console.log(student);
    })
    .catch(e => console.error(e));