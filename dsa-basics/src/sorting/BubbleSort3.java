package sorting;

// Bubble Sort better version
public class BubbleSort3 {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        System.out.print("Before Array Sorting: "+" ");
        print(arr);

        // Bubble Sort Optimised 
        for (int i = 0; i < n-1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-1; j++) {
                if (arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) break;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("After Array Sorting: "+" ");
        print(arr);
    }
}


/*
Output:

Before Array Sorting:  5 -2 6 7 2 0 7 2
After Array Sorting:  -2 0 2 2 5 6 7 7

*/


// If an inner loop breaks, only the inner loop terminates.
// The outer loop continues executing.
// A break statement affects only its immediate (parent) loop.

// If a return statement is executed inside a loop,
// the entire method (function) terminates immediately,
// regardless of how many loops are present.

// Difference between break and return:
// break → Exits only the nearest enclosing loop (for, while, or do-while).
// return → Exits the entire method immediately and returns control to the caller.


// boolean variable is taking less space as compare to integer.
