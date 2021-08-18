//Hoisting is-- variable declarations, and functions declarations that are
//hoisted to the top of the file


//hoisting is useful with this approach
//--What does this file do?
sayHi();

//--How does this file do it?
function sayHi() {
    console.log('hey');
}

//here you can run the function before it exists due to hoisting
//hoisting moves the functions to the top of the file

//Javascript will hoist variable declarations
//but wont hoist the actual setting of the value

