console.log("hello from node js");

////import Person from './Person';////can't do this like you do in react// this is es6 modules
const Person = require("./person");////this method of module is common js

const personOne = new Person('Cole', 28);

personOne.greeting();
