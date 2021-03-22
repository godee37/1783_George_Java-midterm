package math.problems;

import java.util.Scanner;

public class Factorial<i, fact> {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
//Factorial of any given number using Recursion

        //variable declaration
        int number;
        long result;

        //Create input object of a Scanner class
        Scanner input = new Scanner(System.in);
        //Prompt user for input
        System.out.print("Enter number to calculate:  ");

        //Store user input into a variable
        number = input.nextInt();

        long factorial = calFactorial(number);

        //print out factorial
        System.out.println("Factorial of " + number + " = " + factorial);

        //print out second method
        getFactorial();

    }

    ////Factorial of any given number using Iteration
    public static long calFactorial(int numbers) {


        if (numbers >= 1)
            return numbers * calFactorial(numbers - 1);
        else
            return 1;
    }

    public static void getFactorial() {
        int num;
        int factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number: ");

        int number = input.nextInt();//It is the number to calculate factorial
        if (number <1) {
            System.out.println("Enter legitimate number ");
        }else{

            for (num = 1; num <= number; num++) {
                factorial = factorial * num;

            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

    }
}