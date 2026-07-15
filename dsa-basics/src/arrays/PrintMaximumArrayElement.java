package arrays;

import java.util.Scanner;

// Print the Maximum element in the array
public class PrintMaximumArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the Array size (length).
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        // Initialization
        int[] arr = new int[n];

        // Input
        System.out.print("Enter Elements of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the maximum elements of an Array
        int max = arr[0];  // initialize the first element of an array as the max of the array.
        // if given elements of an array is positive then initialize max as a -1. (if all elements of an array is negative then it create problem)
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];  // logical part of the code
        }
        System.out.println("The Required maximum element of an Array is: "+max);

        sc.close();
    }
}


// Solution of the Practice Platform

/*

class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}

*/
