/*
-- GFG => Missing in Array

You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing.
Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

Constraints:
1 ≤ arr.size() ≤ 10^6
1 ≤ arr[i] ≤ arr.size() + 1

*/

package arrays;

import java.util.Scanner;

public class MissingElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Since one element is missing, the user enters the size of the given array.
        System.out.print("Enter the size of the array (n-1): ");
        int size = sc.nextInt();

        // Create an array of size n-1.
        int[] arr = new int[size];

        // Read the array elements.
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function and print the missing number.
        System.out.println("Missing Element: " + missingNum(arr));

        sc.close();
    }

    // Function to find the missing number.
    public static int missingNum(int[] arr) {

        // If the array size is n - 1, then n = arr.length + 1.
        long n = arr.length + 1;

        // Sum of numbers from 1 to n.
        long sum = n * (n + 1) / 2;

        // Calculate the sum of all elements present in the array.
        long arraySum = 0;

        // Enhanced for loop to calculate the array sum.
        for (int element : arr) {
            arraySum += element;
        }

        // The difference between the expected sum and the actual sum
        // is the missing element.
        return (int) (sum - arraySum);

        /*
         * sum and arraySum are declared as long because
         * n can be as large as 10^6.
         *
         * The expression n * (n + 1) can exceed the range of int,
         * causing integer overflow.
         *
         * The difference (sum - arraySum) is always the missing number,
         * which lies between 1 and n.
         *
         * Therefore, it is safe to cast the final result from long to int.
         */
    }
}

