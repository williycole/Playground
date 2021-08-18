// 
//==========(Functions)==========
//-- delcared with the "function" keyword are called hoisted
//there for you can run the above or before they are declared unlike
//--
//function doctorize(firstName) {
//   return `Dr. ${firstName}`;
// }



//



//==========(Anon Funciton)==========
//-- an anynomus function, function without a name
//-- 
//function (firstName) {
//  return `Dr. ${firstName}`;
// }



//



//==========(Funciton Expression)==========
//-- where you store a funciton as a value in a variable
//--this is what functions are first class citizens means
//--Below is a variable funciton, you can only access variable funcitons
//--after they have been declared(Basically you just put a function inside a variable, the variable is the function)
//--
// const doctorize = function(firstName) {
//   return `Dr. ${firstName}`;
// };



//



//==========(Arrow Functions)==========
//--arrow functions are shorter and concise
// they also don't have their own scope, they are also annoyms functions
// const inchToCM = inches => inches * 2.54;
//
//
//     __This is how you make an arrow function__
//    |  function add(a, b = 3) {                |
//    |   const total = a + b;                   |
//    |      return total;                       |
//    | }                                        |
//    | const add = (a, b = 3) => a + b;         |
//    ============================================
//Below is an example for this
//
function inchToCM(inches) {
    const cm = inches * 2.54;
    return cm;
}
//   OR this way
function inchtoCM2(inches){
    return inches * 2.54;
}
//  TO Arrow function
const inchesToCM3 = (inches) => inches * 2.54;
//All of the above functions do the exact same thing, notice how
//cm didn't have to be defined when written this way. 
//
//more examples(this is the template example also)
//
function add1(a, b = 3) {                
    const total = a + b;                   
       return total;                       
}
// 
const add2 = (a, b = 3) => a + b;
//
//more examples
//
//--below is called (returning and object)
function makeABaby(first, last) {
  const baby = {
    name: `${first} ${last}`,
    age: 0
  }
  return baby;
}
// Or this way
//--(implicitley return an object when it gets confused as to if 
//--the cruly brackets is for an object or a block of code)
//
// const makeABaby_Broken = (first, last) =>  {name: `${first} ${last}`, age: 0}
//
//--all you do is put the {} inside () to contain it like ({})
const makeABaby2 = (first, last) =>  ({ name: `${first} ${last}`, age: 0 });




//



//==========(IIFE--Immediatley Invoked(run) Function Expression)==========
//--wrap the functionin (fucntion(){some fucntion})();
//--and put (); at the end and it will immediatley run
//--
// (function(){
//     console.log('running the anon funciton');
//     return 'your are cool';
// })();



//



//==========(Methods!!!)==========
//-- a Function that lives inside of an objects
//--Ex. console.log
//--console is an object, log is the function that lives inside of the console object

//Method
const wes = {
  //name: 'Wes Bos',
  name: 'Westopher Bos',
  sayHi: function () {
    console.log (`Hey ${this.name}`);
    console.log('Hey Wes');
    return 'Hey Wes';
  },
//===(Shorthand Method)
  yellHi() {
    console.log('HEY WESSSSSS!')
  },
//===(Arrow function) 
  wisperHi:() => {
    console.log('hii wesss im a mouse');
  }
}



//



//==========(Callback Functions)==========
//--when someone clicks something run this, or when this 
//--amount of time passes run this

//===(Click Callback)
//--Below we aren't running the function, but we are calling back to the function from eariler, 
//--and saying a browser Run this function when someone Clicks this button
//
//
// const button =document.querySelector('.clickMe');
// button.addEventListener('click', wes.yellHi);
//
//
//--here we are using a function called handleClick to handle the click
const button = document.querySelector('.clickMe');
function handleClick() {
  console.log('Great Clicking!!');
}
button.addEventListener('click', handleClick);
//--anonomys example works as well
// button.addEventListener('click', function(){
// console.log('Nice Job!!!');
// });
//
//===(Timer Callback)
setTimeout(wes.wisperHi, 1000)
//anonomys example below
setTimeout(function() {
  console.log("I am an anonoymous timer call back!");
}, 3000)

