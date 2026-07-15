package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 6, 9};
        for (int element: arr) {
            System.out.print(element+" ");
        }
        System.out.println();

        // Can not modify array elements using for each loop.
        // In a for-each loop, the loop variable receives a copy of the current array element.
        for (int ele: arr){
            ele *= 2;
        }

        for (int ele: arr){
            System.out.print(ele+" ");  // 5 8 2 6 9
        }
        System.out.println();

        // Modify array elements using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        // Print the Element.
        for (int ele: arr){
            System.out.print(ele+" "); // 10 16 4 12 18
        }

    }
}


/*

// For Each Loop is used to traverse data structure.
//  Can not modify array elements.

-- In Java, the for-each loop (also called the enhanced for loop) is used to iterate through arrays and collections without using an index.

-- Syntax:
for (dataType variable : collection) {
    // Code to execute
}

- dataType → Type of the elements (e.g., int, String)
- variable → Temporary variable holding the current element
- collection → Array or collection to iterate over

-- Example 1: Loop through an array

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);   // 10 20 30 40 50
        }
    }
}

-- Example 2: Loop through a String array

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};

        for (String fruit : fruits) {
            System.out.println(fruit);  // Apple  Banana  Orange
        }
    }
}

-- Advantages
Simpler and more readable.
No need to manage an index.
Less chance of ArrayIndexOutOfBoundsException.

*/