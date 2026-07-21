package sorting;
// Select smallest element swap it with first element.
// Selection Sort works by repeatedly selecting the smallest element
// from the unsorted part of the array and placing it at its correct position.

public class SelectionSort {

    // Method to print the array
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};

        int n = arr.length;

        System.out.print("Original Array: ");
        print(arr);

        // Selection Sort Algorithm
        // Number of passes = n - 1
        for (int i = 0; i < n - 1; i++) {

            // Assume the first element of the unsorted part
            // is the minimum element.
            int min = arr[i];  // min stores the current smallest value.
            int min_dex = i;   // min_dex stores the index of the smallest value.

            // Search for the minimum element in the remaining
            // unsorted part of the array.
            for (int j = i + 1; j < n; j++) {  // the inner loop does go until n-1, but it starts from i+1, not from 0. This is the key idea of Selection Sort.
                if (arr[j] < min) {
                    min = arr[j];
                    min_dex = j;
                }
            }

            // Swap the smallest element with the first element
            // of the unsorted part.
            int temp = arr[i];
            arr[i] = arr[min_dex];
            arr[min_dex] = temp;
        }
        System.out.print("Sorted Array: ");
        print(arr);
    }
}

/*

-- Output:
Original Array: 5 -2 6 7 2 0 7 2
Sorted Array: -2 0 2 2 5 6 7 7

*/

/*

-- Important Interview Notes
-- Algorithm Name: Selection Sort
-- Idea: In every pass, find the smallest element from the unsorted part and place it at its correct position.
-- Number of Passes: n - 1
-- Comparisons: n(n - 1) / 2
-- Best Case Time Complexity: O(n²)
-- Average Case Time Complexity: O(n²)
-- Worst Case Time Complexity: O(n²)
-- Space Complexity: O(1) (In-place sorting algorithm)
-- Stable: No (equal elements may change their relative order)
-- Adaptive: No (it performs the same number of comparisons even if the array is already sorted)

*/

