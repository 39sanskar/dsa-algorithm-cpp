package sorting;

// Sort an array in descending order using bubble sort.
public class BubbleSortReverse {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        System.out.print("Before Array Sorting: ");
        print(arr);

        // Reverse Bubble Sort
        for (int i = 0; i < n-1; i++) {
            int swaps = 0;
            for (int j = 0; j < n-1-i; j++) {
                // swap the elements
                if (arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        System.out.print("After Array Sorting: ");
        print(arr);
    }
}

/*
Output:

Before Array Sorting:  5 -2 6 7 2 0 7 2
After Array Sorting:  7 7 6 5 2 2 0 -2

*/

/*

-- Time Complexity
-- Best Case: O(n) (when the array is already sorted in descending order)
-- Average Case: O(n²)
-- Worst Case: O(n²)

Space Complexity:  O(1) (in-place sorting)

*/
