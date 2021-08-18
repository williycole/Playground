package MiscPuzzles;
/*
* Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
1. Extract the last digit of the given number using the remainder operator.
2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
*  Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will
* produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed
* number would be 432. The method  reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One",
* but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method
* getDigitCount(0); should return 1 since there is only 1 digit
* getDigitCount(123); should return 3
* getDigitCount(-12); should return -1 since the parameter is negative
* getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method
* reverse(-121); should  return -121
* reverse(1212); should return  2121
* reverse(1234); should return 4321
* reverse(100); should return 1
Example Input/Output - numberToWords method
* numberToWords(123); should print "One Two Three".
* numberToWords(1010); should print "One Zero One Zero".
* numberToWords(1000); should print "One Zero Zero Zero".
* numberToWords(-12); should print "Invalid Value" since the parameter is negative.

HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero".
* To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
*
* */
import java.util.*;

public class NumbersTwoWordsMySolution {
    public static void main(String[] args) {
        numberToWords(5210);
        reverse(-1);
        numberToWords(1);
        getDigitCount(1);
        getDigitCount(5210);
    }

    public static int reverse(int number) {
        String temp = Integer.toString(number);
        String[] numArr = temp.split("");
        ArrayList<String> numArrayList = new ArrayList<>(Arrays.asList(numArr));
        Collections.reverse(numArrayList);

        /* Next I use String builder to aid in concatenating the values into a string
         * to the finally return the whole string as an integer
         * EX. return 123 with the aid of string builder instead of return 6 */
        StringBuilder result = new StringBuilder();

        //Here I check for only numbers and leave out checking for "-", and append the numbers to the stringBuilder result
        for (String item : numArrayList) {
            if (!item.equals("-")) {
                result.append(item);
            }
        }
        /* Next I check to see if the ArrayList originally contained a "-" and if so I insert it
         * at the beginning of my string builder*/
        if (numArrayList.contains("-")) {
            result.insert(0, "-");
        }
        System.out.println(result);
        //Finally I return the final result as an int
        return Integer.parseInt(String.valueOf(result));
    }

    public static void numberToWords(int number) {
        // Check to see if number is less than zero and if so sout Invalid Value
        if (number <= -1) {
            System.out.println("Invalid Value");
        } else {
            /* If the number was not invalid I similarly as in previous code above and make it an
             * ArrayList to take advantage of built in functionality*/
            String temp = Integer.toString(number);
            String[] numArr = temp.split("");
            ArrayList<String> numArrList = new ArrayList<>(Arrays.asList(numArr));
            /* Here I make a Hash make to check Key/Value pairs based on the values in my ArrayList
             * I handle the fact that the values in the ArrayList are strings with a parseInt below*/
            HashMap<Integer, String> keyValueMap = new HashMap<>();
            keyValueMap.put(0, "Zero");
            keyValueMap.put(1, "One");
            keyValueMap.put(2, "Two");
            keyValueMap.put(3, "Three");
            keyValueMap.put(4, "Four");
            keyValueMap.put(5, "Five");
            keyValueMap.put(6, "Six");
            keyValueMap.put(7, "Seven");
            keyValueMap.put(8, "Eight");
            keyValueMap.put(9, "Nine");
            /* Here I again make use of StringBuilder and then check if my values are contained within my HashMap,
             * and if so I append the value from keyValueMap corresponding with the value of my numArrList at the given index*/
            StringBuilder stringOfWords = new StringBuilder();
            for (int i = 0; i < numArr.length; i++) {
                if (keyValueMap.containsKey(Integer.parseInt(numArrList.get(i)))) {

                    stringOfWords.append(keyValueMap.get(Integer.parseInt(numArrList.get(i)))).append(" ");
                }
            }
            //finally I sout the stringOfWords
            System.out.println(stringOfWords);
        }
    }

    /* Here I once again take it to and ArrayList
     * if the ArrayList contains a negative I return -1
     * else I return the length which is the same as the amount of digits*/
    public static int getDigitCount(int number) {
        String temp = Integer.toString(number);
        String[] numArr = temp.split("");
        ArrayList<String> numArrList = new ArrayList<>(Arrays.asList(numArr));
        if (numArrList.contains("-")) {
            return -1;
        } else {
            return numArr.length;
        }
    }
}
