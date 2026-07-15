package arrays;

// Merge two sorted arrays into a single sorted array.
// This is one of the most important operations used in the Merge Sort algorithm.
public class Merge2SortedArrays {

    public static void main(String[] args) {

        // First sorted array
        int[] a = {2, 5, 6, 9, 20};

        // Second sorted array
        int[] b = {1, 3, 4, 5, 7, 8};

        // Create a new array large enough to store all elements
        // from both arrays.
        int[] c = new int[a.length + b.length];

        // Before merging, all elements are initialized to 0.
        System.out.print("Before Merging:"+" ");
        for (int ele : c) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Merge both sorted arrays into array 'c'.
        merge(c, a, b);

        // Print the merged sorted array.
        System.out.print("After Merging:"+" ");
        for (int ele : c) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Merges two sorted arrays (a and b) into the sorted array c.
    public static void merge(int[] c, int[] a, int[] b) {

        // i -> current index of array 'a'
        // j -> current index of array 'b'
        // k -> current index of array 'c'
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays until one of them is exhausted.
        while (i < a.length && j < b.length) {

            // Copy the smaller element into array 'c'.
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            // Move to the next position in the merged array.
            // Whether the if block or the else block executes,
            // k is always incremented.
            k++;
        }

        // At this point, one of the arrays has been completely processed.
        // Copy the remaining elements from the other array.

        if (i == a.length) {

            // Array 'a' is fully processed.
            // Copy the remaining elements of array 'b'.
            while (j < b.length) {
                c[k++] = b[j++];
            }

        } else {

            // Array 'b' is fully processed.
            // Copy the remaining elements of array 'a'.
            while (i < a.length) {
                c[k++] = a[i++];
            }
        }
    }
}

/*

Before Merging:
0 0 0 0 0 0 0 0 0 0 0

After Merging:
1 2 3 4 5 5 6 7 8 9 20

*/
