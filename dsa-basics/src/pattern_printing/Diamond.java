package pattern_printing;

import java.util.Scanner;

// Diamond => break into two half Upper and Lower half. (Important)
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int nsp = n - 1;    // no. of spaces
        int nst = 1;        // no. of stars

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp--;
            nst += 2;
            System.out.println();
        }

        // Reset values for lower half
        nsp = 1;
        nst = 2 * n - 3;

        // Lower half
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp++;    // increment by 1
            nst -= 2;  // decrement by 2
            System.out.println();
        }
    }
}

/*
Output:
Enter the value of n: 5

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/

/*

Conclusion:
- This program prints a diamond star pattern using nested loops.
- The upper half of the diamond is formed by decreasing spaces and
- increasing stars, while the lower half is formed by increasing
- spaces and decreasing stars. The pattern is symmetric about its
- middle row, creating a complete diamond shape.

*/