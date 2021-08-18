package MiscPuzzles;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        boolean first = true;
        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int userNumber = scanner.nextInt();

                sum += userNumber;
                counter++;
                avg = Math.round((double) sum/counter);

            }
            else {
                if (first) {
                    break;
                }

            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}