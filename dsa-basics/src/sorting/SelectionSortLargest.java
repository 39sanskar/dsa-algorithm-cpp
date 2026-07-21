package sorting;

// Selection Sort (Ascending Order)
// Method: Find the largest element in the unsorted part
// and place it at the last position.

public class SelectionSortLargest {

    // Method to print the array
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Number of passes = n - 1
        for (int i = n - 1; i > 0; i--) {

            // Assume the first element is the largest
            int max = arr[0];
            int largestIndex = 0;

            // Find the largest element from index 0 to i
            // We assume the first element is the largest.
            // We will compare every other element with it.

            for (int j = 1; j <= i; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                    largestIndex = j;
                }
            }

            // Swap the largest element with the last
            // element of the unsorted part.
            int temp = arr[i];
            arr[i] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        System.out.print("Before Sorting: ");
        print(arr);

        selectionSort(arr);

        System.out.print("After Sorting : ");
        print(arr);
    }
}

/*

-- Why does j start from 1?

for (int j = 1; j <= i; j++)

-- Since we already assumed:
max = arr[0];  // there is no need to compare arr[0] with itself.

If we started from:  j = 0;

the first comparison would be  => if (arr[0] > arr[0])

which is  5 > 5  => This is always false.

So that comparison is unnecessary.

That's why we start from   j = 1;

*/

/*

-- Initial Array

| Pass | `i` | Unsorted Part (`0` to `i`) | Largest Element | Largest Index |        Swap       | Array After Swap   |
| :--: | :-: | :------------------------- | :-------------: | :-----------: | :---------------: | :----------------- |
|   1  |  7  |  5 -2 6 7 2 0 7 2          |        7        |       3       |  arr[3] ↔ arr[7]  |  5 -2 6 2 2 0 7 7  |
|   2  |  6  |  5 -2 6 2 2 0 7            |        7        |       6       |  arr[6] ↔ arr[6]  |  5 -2 6 2 2 0 7 7  |
|   3  |  5  |  5 -2 6 2 2 0              |        6        |       2       |  arr[2] ↔ arr[5]  |  5 -2 0 2 2 6 7 7  |
|   4  |  4  |  5 -2 0 2 2                |        5        |       0       |  arr[0] ↔ arr[4]  |  2 -2 0 2 5 6 7 7  |
|   5  |  3  |  2 -2 0 2                  |        2        |       0       |  arr[0] ↔ arr[3]  |  2 -2 0 2 5 6 7 7  |
|   6  |  2  |  2 -2 0                    |        2        |       0       |  arr[0] ↔ arr[2]  |  0 -2 2 2 5 6 7 7  |
|   7  |  1  |  0 -2                      |        0        |       0       |  arr[0] ↔ arr[1]  |  -2 0 2 2 5 6 7 7  |


 */