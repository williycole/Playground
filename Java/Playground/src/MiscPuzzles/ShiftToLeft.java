package MiscPuzzles;

import java.text.DecimalFormat;

public class ShiftToLeft {
    /*
    Write a function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.
    10 << 3 = 10 * 2^3 = 10 * 8 = 80
    -32 << 2 = -32 * 2^2 = -32 * 4 = -128
    5 << 2 = 5 * 2^2 = 5 * 4 = 20
    */
    public static void main(String[] args) {
        shiftToLeft(10, 3); //-> 80
        shiftToLeft(5, 2); //--> 20
        shiftToLeft(10, 3); //--> 80
        shiftToLeft(-32, 2); //--> -128
        shiftToLeft(-6, 5); //--> -192
        shiftToLeft(12, 4); //--> 192
        shiftToLeft(46, 6); //--> 2944
    }

    public static int shiftToLeft(double x, double y){
        int shifted = (int) (x * Math.pow(2, y));
        new DecimalFormat("#").format(shifted);
        System.out.println(shifted);
        return shifted;
    }
}
