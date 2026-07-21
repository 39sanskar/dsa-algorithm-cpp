package sorting;

// Efficient Method: Using Two Pointer (like Sliding Window)_ Smart Technique
// Time Complexity: O(n)
//Space Complexity: O(1) (In-place)

public class MoveAllZerosToEnd1 {
    // Method to print the array
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void pushZerosToEnd(int[] arr){
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 3, 0, 5, 0};
        System.out.print("Before Moving Zeros: ");
        print(arr);
        pushZerosToEnd(arr);
        System.out.print("After Moving Zeros : ");
        print(arr);
    }
}

// This is one of the most efficient ways to move all 0s to the end of an array while maintaining the relative order of non-zero elements.

/*

-- Dry Run Table

| i | arr[i] | j (before) | Action  | Array After       | j (after) |
| - | ------ | ---------- | ------- | ----------------- | --------- |
| 0 | 1      | 0          | No swap | [1,2,0,4,3,0,5,0] | 1         |
| 1 | 2      | 1          | No swap | [1,2,0,4,3,0,5,0] | 2         |
| 2 | 0      | 2          | Skip    | [1,2,0,4,3,0,5,0] | 2         |
| 3 | 4      | 2          | Swap    | [1,2,4,0,3,0,5,0] | 3         |
| 4 | 3      | 3          | Swap    | [1,2,4,3,0,0,5,0] | 4         |
| 5 | 0      | 4          | Skip    | [1,2,4,3,0,0,5,0] | 4         |
| 6 | 5      | 4          | Swap    | [1,2,4,3,5,0,0,0] | 5         |
| 7 | 0      | 5          | Skip    | [1,2,4,3,5,0,0,0] | 5         |

*/
