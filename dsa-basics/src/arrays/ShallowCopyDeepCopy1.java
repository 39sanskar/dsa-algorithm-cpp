package arrays;

public class ShallowCopyDeepCopy1 {
    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30, 40};

        // Create a deep copy manually
        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the copied array
        System.out.print("Copied Array:   ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();

        // Modify the copied array
        brr[0] = 100;
        brr[2] = 300;

        System.out.println("\nAfter modifying the copied array:");

        // Print the original array again
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the copied array again
        System.out.print("Copied Array:   ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }
}

/*
Output:

Original Array: 10 20 30 40
Copied Array:   10 20 30 40

After modifying the copied array:
Original Array: 10 20 30 40
Copied Array:   100 20 300 40

*/

/*

Conclusion:

- arr and brr are two different arrays.
- The for loop copies each element individually from arr to brr.
- After the copy, modifying brr does not change arr.
- This is called a deep copy because a new array is created with its own separate memory.

*/

