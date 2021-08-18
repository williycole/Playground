// Function Definition
// you can set 'Defaults' to your functions--see taxRate = 0.13 below
// you could also default with an empty string-- taxRate = ''
function calculateBill(billAmount, taxRate = 0.13, tipRate = 0.15) {
  // params are bascially place holders
  // this is the funciton body
  console.log('Running Calculate Bill!!!');
  const total = billAmount + billAmount * taxRate + billAmount * tipRate;
  return total;
}

//
//
//
//

// Function Call. Or **Run**
const myTotal = calculateBill(100, 0.13);
const myTotal2 = calculateBill(200, 0.13);
const myTotal3 = calculateBill(20 + 20 + 20 + 30, 0.15);
const kait = 100;
const myTotal4 = calculateBill(kait + 50, 0.13);
console.log(myTotal, myTotal2);
console.log(`Your first total is $${myTotal}.`);
console.log(`Your second total is $${myTotal2}.`);
console.log(`Your third total is $${myTotal3}.`);
console.log(`You and kait's total bill is $${myTotal4}.`);

//
//
//
//

/* const firstName = 'Cole';
function sayHiTo() {
  return `Hello ${firstName}`;
}
const greeting = sayHiTo();
console.log(greeting); */

// Here its ok that name is used in both fucntions
// This is because the parameters of name exsist within those functions along
// aka local to both the functions and not global to both
// so when you call doctorize in the consolelog
// and do doctorize('wes'), it will say Dr. wes
// and you can do a different name for yell()
function doctorize(name) {
  return `Dr. ${name}`;
}
// you can set 'Defaults' to your functions--see Silly Goose below
function yell(name = 'Silly Goose') {
  return `HEY ${name.toUpperCase()}`;
}
// you can also do yell(doctorize('cole'))
// and combine these functions locally together
