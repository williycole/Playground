package Playground.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class NumberPalindrome {

//    public static void MiscPuzzles.ShiftToLeft(String[] args) {
//
//        isPalindrome(707);
//        isPalindrome(11212);
//        isPalindrome(-1221);
//    }

    //-----------------------------------------------------------


    public static boolean isPalindrome(int num) {
        //-->Stores individual values of num in tempArr
        String temp = Integer.toString(num);
        String[] tempArr = temp.split("");
        //System.out.println(Arrays.Arrays.toString(tempArr));

        //-->Makes Playground.ArrayList of tempArr
        //-->For getting our tempArr to and Playground.ArrayList we will look at two approaches

        //First way to do it, quick and concise
        ArrayList<String> numArr = new ArrayList<>(Arrays.asList(tempArr));

        //-->Second way to do it, brute force old school approach
        //Playground.ArrayList<String> numArr = new Playground.ArrayList<>();
        //for (int i = 0; i <tempArr.length ; i++) {
        //numArr.add(tempArr[i]);
        //}

        //-->Makes reversed Playground.ArrayList of tempArr
        ArrayList<String> revNumArr = new ArrayList<>();
        for (int i = tempArr.length; i-- > 0; ) {
            revNumArr.add(tempArr[i]);
        }

        /*   -->Checks if array contains any (+/-=%& etc...)characters and removes them.
         *    Takes use of the fact that we are working with ArrayLists and uses removeIf().
         *
         *    NOTE:
         *    Since all we have to worry about is negative numbers we could do something like
         *    numArr.removeIf("-"), but here we can also use regex as well just in case there was
         *    a random character besides "-".
         *    This could also have be done with for loops or enhanced for loops but this taking advantage of
         *    Playground.ArrayList Methods Like removeIf() is more concise.
         *
         *    --OUR APPROACH--
         *    We use Arraylist Method removeIf, regex Pattern, and asPredicate to check if any item in the Array list matches
         *    the regex expression.
         *    This approach could be expanded upon for other cases in the future so its a flexible approach increase you think you will
         *    need to refactor code in the future.
         * */
        numArr.removeIf(Pattern.compile("[-+*/]").asPredicate());
        revNumArr.removeIf(Pattern.compile("[-+*/]").asPredicate());

        //-->sout checks
        System.out.println(revNumArr);
        System.out.println(numArr);

        if (numArr.equals(revNumArr)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}



