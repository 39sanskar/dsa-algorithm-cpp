package arrays;

// Another way to reverse an array
public class ReverseArray2 {
    public static void main(String[] args) {

        // Original array
        int[] arr = {3, 19, 56, 9, 83, 18, 34, 85, 14};

        // Length of the array
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Print the resulting array
        System.out.print("After Reversing the Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
        }
    }
}

// After Reversing the Array: 14 85 34 18 83 9 56 19 3

