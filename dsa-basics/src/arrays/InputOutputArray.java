package arrays;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = {5, -8, 2, 67, 43, -97};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        System.out.println(arr.length); // 6     // length is starting from 1 and index is starting from 0.
        // Index => 0 to n-1
        // Another way of printing Array using for loop (enhanced for loop)
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(); // 5 -8 2 67 43 -97

        // Access an Array using while loop
        int i = 0;
        int n = arr.length;
        while (i < n) {
            System.out.print(arr[i] + " ");  // 5 -8 2 67 43 -97
            i++;
        }
        System.out.println();

        // Create an Array using new keyword
        int[] karan = new int[7];

        // Print defaults values in an array
        for (int j = 0; j < 7; j++) {
            System.out.print(karan[j] + " "); //  0 0 0 0 0 0 0
        }
        System.out.println();

        // Take Input into the Array
        for (int j = 0; j < karan.length; j++) {
            System.out.print("Please Enter the value of an Array: ");
            int x = sc.nextInt();
            karan[j] = x;
        }

        // Print the array entered by the user
        System.out.println("Elements of the array are: ");
        for (int j = 0; j < karan.length; j++) {
            System.out.print(karan[j] + " ");
        }

    }
}


/*

-- Enhanced for Loop in Java
The enhanced for loop (also called the for-each loop) is a simplified version of the for loop
that is used to iterate through all elements of an array or a collection without using an index.

-- Syntax

for (dataType variableName : arrayOrCollection) {
    // Code to execute for each element
}

-- Explanation
dataType → The data type of the elements (e.g., int, String).
variableName → A temporary variable that stores the current element.
: → Read as "in" or "for each element in".
arrayOrCollection → The array or collection being traversed.

Example 1: Printing an Array

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        for (int value : arr) {
            System.out.println(value);
        }
    }
}

// Output: 10  20  30  40


*/
