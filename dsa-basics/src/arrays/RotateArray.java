/*
// Problem: GFG  Rotate Array
// Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer.
// Do the mentioned change in the array in place. (array in place => not creating a new array and performing operation.)

Note: Consider the array as circular.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes [3, 4, 5, 1, 2]

Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes [8, 10, 12, 14, 16, 18, 20, 2, 4, 6].

Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get [3, 9, 1, 7] as resultant array.

Constraints:
1 ≤  arr.size(), d ≤  10^5
0 ≤  arr[i] ≤  10^5

*/

package arrays;

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();

        rotateArr(arr, d);

        System.out.print("Array after Left Rotation: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        sc.close();
    }

    // Function to rotate the array to the left by d positions
    public static void rotateArr(int[] arr, int d) {

        int n = arr.length;

        // If d is greater than the array size
        d = d % n;

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Function to reverse a part of the array
    public static void reverse(int[] arr, int i, int j) {
        // Write a code for Number Swap.
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
