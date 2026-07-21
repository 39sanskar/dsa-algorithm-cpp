/*
-- Problem: GFG Selection Sort
-- Given an array arr, use selection sort to sort arr[] in increasing order.

Examples :

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.


Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Input: arr[] = [38, 31, 20, 14, 30]
Output: [14, 20, 30, 31, 38]

Constraints:
1 ≤ arr.size() ≤ 10^3
1 ≤ arr[i] ≤ 10^6

Expected Complexities:
Time Complexity: O(n^2)
Auxiliary Space: O(1)

*/

package sorting;

public class SelectionSort1 {
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){ // n-1 passes
            int min = Integer.MAX_VALUE, min_dex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_dex = j;
                }
            }
            // swap the elements
            int temp = arr[i];
            arr[i] = arr[min_dex];
            arr[min_dex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("Before Sorting: ");
        print(arr);
        selectionSort(arr);
        System.out.print("After Sorting: ");
        print(arr);
    }
}

/*
-- Output:
Before Sorting: 10 9 8 7 6 5 4 3 2 1
After Sorting: 1 2 3 4 5 6 7 8 9 10

*/
