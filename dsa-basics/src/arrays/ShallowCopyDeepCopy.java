package arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // shallow copy
        int[] arr = {10, 20, 30, 40}; // it take 16 bytes
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);  // 100

        // deep copy
        int[] deep = Arrays.copyOf(arr, arr.length);  // Syntax
        deep[0] = 50;
        System.out.println(deep[0]); // 50
        System.out.println(arr[0]);  // 100
    }
}

/*

-- What is a Shallow Copy?
- A Shallow Copy means:
- No new object is created.
- Only the reference (address) is copied.
- Both variables point to the same object.

Changes made through one variable are visible through the other.
Example:

int[] arr = {10,20,30};
int[] x = arr;

arr ----\
         \
          ---> Same Array
         /
x ------/


-- What is a Deep Copy?
- A Deep Copy means:
- A completely new object is created.
- All values are copied into the new object.
- The original and copied objects are independent.
- Changes made to one object do not affect the other.

Arrays.copyOf() creates a completely new array.
The values are copied one by one.

Example:
int[] deep = Arrays.copyOf(arr, arr.length);

Memory:

Original Array           Copied Array

+----+----+----+       +----+----+----+
|10  |20  |30  |       |10  |20  |30  |
+----+----+----+       +----+----+----+

Both arrays are different.

| Shallow Copy                      | Deep Copy                                 |
| --------------------------------- | ----------------------------------------- |
| Copies only the reference         | Creates a new array                       |
| Only one array exists             | Two separate arrays exist                 |
| Changes affect the original array | Changes do not affect the original array  |
| Example: `int[] x = arr;`         | Example: `Arrays.copyOf(arr, arr.length)` |


*/

// Arrays store their elements in contiguous memory locations.
// This means all the elements of an array are stored next to each other in memory,
// allowing efficient access using an index.

