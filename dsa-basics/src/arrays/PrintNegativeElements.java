package arrays;

import java.util.Scanner;

// Given an Array, Print Negative elements only... {Important Implementation}
public class PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take Input of an Array
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Printing Negative Elements
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]+" ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Array does not contain any negative elements.");
        }
        sc.close();
    }
}


/*

-- Traverse the array once.
-- Print every negative element.
-- Use a boolean found variable to remember whether any negative element was found.
-- After the loop finishes, print "Array does not contain negative elements."
only if no negative element was found. This avoids printing the message multiple times.

*/

