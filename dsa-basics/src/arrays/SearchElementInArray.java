package arrays;

import java.util.Scanner;

// Search in Array (Linear Search). Hint using  isElementExist and break statement.

/*

- To search for an element in an array, you need to:
- Take the array as input.
- Ask the user for the element to search.
- Traverse the array.
- If the element is found, print its index and stop searching.
- If the element is not found, print an appropriate message.

*/

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        // Initialization
        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        boolean isElementExist = false;

        // Search the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is present at index " + i + ".");
                isElementExist = true;
                break;
            }
        }

        // If element is not found
        if (!isElementExist) {
            System.out.println(target + " is not present in the array.");
        }
        sc.close();
    }
}

// Output:

/*

Enter Array size: 4
Enter Array Elements: 12 23 34 45
Enter the element to search: 55
55 is not present in the array.

*/

/*

-- Why do we initialize the boolean with false?
boolean isElementExist = false;

Initially, we assume the element is not present.
If we find the element during the search, we set:

isElementExist = true;

After the loop:
If isElementExist is true, the element was found.
If isElementExist is still false, the element does not exist in the array.

*/
