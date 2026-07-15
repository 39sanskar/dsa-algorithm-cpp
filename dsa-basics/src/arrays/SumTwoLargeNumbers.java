/*
-- GFG => Sum Two Large Numbers
Given two strings denoting non-negative numbers s1 and s2. Calculate the sum of s1 and s2.

Examples:

Input: s1 = "25", s2 = "23"
Output: "48"
Explanation: The sum of 25 and 23 is 48.

Input: s1 = "2500", s2 = "23"
Output: "2523"
Explanation: The sum of 2500 and 23 is 2523.

Input: s1 = "2", s2 = "3"
Output: "5"
Explanation: The sum of 2 and 3 is 5.

Constraints:
1 <= |s1|, |s2| <= 10^5

*/

package arrays;

public class SumTwoLargeNumbers {

    // Function to find the sum of two large numbers
    static String findSum(String s1, String s2) {

        // StringBuilder is used to efficiently build the result
        StringBuilder result = new StringBuilder();

        // Start from the last digit of both strings
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        // Variable to store the carry
        int carry = 0;

        // Continue until both strings are processed
        // and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {

            // Get the current digit from s1
            // If no digit is left, use 0
            int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;

            // Get the current digit from s2
            // If no digit is left, use 0
            int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            // Add the digits and the carry
            int sum = digit1 + digit2 + carry;

            // Store the last digit of the sum
            result.append(sum % 10);

            // Update the carry
            carry = sum / 10;

            // Move to the previous digits
            i--;
            j--;
        }

        // Reverse the result because it was built backwards
        result.reverse();

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        // Test Case 1
        String s1 = "25";
        String s2 = "23";
        System.out.println("Sum = " + findSum(s1, s2));

        // Test Case 2
        s1 = "2500";
        s2 = "23";
        System.out.println("Sum = " + findSum(s1, s2));

        // Test Case 3
        s1 = "2";
        s2 = "3";
        System.out.println("Sum = " + findSum(s1, s2));

        // Test Case 4
        s1 = "999999999999999999999999999999";
        s2 = "1";
        System.out.println("Sum = " + findSum(s1, s2));
    }
}

