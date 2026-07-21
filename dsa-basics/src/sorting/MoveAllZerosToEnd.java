/*
-- GFG => Move All Zeroes to End
-- You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.
The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.

Constraints:
1 ≤ arr.size() ≤ 10^5
0 ≤ arr[i] ≤ 10^5

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)

*/

package sorting;
// Move all zeros to the end of the array while maintaining
// the relative order of the non-zero elements.
// Approach: Bubble Sort (Repeatedly swap 0 with the next element)

public class MoveAllZerosToEnd {
    // Method to print the array
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to move all zeros to the end
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        // Bubble Sort approach
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // If current element is 0, swap it with the next element
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.print("Before Moving Zeros: ");
        print(arr);
        pushZerosToEnd(arr);
        System.out.print("After Moving Zeros : ");
        print(arr);
    }
}

/*
Output:

Before Moving Zeros: 1 2 0 4 3 0 5 0
After Moving Zeros : 1 2 4 3 5 0 0 0

*/

// Another Approach: Two Pointer Algorithm
