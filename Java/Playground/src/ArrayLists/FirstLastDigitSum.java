package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int num) {
        //-->Stores individual values of num in tempArr
        String temp = Integer.toString(num);
        String[] tempArr = temp.split("");
        //System.out.println(Arrays.Arrays.toString(tempArr));

        //-->Makes ArrayList of tempArr
        ArrayList<String> numArr = new ArrayList<>(Arrays.asList(tempArr));
        //-->Checks if number is negative
        if (numArr.contains("-")) {
            System.out.println(-1);
            return -1;
        } else {
        //-->Use Integer.parseInt to work with strings as Integers
            if (numArr.size() == 1) {
                System.out.println(Integer.parseInt(numArr.get(0)) + Integer.parseInt(numArr.get(0)));
                return Integer.parseInt(numArr.get(0)) + Integer.parseInt(numArr.get(0));
            } else {
                System.out.println(Integer.parseInt(numArr.get(0)) + Integer.parseInt(numArr.get(numArr.size() - 1)));
                return Integer.parseInt(numArr.get(0)) + Integer.parseInt(numArr.get(numArr.size() - 1));
            }
        }
    }


}



