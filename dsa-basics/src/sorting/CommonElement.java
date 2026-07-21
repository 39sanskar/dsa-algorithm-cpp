/*

-- Given two integer arrays a[] and b[], return an array containing all elements common to both arrays in sorted order.

If an element appears multiple times in both arrays, it should appear in the output as many times as it is common to both arrays.

Example:

Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
Output: [2, 2, 3]
Explanation: The common elements in sorted order are 2, 2, 3.

Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
Output: [3, 7, 9]
Explanation: The common elements in sorted order are 3, 7, 9.

Constraints:

1 ≤ a.size(), b.size() ≤ 10^5
1 ≤ a[i], b[i] ≤ 10^5

Expected Complexities
Time Complexity: O((n+m)*log(n+m))
Auxiliary Space: O(n + m)

*/

package sorting;

import java.util.ArrayList;
import java.util.Arrays;

// Find Common Elements in Two Arrays
// Approach:
// 1. Sort both arrays.
// 2. Use the Two Pointer Technique.
// 3. Compare elements of both arrays.
// 4. If elements are equal, add the element to the answer.
// 5. Otherwise, move the pointer pointing to the smaller element.

public class CommonElement {
    // Intersection of the Array
    static class Solution {
        public static ArrayList<Integer> commonElements(int[] a, int[] b) {
            // Sort both arrays.
            Arrays.sort(a);
            Arrays.sort(b);

            // Pointer for array 'a'
            int i = 0;

            // Pointer for array 'b'
            int j = 0;

            // Stores all common elements.
            ArrayList<Integer> ans = new ArrayList<>();

            // Traverse both arrays until one of them ends.
            while (i < a.length && j < b.length) {
                // If both elements are equal, add the element to the answer and move both pointers.
                if (a[i] == b[j]) {
                    ans.add(a[i]);
                    i++;
                    j++;
                }
                // If the current element of array 'a' is smaller, move pointer 'i' to get a larger element.
                else if (a[i] < b[j]) {
                    i++;
                }
                // If the current element of array 'b' is smaller, move pointer 'j' to get a larger element.
                else {
                    j++;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {

        int[] a = {5, 1, 2, 7, 3, 2};
        int[] b = {2, 4, 7, 2, 8};

        ArrayList<Integer> result = Solution.commonElements(a, b);
        System.out.println("Common Elements: " + result);
    }
}

/*

-- Output:
Common Elements: [2, 2, 7]

*/

/*

-- Time Complexity
Sorting first array: O(n log n)
Sorting second array: O(m log m)
Two-pointer traversal: O(n + m)

Overall Time Complexity:  O(n log n + m log m)

-- Space Complexity
Answer list: O(k), where k is the number of common elements.
Apart from the output list, the algorithm uses only a few variables.
Auxiliary Space: O(1) (excluding the output list).

*/
