package Math;

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
//        isPerfectNumber(6);
//        isPerfectNumber(28);
//        isPerfectNumber(5);
//        isPerfectNumber(-1);
        isPerfectNumber(9);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            //gets the factors of number not including number and adds them to an ArrayList
            ArrayList<Integer> factors = new ArrayList<>();
            int factorCount = 1;
            while (factorCount != number) {
                if (number % factorCount == 0) {
                    factors.add(factorCount);
                }
                factorCount++;
            }
            //checks for perfect number by summing the factors in the ArrayList to check if sum equals number
            int sum = 0;
            for (int i = 0; i < factors.size(); i++) {
                sum += factors.get(i);
            }
            System.out.println(sum == number);
            return sum == number;
        }
    }
}
