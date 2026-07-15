package arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10, 3, 29, 38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y) {
        y[2] = 99;
    }
}

// whenever we pass our array to methods so, the array is pass by reference.

/*

-- This program demonstrates an important concept in Java:
Arrays are objects, and when an array is passed to a method, Java passes a copy of the reference to the array.
Because both references point to the same array object, changes made inside the method are visible outside the method.

Step 1: Execution Starts
Execution begins from the main() method.

int x[] = {10, 3, 29, 38};

An array is created in memory.

| Index | Value |
| ----: | ----: |
|     0 |    10 |
|     1 |     3 |
|     2 |    29 |
|     3 |    38 |


The variable x stores a reference (address) to this array.

x
 │
 ▼
+----+----+----+----+
| 10 |  3 | 29 | 38 |
+----+----+----+----+

Step 2: First Print Statement
System.out.println(x[2]);
-- x[2] means the element at index 2.
-- The value at index 2 is 29.

Output:  29

The array remains unchanged.

x
 │
 ▼
+----+----+----+----+
| 10 |  3 | 29 | 38 |
+----+----+----+----+

Step 3: Method Call
change(x); // The reference stored in x is passed to the method.

public static void change(int[] y)
Inside the method:
-- y receives a copy of the reference stored in x.
-- Both x and y refer to the same array.

x ──┐
    │
    ▼
+----+----+----+----+
| 10 |  3 | 29 | 38 |
+----+----+----+----+
    ▲
    │
y ──┘

-- Notice that only one array exists.

Step 4: Change the Array
y[2] = 99;
Since y refers to the same array as x, the value at index 2 changes from 29 to 99
Now the array becomes

| Index | Value |
| ----: | ----: |
|     0 |    10 |
|     1 |     3 |
|     2 |    99 |
|     3 |    38 |

x ──┐
    │
    ▼
+----+----+----+----+
| 10 |  3 | 99 | 38 |
+----+----+----+----+
    ▲
    │
y ──┘

The method finishes, and y is destroyed.

x
 │
 ▼
+----+----+----+----+
| 10 |  3 | 99 | 38 |
+----+----+----+----+

The array still exists because x still refers to it.

Step 5: Second Print Statement
System.out.println(x[2]);
Now x[2] is 99.
Output:  99

Final Output: 29  99

Why did the original array change?
Because x and y both referred to the same array object.
Java does not create a new array when you pass an array to a method. Instead, it passes a copy of the reference to the existing array.

-- Important Note

Java is always pass-by-value.
For primitive types (int, double, char, boolean, etc.), Java passes a copy of the value.
For objects (including arrays), Java passes a copy of the object's reference.

This means:
The reference itself is copied.
Both references point to the same object.
Therefore, modifying the object's contents (such as changing an array element) affects the original object.

However, if you reassign the parameter to a new array, the original array is not affected.
For example:

public static void change(int[] y) {
    y = new int[]{1, 2, 3, 4}; // Creates a new array
}


-- After calling change(x), the original array referenced by x remains unchanged because only the local variable y now points to the new array.


*/
