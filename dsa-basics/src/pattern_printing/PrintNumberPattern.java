package pattern_printing;

/*
Print the given pattern:

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

*/

import java.util.Scanner;

public class PrintNumberPattern {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the pattern
        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints numbers from 1 to n in each row
            for (int j = 1; j <= n; j++) {

                // Print the current value of j followed by a space
                System.out.print(j + " ");
            }

            // Move the cursor to the next line after completing one row
            System.out.println();
        }

        // Close the Scanner to free resources
        sc.close();
    }
}

// The outer loop (i) decides how many rows to print.
// The inner loop (j) prints numbers from 1 to n in each row