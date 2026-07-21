/*

-- GFG => Check Sorted Array
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.

Constraints:
1 ≤ arr.size ≤ 10^6
-10^9 ≤ arr[i] ≤ 10^9

*/

package sorting;

// Important code keep in mind.
public class CheckArraySortedOrNot {
        // Method to check whether the array is sorted
        static boolean isSorted(int[] arr) {

            // An array with 0 or 1 element is always sorted
            if (arr.length <= 1) {
                return true;
            }

            // Compare every element with its next element.
            for (int i = 0; i < arr.length - 1; i++) {
                // If the current element is greater than the next element, the array is not sorted.
                if (arr[i] > arr[i+1]) {
                    return false;
                }
            }
            return true; // No unsorted pair found
        }

        public static void main(String[] args) {
            int[] arr1 = {10, 20, 30, 40, 50};
            int[] arr2 = {90, 80, 100, 70, 40, 30};
            int[] arr3 = {9};
            int[] arr4 = {};

            System.out.println("Array 1 is sorted: "+ isSorted(arr1)); // true
            System.out.println("Array 2 is sorted: "+ isSorted(arr2)); // false
            System.out.println("Array 3 is sorted: "+ isSorted(arr3)); // true
            System.out.println("Array 4 is sorted: "+ isSorted(arr4)); // true
        }
}

/*
 -- Check if an Array is Sorted in Ascending Order

 -- Logic:
 1. Traverse the array from the first element to the second-last element.
 2. Compare the current element with the next element.
 3. If arr[i] > arr[i + 1], the array is NOT sorted.
 4. Return false immediately.
 5. If the loop completes without finding any such pair, the array is sorted.

 -- Why do we use arr.length - 1 in the loop?

 -- We compare:  arr[i] and arr[i + 1]

 -- The last valid index of an array is:  arr.length - 1

 Therefore, i should only go up to arr.length - 2.

 Example:  arr = {10, 20, 30, 40}      length = 4

 --  Valid comparisons:
 *      arr[0] and arr[1]
 *      arr[1] and arr[2]
 *      arr[2] and arr[3]

 * If i becomes 3:  arr[3] and arr[4]   // arr[4] does not exist

 * This would cause an ArrayIndexOutOfBoundsException.

 * Hence, the loop condition is:
 *      i < arr.length - 1

 -- Time Complexity : O(n)
 -- Space Complexity: O(1)

*/

/*

-- If we wrote i < arr.length ?

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > arr[i + 1]) {
        return false;
    }
}

Now i takes the values:  0, 1, 2, 3

When i = 3;
arr[i]     // arr[3]
arr[i + 1] // arr[4]
But arr[4] does not exist because the last valid index is 3
Java will throw => ArrayIndexOutOfBoundsException

-- General Rule : Whenever you compare an element with its next element:
arr[i] and arr[i + 1]

-- the loop should stop one element before the end:
for (int i = 0; i < arr.length - 1; i++)

Similarly, if you compare an element with the previous element:
arr[i] and arr[i - 1]

then you should start from:
for (int i = 1; i < arr.length; i++)       /// (Very Important)
-- because arr[-1] is invalid

-- Conclusion:
We use: i < arr.length -1  because the code accesses; arr[i+1]
and we must ensure that i + 1 never becomes equal to arr.length. The last valid index of an array is always:  arr.length - 1
This prevents an ArrayIndexOutOfBoundsException.

*/
