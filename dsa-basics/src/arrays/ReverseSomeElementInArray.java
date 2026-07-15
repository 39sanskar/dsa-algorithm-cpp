package arrays;

// Reverse Some Elements In Array like {3, 19, 56, 9, 83, 18, 24, 85, 14} => {3, 19, 18, 83, 9, 56, 24, 85, 14}.
// We want to Reverse this part in Array: {56, 9, 83, 18}

public class ReverseSomeElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 19, 56, 9, 83, 18, 24, 85, 14};
        int n = arr.length;
        System.out.print("Before Reverse an Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int i = 2;
        int j = 5;
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

/*

Before Reverse an Array: 3 19 56 9 83 18 24 85 14
After  Reverse an Array: 3 19 18 83 9 56 24 85 14

*/


