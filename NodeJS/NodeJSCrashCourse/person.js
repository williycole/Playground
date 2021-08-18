//this whole thing is wrapped in a moudle wrapper function
class Person {
 constructor(name, age){
     this.name = name;
     this.age = age;
 }

 greeting(){
    //  console.log(__dirname, __filename);////module wrapper
     console.log(`My name is ${this.name} and I am ${this.age} years old.`);
 }
}
//If I want to use this module somewhere else simply do the follwoing
module.exports = Person;