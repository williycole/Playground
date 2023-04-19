/*
  write a function that accepts an array that only contains
  two types of things: numbers and arrays. those nested arrays
  also only contain numbers and other, nested arrays.

  example: nestedAdd([1, 2, [3]]) = 6
           nestedAdd([[[2]], 1, [1, 3]]) = 7
 */

// let array = [1, 2 ,3] //Works
// let array = [1,[2],3] //Works
// let array = [1,[2,3],3] //Works
// let array = [[[[[[[[[7]]]]]]]]]
let array = [10,[12,14,[1],[ 16, [20]]],10,11]
console.log(array.length)
// have to come up with a way to dig into the array
function nestedAdd(array) {
  //Loop through whole array syncronusly
  for (let i = 0; i < array.length; i++) {
    let currentItem = array[i];

  }
}
nestedAdd(array)

// test.skip("nested arrays addition", () => {
//   expect(nestedAdd([1, 2, 3])).toEqual(6);
//   expect(nestedAdd([1, [2], 3])).toEqual(6);
//   expect(nestedAdd([[[[[[[[[5]]]]]]]]])).toEqual(5);
//   expect(nestedAdd([10, [12, 14, [1], [16, [20]]], 10, 11])).toEqual(94);
// });
