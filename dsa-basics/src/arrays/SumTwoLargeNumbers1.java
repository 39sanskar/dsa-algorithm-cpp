package arrays;

// GFG => Sum Two Large Numbers
public class SumTwoLargeNumbers1 {

    // Solution class
    static class Solution {

        // Function to find the sum of two large numbers represented as strings
        String findSum(String s1, String s2) {

            // StringBuilder is used to efficiently build the answer
            StringBuilder result = new StringBuilder();

            // i points to the last digit of s1
            int i = s1.length() - 1;

            // j points to the last digit of s2
            int j = s2.length() - 1;

            // Stores the carry generated during addition
            int carry = 0;

            // Continue until both strings are processed
            // and there is no carry left
            while (i >= 0 || j >= 0 || carry > 0) {

                // Get the current digit of s1
                // If i becomes negative, use 0
                int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;

                // Get the current digit of s2
                // If j becomes negative, use 0
                int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

                // Add both digits and the carry
                int sum = digit1 + digit2 + carry;

                // Store the last digit of the sum
                result.append(sum % 10);

                // Update the carry
                carry = sum / 10;

                // Move to the previous digits
                i--;
                j--;
            }

            // Reverse the result because digits were added
            // from right to left
            result.reverse();

            // Remove leading zeros
            while (result.length() > 1 && result.charAt(0) == '0') {
                result.deleteCharAt(0);
            }

            return result.toString();
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Test Case 1
        String s1 = "25";
        String s2 = "23";
        System.out.println("Sum = " + obj.findSum(s1, s2));

        // Test Case 2
        s1 = "2500";
        s2 = "23";
        System.out.println("Sum = " + obj.findSum(s1, s2));

        // Test Case 3
        s1 = "2";
        s2 = "3";
        System.out.println("Sum = " + obj.findSum(s1, s2));

        // Test Case 4
        s1 = "999999999999999999999999999999";
        s2 = "1";
        System.out.println("Sum = " + obj.findSum(s1, s2));
    }
}

/*

Sum = 48
Sum = 2523
Sum = 5
Sum = 1000000000000000000000000000000

*/

/*

-- Why use StringBuilder?
Strings in Java are immutable, meaning every concatenation creates a new object.
StringBuilder allows you to build the result efficiently by appending digits and reversing at the end, making it the preferred choice for problems involving large strings.

*/
