package MiscPuzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumbersToWords {
    public static void main(String[] args) {
        numberToWords(5210);
    }

    public static int reverse(int number) {
        int reversed = 0;
        int workNumber = 0;

        while (number != 0) {
            workNumber = number % 10;
            number /= 10;
            reversed += workNumber;
            if (number != 0) {
                reversed *= 10;
            }
        }
        return reversed;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int numDigit = getDigitCount(number);
        int revDigit = getDigitCount(reverse(number));
        int zerosToPrint = numDigit - revDigit;
        number = reverse(number);
        int printNumber = 0;

        while (number > 0) {
            printNumber = number % 10;
            switch (printNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;

        }


        for (int i = 0; i < zerosToPrint; i++) {
            System.out.println("Zero");
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        for (int i = 0; number > 0; i++) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }
}
