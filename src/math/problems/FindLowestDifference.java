package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */


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
            int min = getMin(totalResult);
            System.out.println(min);

        }

        public static int getMin(int []inputArray){
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i]< minValue){
                minValue = inputArray[i];
            }
        }

            return minValue;

        }

    }




