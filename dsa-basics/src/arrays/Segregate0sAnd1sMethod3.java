package arrays;

import java.util.Arrays;

// Method 3 => Only run a single condition (More efficient)
public class Segregate0sAnd1sMethod3 {
    static void segregate0and1(int[] arr) {
        int n = arr.length;
        int i = 0; int j = n-1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 0, 1};

        System.out.print("Before Segregation: ");
        System.out.println(Arrays.toString(arr));

        // Call the function
        segregate0and1(arr);

        System.out.print("After Segregation: ");
        System.out.println(Arrays.toString(arr));
    }
}

/*

Before Segregation: [0, 1, 0, 1, 1, 0, 0, 1, 0, 1]
After Segregation: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

*/
