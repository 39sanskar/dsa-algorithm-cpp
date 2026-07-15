/*
-- GFG => Adding One to Array
-- Given a non-negative integer(without leading zeroes) represented as an array arr.
Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

Examples:

Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679

Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000

Constraints:
1 ≤ arr.size() ≤ 10^6
0 ≤ arr[i] ≤ 9
There are no leading zeros in the input number.

*/

package arrays;
import java.util.Collections;
import java.util.Vector;

public class AddingOne {

    // Function for adding one to the number represented by the array
    static Vector<Integer> addOne(int[] arr) {

        // Vector is used to store the answer.
        // (Vector is similar to ArrayList but synchronized.)
        Vector<Integer> ans = new Vector<>();

        int n = arr.length;

        // Initially carry is 1 because we are adding 1.
        int carry = 1;

        // Traverse the array from right to left.
        for (int i = n - 1; i >= 0; i--) {

            // If the sum is less than or equal to 9,
            // simply add it and set carry to 0.
            if (arr[i] + carry <= 9) {

                ans.add(arr[i] + carry);
                carry = 0;
            }

            // Otherwise, the sum becomes 10.
            else {

                // Store 0 and keep carry as 1.
                ans.add(0);
                carry = 1;
            }
        }

        // If carry still remains,
        // it means the number was like 999, 9999, etc.
        if (carry == 1) {
            ans.add(1);
        }

        // Reverse the Vector because digits were added
        // from right to left.
        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = {5, 6, 7, 8};
        System.out.println("Input  : [5, 6, 7, 8]");
        System.out.println("Output : " + addOne(arr1));

        System.out.println();

        // Test Case 2
        int[] arr2 = {9, 9, 9};
        System.out.println("Input  : [9, 9, 9]");
        System.out.println("Output : " + addOne(arr2));

        System.out.println();

        // Test Case 3
        int[] arr3 = {1, 2, 9};
        System.out.println("Input  : [1, 2, 9]");
        System.out.println("Output : " + addOne(arr3));

        System.out.println();

        // Test Case 4
        int[] arr4 = {0};
        System.out.println("Input  : [0]");
        System.out.println("Output : " + addOne(arr4));

        System.out.println();

        // Test Case 5
        int[] arr5 = {9};
        System.out.println("Input  : [9]");
        System.out.println("Output : " + addOne(arr5));

        System.out.println();

        // Test Case 6
        int[] arr6 = {2, 9, 9, 9};
        System.out.println("Input  : [2, 9, 9, 9]");
        System.out.println("Output : " + addOne(arr6));
    }
}

/*

Input  : [5, 6, 7, 8]
Output : [5, 6, 7, 9]

Input  : [9, 9, 9]
Output : [1, 0, 0, 0]

Input  : [1, 2, 9]
Output : [1, 3, 0]

Input  : [0]
Output : [1]

Input  : [9]
Output : [1, 0]

Input  : [2, 9, 9, 9]
Output : [3, 0, 0, 0]

*/

// (Important Question) Try Some Other Question => Adding two Arrays: [3, 5, 2, 7}, {9, 2, 1} and return its sum in an ArrayList.
