package arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
===============================================================================
                            ARRAYLIST IN JAVA
===============================================================================

Definition:
-----------
ArrayList is a resizable (dynamic) array that is part of the Java Collections
Framework. Unlike normal arrays, its size can grow and shrink automatically.

Features:
---------
1. Dynamic size (no fixed length).
2. Maintains insertion order.
3. Allows duplicate elements.
4. Allows null values.
5. Supports index-based access.
6. Stores objects only (use wrapper classes for primitives).

Common Wrapper Classes:
-----------------------
int     -> Integer
double  -> Double
char    -> Character
boolean -> Boolean
long    -> Long
float   -> Float

Important Methods:
------------------
add(element)                 -> Add element at end
add(index, element)          -> Insert at specific index
get(index)                   -> Access element
set(index, element)          -> Update element
remove(index)                -> Remove element
size()                       -> Number of elements
contains(element)            -> Check existence
indexOf(element)             -> First occurrence index
lastIndexOf(element)         -> Last occurrence index
isEmpty()                    -> Check if list is empty
clear()                      -> Remove all elements

Collections Utility Methods:
----------------------------
Collections.sort(list)               -> Ascending order
Collections.reverse(list)            -> Reverse list
Collections.max(list)                -> Maximum element
Collections.min(list)                -> Minimum element

Time Complexity:
----------------
add()               -> O(1) amortized
get()               -> O(1)
set()               -> O(1)
size()              -> O(1)
add(index)          -> O(n)
remove(index)       -> O(n)
contains()          -> O(n)
indexOf()           -> O(n)
sort()              -> O(n log n)
reverse()           -> O(n)

Memory Trick:
-------------
AGISS

A -> Add      -> add()
G -> Get      -> get()
I -> Insert   -> add(index, element)
S -> Set      -> set(index, element)
S -> Size     -> size()

===============================================================================
*/

public class ArrayListNotes {

    public static void main(String[] args) {

        // =========================================================================
        // 1. Creating an ArrayList
        // =========================================================================
        ArrayList<Integer> arr = new ArrayList<>();

        // =========================================================================
        // 2. Adding Elements
        // =========================================================================
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(18);

        System.out.println("Initial ArrayList: " + arr);

        // =========================================================================
        // 3. Accessing Elements
        // =========================================================================
        System.out.println("Element at index 2: " + arr.get(2));

        // Similar to: arr[2] in a normal array

        // =========================================================================
        // 4. Updating Elements
        // =========================================================================
        arr.set(3, 50);

        // Similar to:
        // arr[3] = 50;

        System.out.println("After set(3, 50): " + arr);

        // =========================================================================
        // 5. Size of ArrayList
        // =========================================================================
        System.out.println("Size: " + arr.size());

        // Array -> arr.length
        // ArrayList -> arr.size()

        // =========================================================================
        // 6. Traversing using for loop
        // =========================================================================
        System.out.print("Using for loop: ");

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // =========================================================================
        // 7. Traversing using Enhanced for loop
        // =========================================================================
        System.out.print("Using enhanced for loop: ");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // =========================================================================
        // 8. Inserting Element at Specific Index
        // =========================================================================
        arr.add(1, 100);

        System.out.println("After add(1, 100): " + arr);

        // =========================================================================
        // 9. Removing Elements
        // =========================================================================

        // Remove first element
        arr.remove(0);

        System.out.println("After removing first element: " + arr);

        // Remove last element
        arr.remove(arr.size() - 1);

        System.out.println("After removing last element: " + arr);

        // Remove element at a specific index
        arr.remove(2);

        System.out.println("After remove(2): " + arr);

        // =========================================================================
        // 10. Searching Operations
        // =========================================================================
        System.out.println("Contains 50? " + arr.contains(50));

        System.out.println("Index of 50: " + arr.indexOf(50));

        System.out.println("Last Index of 50: " + arr.lastIndexOf(50));

        // =========================================================================
        // 11. Checking Empty
        // =========================================================================
        System.out.println("Is Empty? " + arr.isEmpty());

        // =========================================================================
        // 12. Collections.sort()
        // =========================================================================
        Collections.sort(arr);

        System.out.println("Sorted ArrayList: " + arr);

        // =========================================================================
        // 13. Collections.reverse()
        // =========================================================================
        Collections.reverse(arr);

        System.out.println("Reversed ArrayList: " + arr);

        // =========================================================================
        // 14. Maximum and Minimum Element
        // =========================================================================
        System.out.println("Maximum Element: " + Collections.max(arr));

        System.out.println("Minimum Element: " + Collections.min(arr));

        // =========================================================================
        // 15. Manual Reverse using Two Pointers
        // =========================================================================
        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {

            int temp = arr.get(i);

            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        System.out.println("Manual Reverse: " + arr);

        // =========================================================================
        // 16. Different Types of ArrayLists
        // =========================================================================

        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Double> decimals = new ArrayList<>();

        ArrayList<Character> letters = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Boolean> flags = new ArrayList<>();

        System.out.println("\nDifferent ArrayLists created successfully.");

        // =========================================================================
        // 17. clear()
        // =========================================================================
        arr.clear();

        System.out.println("After clear(): " + arr);

        // =========================================================================
        // 18. Final Check
        // =========================================================================
        System.out.println("Is Empty After clear()? " + arr.isEmpty());
    }
}
