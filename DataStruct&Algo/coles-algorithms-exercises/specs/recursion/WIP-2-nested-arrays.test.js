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
let array = [10, [12, 14, [1], [16, [20]]], 10, 11] //TODO
// let array = [[[[[[[[[7]]]]]]]]] //TODO
let counter = 0;
let numSum = 0;
  // have to come up with a way to dig into the array
  // working here
function nestedAdd(array) {
  let currentItem = array[counter];
  // check if type of current item is an array if
  if(typeof currentItem === 'object'){
    console.log("--InnerArray Found--")
    console.log(typeof(currentItem))
    console.log(`Counter: ${counter}`)
    console.log(`CurrentItem: ${currentItem}`)

    let flatArr = flatten(currentItem)
    var innerSum = flatArr.reduce((acc, val) => acc + val);
    console.log(`InnerSum: ${innerSum}`)
    console.log(`NumSum: ${numSum}`)
    numSum += innerSum
    counter ++;
    console.log("-----------")
  } else {
    console.log("--Not InnerArray--")
    console.log(typeof(currentItem))
    console.log(`Counter: ${counter}`)
    console.log(`CurrentItem: ${currentItem}`)
    console.log(`NumSum: ${numSum}`)
    // add numbers and itterate
    numSum += array[counter];
    counter++
    console.log(`NumSum: ${numSum}`)
    console.log("-----------")
  }

  //base case
  // console.log(`Counter: ${counter}`)
  if (counter === array.length|| counter > 50)return;
  nestedAdd(array)
}
nestedAdd(array)

function flatten(array) {
    return array.reduce((acc, val) => Array.isArray(val) ? acc.concat(flatten(val)) : acc.concat(val), []);
  }

test.skip("nested arrays addition", () => {
  expect(nestedAdd([1, 2, 3])).toEqual(6);
  expect(nestedAdd([1, [2], 3])).toEqual(6);
  expect(nestedAdd([[[[[[[[[5]]]]]]]]])).toEqual(5);
  expect(nestedAdd([10, [12, 14, [1], [16, [20]]], 10, 11])).toEqual(94);
});
