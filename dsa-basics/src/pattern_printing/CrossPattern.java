package pattern_printing;

import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Print star on both diagonals
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Conclusion:

1. A cross (X) pattern consists of two diagonals.
2. The main diagonal is printed when i == j.
3. The secondary diagonal is printed when i + j == n + 1.
4. Whenever either condition is true, print '*'.
5. Otherwise, print spaces.
6. The intersection of both diagonals occurs at the center
   when n is odd.

Pattern Formula:
Main Diagonal      -> i == j
Secondary Diagonal -> i + j == n + 1

*/

/*

Output:
Enter the value of n: 5
*       *
  *   *
    *
  *   *
*       *


Dry Run for n = 5:

| i | j | Condition   |
| - | - | ----------- |
| 1 | 1 | i == j ✔    |
| 1 | 5 | i + j = 6 ✔ |
| 2 | 2 | i == j ✔    |
| 2 | 4 | i + j = 6 ✔ |
| 3 | 3 | Both ✔      |


*/
