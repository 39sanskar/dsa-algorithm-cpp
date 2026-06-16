package pattern_printing;

import java.util.Scanner;

public class DoubleFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*

Output:
Enter the value of n: 5
* * * * *
  * * * *
    * * *
      * *
        *
*/


/*
Logic:

For each row i:
Print (i - 1) leading spaces.
Print (n - i + 1) stars.
Move to the next line.

Formula:

Spaces = i - 1
Stars  = n - i + 1


Key Idea:
Start with n stars in the first row and decrease the number of stars by 1 in every subsequent row,
while increasing the leading spaces by 1.

Advantages:
- Simple and easy-to-understand approach.
- No conditional statements (if) are required.
- Directly follows the pattern's structure using separate loops for spaces and stars.


Time Complexity:
for each row:

Spaces + Stars
= (i - 1) + (n - i + 1)
= n

Since there are n rows.
Time Complexity = O(n²)

Only a few variable n, i , j are used...
Space Complexity = O(1)

*/

