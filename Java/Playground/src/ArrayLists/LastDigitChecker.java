package ArrayLists;


import java.util.*;

public class LastDigitChecker {
    public static void main(String[] args) {
//        hasSameLastDigit(41, 22, 71);
//        hasSameLastDigit(9, 99, 999);
//        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(22, 32, 42);
//        isValid(10);
//        isValid(9);
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (!isValid(numOne) || !isValid(numTwo) || !isValid(numThree)) {
            System.out.println(false);
            return false;
        } else {
            //converts numbers to strings
            String temp = Integer.toString(numOne) + Integer.toString(numTwo) + Integer.toString(numThree);

            //adds all numbers to an array
            String[] numArray = temp.split("");

            //converts array off numbers to arraylist
            ArrayList<String> numArrayList = new ArrayList<>(Arrays.asList(numArray));

            //loops through array list and removes elements at odd indexes
            Iterator<String> itr = numArrayList.iterator();
            int i = 0;
            while(itr.hasNext()) {
                itr.next();
                if(i % 2 == 0) {
                    itr.remove();
                }
                i++;
            }

            //converts array list to Set to check for duplicates values based on arraylist size vs set size
            Set<String> allNumSet = new HashSet<String>(numArrayList);

            //returns true or false based on result of above built in logic, ie: sets can't contain duplicates and array lists can
            boolean result = allNumSet.size() < numArrayList.size();


            System.out.println(result);
            System.out.println(numArrayList.toString());
            return result;
        }
    }

    public static boolean isValid(int num) {
//        System.out.println((num >= 10 && num <= 1000));
        return (num >= 10 && num <= 1000);
    }
}
