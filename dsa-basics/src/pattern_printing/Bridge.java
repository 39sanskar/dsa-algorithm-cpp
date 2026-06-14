package pattern_printing;

import java.util.Scanner;

/*
Bridge Pattern
 Trick:
 1. Print the top horizontal line first.
 2. Then print two inverted triangles separated by spaces.
 Break into three parts => First and Third Triangle is same and middle triangle is usually using space.
*/

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Top horizontal line
        for (int i = 1; i <= (2 * n - 1); i++) {
            System.out.print("* ");
        }
        System.out.println();

        int nsp = 1; // Number of spaces in the middle

        // Lower part
        for (int i = 1; i <= n - 1; i++) {

            // Left inverted triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Right inverted triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            nsp += 2;
            System.out.println();
        }

        sc.close();
    }
}

/*

Output:

Enter the value of n: 6
* * * * * * * * * * *
* * * * *   * * * * *
* * * *       * * * *
* * *           * * *
* *               * *
*                   *

*/


/*

Conclusion:
- This program prints a Bridge Pattern using nested loops.
- The pattern consists of a top horizontal line and two inverted
- triangular sections on the left and right sides. As the rows
- increase, the number of stars on both sides decreases while the
- number of spaces in the middle increases by two. This arrangement
- forms a symmetric bridge-shaped pattern.

Time Complexity:
- Outer loop runs n times.
- Inner loops together print approximately O(n) characters per row.
- Time Complexity: O(n²)
- Space Complexity: O(1)

*/
