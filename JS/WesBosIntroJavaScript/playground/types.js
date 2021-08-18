/* eslint-disable*/

/*
//-----------------------Strings---------------------------- 
    console.log('it works');
    const name = 'william';
    const middle = 'cole';
    const last = `boren`; //backticks 

    const sentence = 'she\'s so cool'; 
    const sentencej = "she's so so cool";
    const sentencei = `she's 'so' "so so" cool`;
    const multiline = `ohhh 
    this
    is 
    how 
    you do multi line`

    //const hello = "Hellow my name is " + name + ". Nice to meet you"; // this is concatenation, this is the old way of doing it. 
    const hello = `Hellow my name is ${name}. Nice to meet you. I am ${20+7} years old.`;

    const html = `
        <div>
        <h2>${name}</h2>
        <p>${hello}</p>
        </div>
    `;

    document.body.innerHTML = html;
    console.log(html);
*/


/*
//----------------------------Numbers------------------------
        const age = 100;
        const name = 'cole';
        //Math. gets you a short cut to helper methods, its kinda like how excel gives you mathmatical options
        //you can basically add variable similarly with java script how you would in python or C or any other languege 
        const smarties =20;
        const kids = 3;
            //Math.floor rounds down. % gives the amount left over or Remainder. 
        const eachKidGets = Math.floor(smarties/kids);
        const leftOver = smarties%kids;
        console.log(`Each kids gets ${eachKidGets} each, with ${leftOver} left over.`);
            //If working with money alway work with cents. 
            //Nan also means not a number ex, 10/dog=NaN
*/

/*
//--------------------------Objects------------------------------
//Are generally used for collections of data and functionallity, 
    //Objects are used for grouping things together as seen below
    
    const person = {
        first: 'william',
        middle: 'cole',
        last: 'boren', 
        age: 27
    };
*/
    //In objects order doesnt matter. If you need an certain order use an Array.
//--------------------------Null and Undefined------------------------------   
//null is something that has a value of nothing
//and undefined has no value
/*
let dog;
console.log(dog);
let somethingUndefined;
const somethingNull = null;
            //undefined example
                //if you search cole.last in the console you will get undifined
                //cause my last name is not stated
            const cole = {
                first: 'cher'
            };
            //null example
                //if you search teller.last even though teller was a last name
                //it now has been set as undefined
            const teller = {
                first: 'Raymond',
                last: 'Teller'
            };
            teller.first = 'Teller';
            teller.last = null;
*/


//--------------------------Booleans and Equality------------------------------ 
//  Booleans are either true or false, we use booleans for logic such as if statements

let isDrawing = false;
let age = 18;
const ofAge = age > 19;
console.log(ofAge);
//
age = 100;
let age2 = 100;
//-----------  === checks value and type--------------
//=== is almost always what you should use, 
//=== that the values on either side of the === 
//it also checks if the types are the same, ie both numbers
//
//-----------  ==checks only value----------
//== is kind of almost a bad practice,
// it woulf give "10"==10 as true
// this is not actually totally true therfore 
//This is not explicit enough as it mixes Strings and Numbers and 
//It can mess up code when doing math/ addition because of concatination and cause bugs in the future
//
//------------= just sets a value, so use === mostly----------