package arrays;

// Two Sum: Given an array arr[] of n integers and a target value,
// check if there exists a pair whose sum equals the target.
// This is a variation of the 2-Sum problem.

public class TwoSum {

    // [Naive Approach] => Time Complexity: O(n²), Space Complexity: O(1)
    static boolean twoSum(int[] arr, int target) {

        int n = arr.length;

        // For each element arr[i], check every other element arr[j] that comes after it.
        for (int i = 0; i < n; i++) {
            // Check every element after arr[i]
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair equals the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        // If no pair is found after checking all possibilities.
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 1, 0, 5};
        int target = -2;

        if (twoSum(arr, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


/*

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.

Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.

*/

/*
-- Other Approaches:

Nested Loops (Brute Force) – Understand the basic logic.
Sorting + Two Pointers – Learn the two-pointer technique.
HashSet – Learn how hashing improves lookup performance.
HashMap – The standard interview solution for returning indices.

*/

