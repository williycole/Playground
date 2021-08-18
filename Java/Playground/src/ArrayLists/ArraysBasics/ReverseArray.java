package ArrayLists.ArraysBasics;

import java.util.Arrays;


public class ReverseArray {
    private static void reverse(int[] someArray){
        System.out.println("Array is: " + Arrays.toString(someArray));

        for (int i = 0; i < someArray.length / 2; i++) {
            int temp = someArray[i];
            someArray[i] = someArray[someArray.length - i - 1];
            someArray[someArray.length - i - 1] = temp;
        }
            System.out.println("Reversed Array is: " + Arrays.toString(someArray));
    }


//    public static void MiscPuzzles.ShiftToLeft(String[] args) {
//        int[] array = {1,2,3,4};
//        reverse(array);
//    }
}
