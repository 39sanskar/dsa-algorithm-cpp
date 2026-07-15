/*
-- GFG => Wave Array Problem
-- Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words,
arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on.
If there are multiple solutions, find the lexicographically smallest one.

-- Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

Examples:
Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.

Input: arr[] = [1]
Output: [1]

Constraints:
1 ≤ arr.size ≤ 10^6
0 ≤ arr[i] ≤10^9

*/

package arrays;

import java.util.Arrays;

public class WaveArray {
    // Function to convert the array into wave form
    static void sortInWave(int[] arr) {

        // Traverse the array by taking two elements at a time
        for (int i = 0; i < arr.length; i+=2) {

            // If i is the last index, there is no next element to swap.
            // So, stop the loop. specially in (Odd size Array)
            if (i == arr.length -1 ){
                break;
            }

            // Swap the current element with the next element.
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {2, 4, 7, 8, 9, 10};

        System.out.print("Before Wave in Sort: ");
        System.out.println(Arrays.toString(arr));

        // Call the function
        sortInWave(arr);

        System.out.print("After Wave in Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}

/*

Before Wave in Sort: [2, 4, 7, 8, 9, 10]
After Wave in Sort: [4, 2, 8, 7, 10, 9]

*/

/*
Note:

This solution is correct only if the array is already sorted, which is the version of the problem on GeeksforGeeks.
If the input array is not sorted, you should first sort the array and then perform the adjacent swaps to obtain a valid wave array.

*/