package pattern_printing;

import java.util.Scanner;
// Printing the Plus Pattern. n, m should be odd for perfect plus

public class PrintStarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n (should be odd for perfect plus): ");
        int n = sc.nextInt();

        System.out.print("Enter the value of m (should be odd for perfect plus): ");
        int m = sc.nextInt();

        // Calculate middle positions
        int midRow = (n + 1) / 2;
        int midCol = (m + 1) / 2;

        // Print plus pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print star if current position is in middle row or middle column
                if (i == midRow || j == midCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
        sc.close(); // Close scanner to prevent resource leak
    }
}


/*
Output:

Enter the value of n (should be odd for perfect plus): 7
Enter the value of m (should be odd for perfect plus): 7

   *
   *
   *
*******
   *
   *
   *

*/
