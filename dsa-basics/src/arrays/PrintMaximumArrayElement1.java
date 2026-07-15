package arrays;

import java.util.Scanner;

// Find Maximum Elements of an Array using  Integer.MIN_VALUE;

public class PrintMaximumArrayElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the Array size (length).
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        // Initialization
        int[] arr = new int[n];

        // Input
        System.out.print("Enter Elements of an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the maximum elements of an Array
        int max = Integer.MIN_VALUE;   // (Or in C++ using INT_MIN)  this is the smallest integer value.
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];  // logical part of the code
        }
        System.out.println("The Required maximum element of an Array is: "+max);

        sc.close();
    }
}


/*

-- What are these constants?
Integer.MIN_VALUE (Java) = -2,147,483,648 (-2³¹)
Integer.MAX_VALUE (Java) = 2,147,483,647 (2³¹ - 1)

-- Similarly in C++:
INT_MIN = -2,147,483,648
INT_MAX = 2,147,483,647

 */