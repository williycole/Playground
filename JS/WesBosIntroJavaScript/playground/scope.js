// ==========(Global Variables)==========
const first = 'wes';
let second = "bos";
var age2 = 100;//var variables are attached to the window
// =====AVOID GLOBAL VARIABLES
// this is an example of a global variable
// it is created out in the open for anything to access
//in the Browser the Global Scope is called the (WINDOW)
// =====AVOID GLOBAL VARIABLES





//




//==========(Function Scope)==========
//-- variables are created inside of a function and those variables
// are only available inside the function if we explicity return it
// it and put it in its own variable when the function is run
const age = 100;

function go() {
    const functionScope = 'this is a function scope example';
    const hair = 'blone';
    const myAge = 28;
    console.groupCollapsed('These are all function Scoped Examples');
        console.log(myAge, '--here we name it age 2 to avoid overshadowed variables');
        console.log(hair, '--hair in function');
    console.groupEnd();
    console.groupCollapsed('Global variable passed into function Example');
        console.log(age, 'passed into the function from global variable');
    console.groupEnd();
}

go();// runing fucntion

//
//
//------comment this out to be able to run 
        // console.groupCollapsed('Global Examples outside of function and scope error example');
        //     console.log(age, ' same  global variable accessed out of function');
        //     console.log(functionScope);//hair keeps giving the error not defined
        // // this is and example of function scope
        // console.groupEnd();
//------comment this out to be able to run
//
//
//

//-- anything inside of {BLOCKS} are NOT able to be accessed outside of that BLOCK(blocks of code, or block exit/entry, think of them as gates)
// see example below

function isCool(name) {
    let cool;// this kind of set up with variables prevents leak 
    if ( name === 'wes') {
        cool = true;
    }
    console.log(cool);
    return cool;
}
//so essentially always use const, use let when you need to update, and avoid
//var if unless you have to use it

//
//
// more examples with scope lookup
//lexically scoped language--scope lookup happens where the functions are defined
//not where it is run
const dog = 'snickers';

function logDog() {
    console.log(dog);
}

function go2() {
    const dog = 'sunny'
    logDog();
}

go2();

//functions are scoped the same way as variables, you can scope a function inside
// another funciton essentially
