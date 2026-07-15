package arrays;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList => dynamic array (grows automatically)
// Problem with regular arrays: fixed size that cannot be changed once created
// Collection Framework => provides built-in data structures and methods

public class ArraylistInJava {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding elements to the ArrayList
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(18);

        // Accessing element at specific index using get() method
        System.out.println(arr.get(2)); // Output: 18

        // NOTE: Cannot use array-style indexing like arr[3] = 50;
        // Also cannot assign directly to get() result like arr.get(3) = 50;

        // Setting/updating element at specific index using set() method
        // This is analogous to arr[3] = 50 in a regular array
        arr.set(3, 50);
        System.out.println(arr.get(3)); // Output: 50

        // Printing the entire ArrayList - unlike arrays, this prints all elements
        // Internally, this uses a loop to display all elements
        System.out.println(arr); // Output: [25, 21, 18, 50, 18]

        // Getting the size of ArrayList (similar to arr.length for arrays)
        int n = arr.size();

        // Traditional for loop to iterate through ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " "); // Output: 25 21 18 50 18
        }
        System.out.println();

        // Enhanced for-each loop - cleaner way to iterate
        for (int ele : arr) {
            System.out.print(ele + " "); // Output: 25 21 18 50 18
        }
        System.out.println();

        // Adding element at the end of the ArrayList
        arr.add(78);
        System.out.println(arr); // Output: [25, 21, 18, 50, 18, 78]

        // Inserting element at a specific position
        // This shifts existing elements to the right
        arr.add(1, 100);
        System.out.println(arr); // Output: [25, 100, 21, 18, 50, 18, 78]

        // Removing the first element
        arr.removeFirst();
        System.out.println(arr); // Output: [100, 21, 18, 50, 18, 78]

        // Removing the last element
        arr.remove(arr.size() - 1); // Note: size changes after removal
        System.out.println(arr); // Output: [100, 21, 18, 50, 18]

        // Using Collections utility class to reverse the ArrayList
        Collections.reverse(arr);
        System.out.println(arr); // Output: [18, 50, 18, 21, 100]

        // Manually reversing the ArrayList using two-pointer approach
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));  // Set ith index with jth element
            arr.set(j, temp);         // Set jth index with ith element (stored in temp)
            i++;
            j--;
        }
        System.out.println(arr); // Output: [100, 21, 18, 50, 18]
        // Note: This reverses the already reversed list, giving us original order

        // ArrayList supports different data types
        ArrayList<Character> arr2 = new ArrayList<>();  // Character type
        ArrayList<Double> arr3 = new ArrayList<>();      // Double type
        ArrayList<String> arr4 = new ArrayList<>();      // String type
    }
}

/*

18
50
[25, 21, 18, 50, 18]
25 21 18 50 18
25 21 18 50 18
[25, 21, 18, 50, 18, 78]
[25, 100, 21, 18, 50, 18, 78]
[100, 21, 18, 50, 18, 78]
[100, 21, 18, 50, 18]
[18, 50, 18, 21, 100]
[100, 21, 18, 50, 18]

*/
