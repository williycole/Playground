package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] reverseMe = {1,2,3,4,5};
        reverse(reverseMe);
    }

    private static void reverse(int[] array) {
        int[] copyArray = array.clone();
        System.out.println("Array = " +Arrays.toString(copyArray));


        int[] reverseArray = new int[copyArray.length];
        for (int i = copyArray.length - 1; i >= 0; i--)
            reverseArray[i] = array[(copyArray.length - 1) - i];
        System.out.print("Reversed array = "+Arrays.toString(reverseArray));

    }
}
