/*

  write a function that accepts an array that only contains
  two types of things: numbers and arrays. those nested arrays
  also only contain numbers and other, nested arrays.

  example: nestedAdd([1, 2, [3]]) = 6
           nestedAdd([[[2]], 1, [1, 3]]) = 7



           let counter = 0

function printHello() {
  console.log("hello")
  counter++
  console.log(counter)

  if (counter > 3) {
    return;
  }

  printHello()
}

printHello()


const sum = [1, 2, 3].reduce((partialSum, a) => partialSum + a, 0);
console.log(sum); // 6
 */

// let array = [1, 2 ,3] //Works
// let array = [1,[2],3] //Works
// let array = [1,[2,3],3] //Works
let array = [10, [12, 14, [1], [16, [20]]], 10, 11]//TODO
//let array = [[[[[[[[[5]]]]]]]]] //TODO
let counter = 0;
let numSum = 0;
  // have to come up with a way to dig into the array
function nestedAdd(array) {
  // check if type of current item is an array if
  if(Array.isArray(array[counter])){
    console.log("Array found")
    let innerArray = array[counter];
    let innerSum = innerArray.reduce((partialSum, a) => partialSum + a, 0)
    numSum += innerSum
    counter++
    //TODO don't forget you could call nested array here too if needed
  }
  // add numbers and itterate
  numSum += array[counter];
  counter++
  console.log(numSum)
  //base case
  if (counter === array.length)return;
  nestedAdd(array)
}
nestedAdd(array)
















test.skip("nested arrays addition", () => {
  expect(nestedAdd([1, 2, 3])).toEqual(6);
  expect(nestedAdd([1, [2], 3])).toEqual(6);
  expect(nestedAdd([[[[[[[[[5]]]]]]]]])).toEqual(5);
  expect(nestedAdd([10, [12, 14, [1], [16, [20]]], 10, 11])).toEqual(94);
});
