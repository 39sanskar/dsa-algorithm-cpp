package arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {
        // Initializing an array
        int[] x = {6, 19, 7, 69, 9, 171, 5}; // specially in JAVA ( In C++/C  int x[] )
        // Indexing
        System.out.println(x[0]);  // 0
        System.out.println(x[5]);   // 171
        // Updating elements - mutability (
        x[3] = 89;
        System.out.println(x[3]);  // 89


        // Another way of Initializing an Array using new keyword.
        int[] arr = new int[4];  // Array of size 4. Valid indices are 0 to 3.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // Access and print all elements of the array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); // 10 20 30 40
        }
    }
}


/*
-- Indexing

-- Indexing in Java means accessing the position of an element in a collection such as an array, string, or list.
Java uses zero-based indexing, which means the first element is at index 0, the second element is at index 1, and so on.

-- Formula: Index = Position - 1
-- Invalid Index
Trying to access an index that does not exist causes an exception.

int[] arr = {10, 20, 30};
System.out.println(arr[3]);

Output:
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException

The valid indices are:
Index : 0   1   2
Value :10  20  30

There is no index 3.

Why Does Java Start Indexing from 0?
-- Java follows the same convention as languages like C and C++. Internally, an index represents the offset from the beginning of the array:
-- Index 0 → first element (0 positions away from the start)
-- Index 1 → one position away
-- Index 2 → two positions away
This makes array access efficient.

-- Definition
Indexing in Java is the process of accessing an element in an array, string,
or other indexed data structure using its index (position number).
Java uses zero-based indexing, so the first element has index 0,
the second has index 1, and the last element has index (length - 1).

*/
