package math.problems;

public class FindMissingNumber {


        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */

/*
The sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements
 in the array and subtract it from the sum of first n natural numbers, it will be the value of the
 */

    public static void main(String args[]) {

        /* program to test above function */
        System.out.println("Executing the first possible way to find missng number: \n================================\n" + getMissingNumber());

        //executing the second method
        int a[] = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int miss = getMissingNo(a, 9);
        System.out.println("Executing the way: \n================================\n" + miss);
    }
    static int getMissingNumber()
    {
        int array[] = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int i, total, arrayLength = 9;
        total = (arrayLength + 1) * (arrayLength + 2) / 2;
        for (i = 0; i < arrayLength; i++)
            total -= array[i];
        return total;
    }
// second method
static int getMissingNo(int a[], int n)
{
    int i, total;
    total = (n + 1) * (n + 2) / 2;
    for (i = 0; i < n; i++)
        total -= a[i];
    return total;
}

    }

