/*
  Insertion sort!

  Be sure to call your function insertionSort!

  The idea here is that the beginning of your list is sorted and the everything else is assumed to be an unsorted mess.
  The outer loop goes over the whole list, the index of which signifies where the "sorted" part of the list is. The inner
  loop goes over the sorted part of the list and inserts it into the correct position in the array.

  Like bubble sort, there's a visualization mechanism available to you. Just call snapshot(myArray) at the beginning of
  your inner loop and it should handle the rest for you!

  And you put xdescribe instead of describe if you want to suspend running the unit tests.
*/

// const nums = [10, 5, 3, 8, 2, 6, 4, 7, 9, 1];
// const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const nums = [1, 5, 4, 3, 6, 8, 10, 2, 9, 7];
let totalCount = 0; //count of full iterations
let itcounter = 0; //count within 1 iteration
// for each num in nums loop through and shift around as needed
// for each num in nums iterate through the nums and sort current num
function insertionSort(nums) {
  const currentNum = nums[itcounter];
  // console.log(`totalCount: ${totalCount}`)
  // console.log(`itcounter: ${itcounter}`)
  // console.log(`currentNum: ${currentNum}`)
  const myString = nums.join(", ");
  console.log(myString);
  // console.log("-------")

  const newArray = nums.forEach(() => {
    if (currentNum > nums[itcounter + 1]) {
      let tempcurrent = nums[itcounter];
      nums[itcounter] = nums[itcounter + 1];
      nums[itcounter + 1] = tempcurrent;
    }
    ////if currentNum <= nums[itcounter + 1] do nothing
  });

  itcounter++;
  //reset itcounter for new loop and ++ totalCount
  if (itcounter >= nums.length) {
    itcounter = 0;
    totalCount++;
  }
  //Base Case, when hit return nums
  if (totalCount >= nums.length) {
    return newArray;
  }
  insertionSort(nums);
}

insertionSort(nums);

// unit tests
// do not modify the below code
test.skip("insertion sort", function () {
  const nums = [10, 5, 3, 8, 2, 6, 4, 7, 9, 1];
  insertionSort(nums);
  expect(nums).toEqual([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
});
