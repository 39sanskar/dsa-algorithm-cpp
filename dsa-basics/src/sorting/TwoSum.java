package sorting;

// 2 Sum - Find a pair with given sum
import java.util.Arrays;

// Two Sum using Sorting + Two Pointer Technique
// This program checks whether there exists a pair of elements
// whose sum is equal to the given target.

public class TwoSum {

    // Method to print the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Returns true if a pair with the given target sum exists
    public static boolean twoSum(int[] arr, int target) {

        // Step 1: Sort the array.
        // After sorting, we can apply the Two Pointer Technique.
        Arrays.sort(arr);

        // Uncomment the following lines if you want to see the sorted array.
        // System.out.print("Sorted Array: ");
        // print(arr);

        // Left pointer starts from the beginning.
        int i = 0;

        // Right pointer starts from the end.
        int j = arr.length - 1;

        // Continue until both pointers meet.
        while (i < j) {

            int sum = arr[i] + arr[j];

            // Pair found
            if (sum == target) {
                return true;
            }
            // Current sum is greater than target,
            // so move the right pointer to decrease the sum.
            else if (sum > target) {
                j--;
            }
            // Current sum is smaller than target,
            // so move the left pointer to increase the sum.
            else {
                i++;
            }
        }
        // No pair found
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {7, 0, 4, 3, 2, 8, 10};
        int target = 9;

        System.out.print("Original Array: ");
        print(arr);

        if (twoSum(arr, target)) {
            System.out.println("Pair with sum " + target + " exists.");
        } else {
            System.out.println("Pair with sum " + target + " does not exist.");
        }
    }
}

/*

-- Algorithm
- Sort the array.
- Place one pointer (i) at the beginning.
- Place another pointer (j) at the end.
- Compute the sum:
- If sum == target, return true.
- If sum > target, move the right pointer left (j--).
- If sum < target, move the left pointer right (i++).
- If the pointers meet without finding a pair, return false.

-- Time Complexity

| Operation             | Complexity     |
| --------------------- | -------------- |
| Sorting               |   O(n log n)   |
| Two Pointer Traversal |   O(n)         |
|   Overall             |   O(n log n)   |

-- Space Complexity
- Extra Space (Algorithm): O(1) because the two-pointer technique only uses a few variables.
- Sorting: Arrays.sort(int[]) uses Java's Dual-Pivot Quicksort for primitive int arrays, which uses approximately O(log n) stack space due to recursion.
- Overall Space Complexity: O(log n) (because of the sorting algorithm), not O(n) for primitive int[].

*/
