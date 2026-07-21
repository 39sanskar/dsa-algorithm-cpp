package sorting;

// Bubble Sort => It is an Algorithm
// Intuition => Swap adjacent element
// Compare two adjacent elements. If they are in the wrong order, swap them. Repeat this process until the array becomes sorted.

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 8, 7, 2};
        int n = arr.length;
        print(arr);
        System.out.println();
        // We iterate only until the second-last index because each comparison involves the current element and its adjacent (next) element.

        // pass 1
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);
        System.out.println();

        // pass 2
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);
        System.out.println();

        // pass 3
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        // pass 4
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        // pass 5
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

        // pass 6
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                // swap the element
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);

    }
}


/*

-- Pattern Of Bubble Sort
- Suppose there are n elements.
Pass 1: Largest element reaches the last position.

Pass 2: Second largest reaches second last position.

Pass 3: Third largest reaches third last position.

...

Pass n−1: Array becomes sorted.

So after every pass,
One element reaches its final correct position.

-- Core Algorithm

Repeat for every pass

    Compare adjacent elements

    If left > right

        Swap them

Repeat until the array is sorted.

-- Time Complexity
| Case                                    | Time Complexity |
| --------------------------------------- | --------------- |
| Best (already sorted with optimization) |   O(n)          |
| Average                                 |   O(n²)         |
| Worst                                   |   O(n²)         |

-- Space Complexity
O(1)  => Bubble Sort is an in-place algorithm, meaning it sorts the array without using any extra array.

-- Key Points to Remember

-- Compare adjacent elements.
-- Swap only if they are in the wrong order.
-- After every pass, the largest unsorted element moves to its correct position at the end. (Important)
-- Continue until the array is sorted or until a pass completes with no swaps (optimized Bubble Sort).
-- Bubble Sort is stable, in-place, and simple to understand, but it is inefficient for large datasets due to its O(n²) average and worst-case time complexity.

*/
