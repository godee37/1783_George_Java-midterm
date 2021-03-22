package math.problems;

import java.util.Scanner;

public class PrimeNumber {

    /*
    Write a method to print the list of prime numbers from 2 to 1,000,000
        Solving the problem should be your first priority, however bonus points if you can figure out how to
        improve algorithmic efficiency

     Print out the prime numbers in the given range.
     */


    public static void main(String[] args) {
        getPrimeNumbers();

    }

    public static void getPrimeNumbers() {
        // variable declaration
        int start;
        int last;
        int startNum = 2;
        int lastNum = 1000000;


        Scanner prompt = new Scanner(System.in);

        System.out.println("Enter 2 to start: ");
        start = prompt.nextInt();

        //Check user input is 2
        if (start < startNum || start > startNum) {
            System.out.println("The program can accept only 2");
        } else {
            System.out.println("Enter 1000 as the last number: ");
            last = prompt.nextInt();

            //Check user input is 1000
            if (last < lastNum || last > lastNum) {
                System.out.println("The program can accept only 1000");
            } else {
                for (int i = start; i <= last; i++) {
                    if (i % 2 == 1) {
                        System.out.println(i);

                    }
                }

            }

        }

    }
}

