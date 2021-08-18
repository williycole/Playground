package MiscPuzzles;

import java.util.Arrays;

public class Triangle {
    /*
     * Language: Java
     * Instructions: This Triangular Number Sequence is generated from a pattern of dots that form a triangle.
     * The first 5 numbers of the sequence, or dots, are: 1, 3, 6, 10, 15
     * This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.
     * Write a function that returns the number of dots when given its corresponding triangle number of the sequence.
     * Examples:
     * triangle(1) ➞ 1
     * triangle(6) ➞ 21
     * triangle(215) ➞ 23220
     * */
    public static void main(String[] args) {
        System.out.println("--------Brute Force with Array----------");
        triangleBruteForce(1);
        triangleBruteForce(6);
        triangleBruteForce(215);
        System.out.println("--------With Formula----------");
        triangle(1);
        triangle(6);
        triangle(215);
    }

    public static int triangleBruteForce(int numOfRows) {
        int numArray[] = new int[numOfRows];
        int rowCount = 0;

        for (int i = 0; i < numOfRows; i++) {
            rowCount++;
            numArray[i] = rowCount;
            //System.out.println("row number = " + rowCount);
        }
        //System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.stream(numArray).sum());

        return Arrays.stream(numArray).sum();
    }


    public static int triangle(int numOfRows) {
        int sum = numOfRows * (numOfRows + 1) / 2;
        System.out.println(sum);
        return sum;
    }
}
