package arrays;

// Another way to reverse an array
public class ReverseArray1 {
    public static void main(String[] args) {

        // Original array
        int[] arr = {3, 19, 56, 9, 83, 18, 34, 85, 14};

        // Length of the array
        int n = arr.length;

        // This loop runs from the first element to the last element.
        // Since it iterates over the entire array, each pair of elements
        // is swapped twice.
        for (int i = 0; i < n; i++) {

            // Store the current element in a temporary variable
            int temp = arr[i];

            // Swap the current element with its corresponding element
            // from the end of the array
            // maintain the difference (n-1) => i + (n-i-1) = (n-1).
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Print the resulting array
        System.out.print("After Reversing the Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

// After Reversing the Array: 3 19 56 9 83 18 34 85 14
// wwe will get the Original Array.

/*
Explanation:

The loop runs from i = 0 to i = n - 1.

For example, consider the array:
[1, 2, 3, 4]

Iteration 1 (i = 0):
Swap arr[0] and arr[3]
Result: [4, 2, 3, 1]

Iteration 2 (i = 1):
Swap arr[1] and arr[2]
Result: [4, 3, 2, 1]

At this point, the array is completely reversed.

However, the loop continues.

Iteration 3 (i = 2):
Swap arr[2] and arr[1]
Result: [4, 2, 3, 1]

Iteration 4 (i = 3):
Swap arr[3] and arr[0]
Result: [1, 2, 3, 4]

The array returns to its original order because every pair of elements
is swapped twice.

To reverse an array correctly, the loop should run only until the middle
of the array:

for (int i = 0; i < n / 2; i++) {
    ...
}
*/

