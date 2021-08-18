package ArrayLists.ArraysBasics;

import java.util.Scanner;

public class MinValueChallenge {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){
       int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
           int value = array[i];
           if(value < min){
               min = value;
           }
        }
           return min;
    }



//    public static void MiscPuzzles.ShiftToLeft(String[] args) {
//        ////Reference types hold a reference to an object and not an actual object
//        System.out.println("Enter count:");
//        int count= scanner.nextInt();
//        scanner.nextLine();
//
//        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(returnedArray);
//
//        System.out.println("Min = " + returnedMin);
//
//    }
}
