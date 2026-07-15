package arrays;
// Method 2 => Using 2-pointer technique
import java.util.Arrays;

public class Segregate0sAnd1sMethod2 {

    static void segregate0and1(int[] arr) {

        // Get the size of the array
        int n = arr.length;

        int i = 0;  // i points to the beginning of the array
        int j = n - 1;  // j points to the end of the array
        // Continue until both pointers meet
        while (i < j) {
            // If the current element at i is 0,
            // it is already in the correct position.
            if (arr[i] == 0) {
                i++;
            }

            // If the current element at j is 1,
            // it is already in the correct position.
            if (arr[j] == 1) {
                j--;
            }

            // If the pointers cross each other,
            // the array is completely segregated.
            // If the pointers cross each other and loop is not break;
            if (i > j) {
                break;
            }

            // If a misplaced 1 is found on the left
            // and a misplaced 0 is found on the right,
            // swap them.
            if (arr[i] == 1 && arr[j] == 0) {

                // Swap the elements
                int temp = arr[i];  // if you know which element will be swap then you may not be use temp variable.
                arr[i] = arr[j];
                arr[j] = temp;

                // Move both pointers inward
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 0, 1};

        System.out.println("Before Segregation:");
        System.out.println(Arrays.toString(arr));

        // Call the function
        segregate0and1(arr);

        System.out.println("After Segregation:");
        System.out.println(Arrays.toString(arr));
    }
}

