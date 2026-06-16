package pattern_printing;

import java.util.Scanner;

// Method 1: Using Simple Calculation
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("* ");      // (2*i-1) stars are print in each line...
            }
            System.out.println();
        }
    }
}


/*

Conclusion:
- This program prints a centered pyramid star pattern.
- The user enters the number of rows (n), and the program uses nested
- for loops to print spaces and stars. For each row, the number of
- leading spaces decreases while the number of stars increases by two,
- following the formula (2 * i - 1). As a result, a symmetric pyramid
- shape is formed with the stars centered on each row.

*/

/*

Output:

Enter the value of n: 5
    *
   ***
  *****
 *******
*********

*/
