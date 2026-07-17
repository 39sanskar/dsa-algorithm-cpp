package sorting;

// This is the best implementation of the Bubble sort.
public class BubbleSort1 {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 2};
        int n = arr.length;

        System.out.print("Before Array Sorting: "+" ");
        print(arr);
        System.out.println();

        // Total number of comparisons in the worst case is approximately (n - 1)^2.
        // Problem: Adjacent elements are compared and swapped until the end in every pass.
        // Solution: Perform (n - 1) comparisons in the first pass, then reduce one comparison in each subsequent pass (n-1-i).
        // Observation: After each pass, the last element is placed in its correct sorted position.

        for (int i = 0; i < n - 1; i++) {  // (n - 1) passes
            for (int j = 0; j < n - 1 - i; j++) {  // (n - 1 - i) comparisons in each pass
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("After Array Sorting: "+" ");
        print(arr);
    }
}

// In this code Time Complexity will not change but its speed will be double.
// because number of operations will be decreased.

/*

Output:
Before Array Sorting:  5 -2 6 7 2 8 7 2

After Array Sorting:  -2 2 2 5 6 7 7 8

*/
