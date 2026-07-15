package arrays;

import java.util.Scanner;

// Output and Input of Array using Loop
// Modify the value of an array (double the value using multiplication operation.).
public class DoubleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an Array using new keyword
        int[] aman = new int[5];

        // Take Input into the Array
        for (int i = 0; i < aman.length; i++) {
            System.out.print("Please Enter the value of an Array: ");
            int y = sc.nextInt();  // Or  aman[i] = sc.nextInt();
            aman[i] = y;
        }

        System.out.print("Elements of the array are: ");
        for (int i = 0; i < aman.length; i++) {
            System.out.print(aman[i]+" ");
        }
        System.out.println();

        // Finally double the value
        System.out.print("Double the value of an array: ");
        for (int i = 0; i < aman.length; i++) {
            System.out.print(2*aman[i]+" ");
        }
    }
}


/*
Output:

Please Enter the value of an Array: 12
Please Enter the value of an Array: 23
Please Enter the value of an Array: 34
Please Enter the value of an Array: 45
Please Enter the value of an Array: 56
Elements of the array are: 12 23 34 45 56
Double the value of an array: 24 46 68 90 112

*/
