package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        // Set it to the number of elements you want in the Fibonacci Series
        int fibonacci = 40;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of "+fibonacci+" numbers:");

        for (int i = 1; i <= fibonacci; ++i)
        {
            System.out.print(previousNumber+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }


    }


}
