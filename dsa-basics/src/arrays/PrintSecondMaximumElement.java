package arrays;

// Calculate Second maximum Element in Array
public class PrintSecondMaximumElement {
    public static void main(String[] args) {
        int[] arr = {4, 10, 10, 6, 3, 8};
        // Initialization of the max and second-max
        int max = Integer.MIN_VALUE; 
        int secondmax = Integer.MIN_VALUE;
        
        // calculate max 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        // calculate second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondmax && arr[i] != max) secondmax = arr[i];
        }
        System.out.println("The Maximum Element in an Array is: "+ max);
        System.out.println("The Second Maximum Element in an Array is: "+ secondmax);
    }
}


/*

arr = { 4, 10, 18, 8, 3, 8 }
maximum element = 10, second maximum element = 8

Approach: Find largest element (maximum). Now find largest element except maximum.
-- First find the Maximum element in an Array.
-- then find the Second Maximum Element in an array using the logic => (arr[i] > secondmax && arr[i] != max) secondmax = arr[i];

*/

