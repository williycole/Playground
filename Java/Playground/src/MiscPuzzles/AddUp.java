package MiscPuzzles;

import java.util.ArrayList;

public class AddUp {
    public static void main(String[] args) {
        addUp(4);
        addUp(13);
        addUp(600);
    }

    public static int addUp(int args) {
        /*
         * Brute force approach
         * */
//        int sum = 0;
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for(int i = 1; i < args + 1; i++){
//            numbers.add(i);
//        }
//
//        for (Integer number: numbers) {
//            sum += number;
//        }


        /*
         * Simple brute force approach
         * */
        int sum = 0;
        for (int i = 1; i <= args; i++) {
            sum += i;
        }


        /*
        * Above solution is having time complexity n, can we reduce it lets see - thanks to Gauss formula n *(n + 1) / 2
        * */
        sum = (args * (args + 1) / 2);
        System.out.println(sum);
        return sum;
    }
}
