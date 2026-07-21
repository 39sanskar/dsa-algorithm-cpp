package sorting;

// using the another variable swaps;
public class BubbleSort4 {
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
           int swaps = 0;
            for (int j = 0; j < n -1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
        System.out.print("After Array Sorting: "+" ");
        print(arr);
    }
}

// It's time Complexity: O(n^2);
// If the array is already sorted, no swaps occur during the first pass.
// The algorithm terminates early, making the best-case time complexity O(n).

/*

Before Array Sorting:  5 -2 6 7 2 0 7 2
After Array Sorting:  -2 0 2 2 5 6 7 7

*/