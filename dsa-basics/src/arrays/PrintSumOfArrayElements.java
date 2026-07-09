package arrays;

import java.util.Scanner;

// Print sum of elements of the array. (here calculating the sum and product of an array)
public class PrintSumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Initialization of required Array
        int[] arr = new int[n];

        // Take Input of an Array
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print Sum of elements of an array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];   // add elements to the sum
            product *= arr[i];
        }
        System.out.println("Sum of elements of an array is: "+sum);
        System.out.println("Product of the elements of an array is: "+product);
    }
}


/*

Output:

Enter array size: 4
Enter Array Elements: 12 23 34 45
Sum of elements of an array is: 114
Product of the elements of an array is: 422280

*/
