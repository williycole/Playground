package MiscPuzzles;

import java.lang.reflect.Array;
import java.util.Arrays;

//    Tuck in Array
//    Create a function that takes two arrays and insert the second array in the middle of the first array.
//            Examples
//    tuckIn([1, 10], [2, 3, 4, 5, 6, 7, 8, 9]) ➞ [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//    tuckIn([15,150], [45, 75, 35]) ➞ [15, 45, 75, 35, 150]
//    tuckIn([[1, 2], [5, 6]], [[3, 4]]) ➞ [[1, 2], [3, 4], [5, 6]]
public class InsertIntoMiddle {

    public static void main(String[] args) {

        tuckIn(new int[]{1, 10}, new int[]{2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static int[] tuckIn(int[] arr1, int[] arr2) {
        // ints from arr1 to string
        String beg = String.valueOf(arr1[0]);
        String end = String.valueOf(arr1[1]);
        // arr2 to string
        String arr2String = Arrays.toString(arr2);

        // array
        String[] result = new String[3];
        result[0] = beg;
//        result[1] = arr2String;
        result[2] = end;

        //for loop to remove [] characters from arr2String
        for (int i = 0; i < arr2.length ; i++) {

        }
        System.out.println(Arrays.toString(result));











        return new int[]{1, 1, 1};
    }

}



