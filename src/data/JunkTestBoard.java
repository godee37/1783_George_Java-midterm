package data;

import java.util.Scanner;

public class JunkTestBoard {

//    public static void main(String[] args) {
//        int array[] = new int[]{10, 11, 88, 2, 12, 120};
//
////        // Calling getMax() method for getting max value
////        int max = getMax(array);
////        System.out.println("Maximum Value is: " + max);
//
//        // Calling getMin() method for getting min value
//        int min = getMin(array);
//        System.out.println("Minimum Value is: " + min);
//    }
//
////    // Method for getting the maximum value
////    public static int getMax(int[] inputArray) {
////        int maxValue = inputArray[0];
////        for (int i = 1; i < inputArray.length; i++) {
////            if (inputArray[i] > maxValue) {
////                maxValue = inputArray[i];
////            }
////        }
////        return maxValue;
////    }
//
//    // Method for getting the minimum value
//    public static int getMin(int[] inputArray) {
//        int minValue = inputArray[0];
//        for (int i = 1; i < inputArray.length; i++) {
//            if (inputArray[i] < minValue) {
//                minValue = inputArray[i];
//            }
//        }
//        return minValue;
//    }
static int getMissingNo(int a[], int n)
{
    int i, total;
    total = (n + 1) * (n + 2) / 2;
    for (i = 0; i < n; i++)
        total -= a[i];
    return total;
}

    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int miss = getMissingNo(a, 5);
        System.out.println(miss);
    }
}