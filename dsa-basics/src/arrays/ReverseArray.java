package arrays;

// Reverse Array using Two Pointer (2 variable technique).
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 19, 56, 9, 83, 18, 24, 85, 14};
        int n = arr.length;
        System.out.print("Before Reverse an Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Initialization of variable i at first index and j is at last index.
        // Index is starting from 0. so first Index is 0 and last Index is (n-1).
        int i = 0;
        int j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;   // increment of the variable i
            j--;   // decrement of the variable j
        }
        System.out.print("After Reverse an Array: ");
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }
}

