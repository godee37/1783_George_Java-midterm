package math.problems;

import java.util.Arrays;
import java.util.Collections;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */
                    array2();
                  //  array(array2());
    }
        public static char[] array2 () {
            int result;
            // first array
            int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};

            // second array
            int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

            // determines length of firstArray
            int var1 = array1.length;

            // determines length of secondArray
            int var2 = array2.length;

            // resultant array size
            int output = var1 + var2;

            // create the resultant array
            int[] totalResult = new int[output];


            // using the pre-defined function arraycopy
          System.arraycopy(array1, 0, totalResult, 0, var1);
           System.arraycopy(array2, 0, totalResult, var1, var2);


            // prints the resultant array
            System.out.println(Arrays.toString(totalResult));


            return new char[0];
        }

        public static char[] array (int value2) {
//        int[] value1 = new int[]{4, 9, 1, 32, 13};
            char[] value1 = FindLowestDifference.array2();
            Arrays.sort(value1);
            int minDiff = value1[1] - value1[0];
            for (int i = 2; i != value1.length; i++) {
                minDiff = Math.min(minDiff, value1[i] - value1[i - 1]);
            }

 // System.out.println(minDiff);

            return value1;
        }

    }




