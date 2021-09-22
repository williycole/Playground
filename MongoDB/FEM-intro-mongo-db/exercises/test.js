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
        required: true,
        unique: true
    },
    faveFoods: [{type: String}],
    info: {
        school:{
            type: String
        },
        },
        shoeSize: {
            type: Number,
        },
        school: {// you can also nest models inside eachother like this
            type: mongoose.Schema.Types.ObjectId,
            required: true, //Reference for the school colletions
            ref: 'school'
    }
}, {timestamps: true});

const school = new mongoose.Schema({
    name: String,
})

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
const School = mongoose.model('school', school)
const Student = mongoose.model('student', student);

/**
 * STEP 4:
 * Run connect[-->returns a promise via mongoose.connect()], and connect to the db
 * using the create method on the actual model is the prefered way to create data
 */
connect()
    .then(async connection => {
        const school = await School.findOneAndUpdate({name: 'Frontend Masters'},
        {name: 'Frontend Masters'},
        {upsert: true})// upsert either finds and updates but if it doesn't find anything it creates
        .exec()
        const student = await Student.create({firstName: 'Madisonzz', school: school._id});
        const student2 = await Student.create({firstName: 'Colezz', school: school._id});
        // for referencing the school within the student and .populate() makes it a school object, this is a virtual join table
        const match = await Students.findAllById(student.id)
            .populate('school').exec()
        /*
        * Note what is being logged out here is not a JS Object, its a Mongoose Document
        * sometimes this is not desirable and you can convert it to JSON
        * Note you can also run various queries on your data like
        * Student.find()
        */
        // console.log(student);
        console.log(match);
        console.log(school);
    })
    .catch(e => console.error(e));