package Math;

import java.util.ArrayList;


public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(28);
    }

    public static <ArraysList> void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid Value");
            return;
        } else {
            ArrayList<Integer> factors = new ArrayList<>();
            int factorCount = 1;
            while (factorCount <= num){
                if(num % factorCount == 0){
                    factors.add(factorCount);
                }
                factorCount++;
            }
            for (int factor: factors) {
                System.out.println(factor);
            }
        }
    }
}
