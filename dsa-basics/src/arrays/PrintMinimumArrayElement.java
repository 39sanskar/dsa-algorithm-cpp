package arrays;

import java.util.Scanner;

// Print the minimum element in the array.
public class PrintMinimumArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the minimum element

        int min = Integer.MAX_VALUE;
        // int min = arr[0];      // Another way to implement...

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element = " + min);
        sc.close();
    }
}


/*

-- Why do we use Integer.MAX_VALUE?

int min = Integer.MAX_VALUE;

Integer.MAX_VALUE = 2,147,483,647, the largest int value in Java.
Since every array element is less than or equal to this value, the first element will replace it.
As the loop continues, min is updated whenever a smaller element is found.
Similarly, when finding the maximum element, we initialize with:

int max = Integer.MIN_VALUE;

*/
