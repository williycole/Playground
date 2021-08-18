package ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int num) {
        String temp = Integer.toString(num);
        String[] strArr = temp.split("");
        ArrayList<String> intArr = new ArrayList<>(Arrays.asList(strArr));
        if(Arrays.stream(strArr).anyMatch(Pattern.compile("-").asPredicate())){
            System.out.println(-1);
            return -1;
        } else {
            int sum = 0;
            for(int i = 0; i < intArr.size(); i++) {
                if(Integer.parseInt(intArr.get(i))  % 2 == 0){
                    sum += Integer.parseInt(intArr.get(i));
                }
            }
                System.out.println(sum);
            return sum;
        }
    }


}

