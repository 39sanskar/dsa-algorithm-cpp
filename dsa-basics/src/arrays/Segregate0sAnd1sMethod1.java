package arrays;

import java.util.Arrays;

// Method-1 => count numberOfZeros and numberOfOnes and then put the values in an array.
// 2 pass solution
public class Segregate0sAnd1sMethod1 {
    public static void main(String[] args) {

        // Input array
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int numberOfZeros = 0;
        int numberOfOnes = 0;

        // Count the number of 0s and 1s
        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros++;
            } else {
                numberOfOnes++;
            }
        }

        // Fill the array with 0s
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }

        // Fill the remaining positions with 1s
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print the segregated array
        System.out.println("Segregated Array:");
        System.out.println(Arrays.toString(arr));
    }
}
