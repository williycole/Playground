package ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            System.out.println(false);
            return false;
        } else {
            //numOne & numTwo to Array
            String str = Integer.toString(numOne) +  Integer.toString(numTwo);
            String[] numArray = str.split("");

            //Combines both arrays into one ArrayList
            ArrayList<String> allNumArrList = new ArrayList<>(Arrays.asList(numArray));

            /*
             *Converts allNumArrList to Set,
             *HeavenlyBody can't have duplicates so we use the built in logic of HeavenlyBody to check for duplicates by checking Set size vs ArrayList size
             */
            Set<String> allNumSet = new HashSet<String>(allNumArrList);
            boolean result = allNumSet.size() < allNumArrList.size();
            System.out.println(result);
            System.out.println(allNumArrList.toString());
            return result;

        }
    }

}
