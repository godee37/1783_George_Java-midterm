package math.problems;

import java.util.ArrayList;
import java.util.List;

import databases.ConnectToSqlDB;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */

        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int minimumValue = minimumNumber(array);
        System.out.println("The minimum value of the array is:\n==================================\n " + minimumValue);
        int maximumValue = maximumNumber(array);
        System.out.println("The maximum value of the array is:\n==================================\n " + maximumValue);

    }

    public static int minimumNumber(int[] inputArray) {
        int miniValue = inputArray[0];
        for (int num = 0; num < inputArray.length; num++) {
            if (inputArray[num] < miniValue) {
                miniValue = inputArray[num];
            }
        }

        return miniValue;
    }

    public static int maximumNumber(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int num = 0; num < inputArray.length; num++) {
            if (inputArray[num] > maxValue) {
                maxValue = inputArray[num];
            }
        }
        return maxValue;
    }
}