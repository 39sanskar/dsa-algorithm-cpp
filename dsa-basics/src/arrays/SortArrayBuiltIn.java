package arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort -> generally elements in ascending order.
        int[] arr = {4, 1, 7, 5, -3, 10, 2};
        print(arr);   // 4 1 7 5 -3 10 2
        Arrays.sort(arr);
        print(arr);   // -3 1 2 4 5 7 10
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

