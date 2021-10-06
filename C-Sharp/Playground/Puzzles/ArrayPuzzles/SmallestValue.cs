using System;
using System.Linq;
/*
Smallest value of an array
Write a function that can return the smallest value of an array or the index of that value.
The function's 2nd parameter will tell whether it should return the value or the index.
Assume the first parameter will always be an array filled with at least 1 number and no duplicates.
Assume the second parameter will be a string holding one of two values: 'value' and 'index'.
*/
public class SmallestValue
{
  public static int GetSmallestValue(int[] arr, string valOrIndex)
  {
    // Smallest Value
    int res = arr.Min();

    Console.WriteLine(valOrIndex == "value" ? res : Array.IndexOf(arr, res));
    return valOrIndex == "value" ? res : Array.IndexOf(arr, res);

  }
}