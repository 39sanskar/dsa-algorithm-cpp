/*
-- GFG => Segregate 0's and 1's

Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array

-- Examples

Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].

Input: arr[] = [1, 1]
Output: [1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1]

Constraints:
1 ≤ arr.size() ≤ 10^5
0 ≤ arr[i] ≤ 1

*/

package arrays;

import java.util.Scanner;

public class Segregate0sAnd1s {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements (Only 0 and 1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        segregate(arr);

        System.out.print("Array After Segregation: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        sc.close();
    }

    // Function to segregate 0's and 1's
    public static void segregate(int[] arr) {

        // left points to the beginning of the array
        int left = 0;

        // right points to the end of the array
        int right = arr.length - 1;

        // Continue until both pointers meet
        while (left < right) {

            // Move the left pointer until a 1 is found
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Move the right pointer until a 0 is found
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap the misplaced elements
            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move both pointers after swapping
                left++;
                right--;
            }
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

/*

Enter Array Size: 10
Enter Array Elements (Only 0 and 1): 0 1 0 1 0 0 1 1 1 0
Array After Segregation: 0 0 0 0 0 1 1 1 1 1

Output:
Array After Segregation:
0 0 0 0 0 1 1 1 1 1

*/

/*

-- DRY RUN

Initial array:  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]

left = 0;
right = 1;

-- Step 1:
arr[left] = 0
Move left

left = 1

arr[right] = 0
Stop right

Swap:
1 ↔ 0   // In this step arr[1] is swap with arr[9]

[0, 0, 0, 1, 0, 0, 1, 1, 1, 1]

left = 2
right = 8

-- Step 2

Move left:  left = 3
Move right: right = 5

Swap:
1 ↔ 0

[0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

left = 4
right = 4

Loop ends.

-- Why does this work?
The left pointer searches for the first misplaced 1.
The right pointer searches for the first misplaced 0.
When both are found, they are swapped.
Every element is visited at most once.

Time Complexity:  O(n)
Space Complexity: O(1)

*/
