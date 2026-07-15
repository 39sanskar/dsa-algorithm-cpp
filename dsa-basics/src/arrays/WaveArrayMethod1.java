package arrays;

import java.util.Arrays;

public class WaveArrayMethod1 {

    // Function to convert the array into wave form
    static void sortInWave(int[] arr) {

        // Traverse the array in pairs.
        // The loop runs until the second-last index because
        // we are accessing arr[i + 1].
        for (int i = 0; i < arr.length - 1; i += 2) {

            // Swap the current element with the next element
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before Wave Sort: ");
        System.out.println(Arrays.toString(arr));

        // Convert the array into wave form
        sortInWave(arr);

        System.out.print("After Wave Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}

/*

Before Wave in Sort: [1, 2, 3, 4, 5]
After Wave in Sort: [2, 1, 4, 3, 5]

*/
