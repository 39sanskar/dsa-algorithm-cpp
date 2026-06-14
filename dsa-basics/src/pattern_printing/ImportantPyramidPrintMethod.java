package pattern_printing;

import java.util.Scanner;

// nsp-nst method (no. of space and no. of star methods).
public class ImportantPyramidPrintMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the n: ");
        int n = sc.nextInt();
        int nsp = n-1;    // no. of spaces
        int nst = 1;      // no. of stars
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}


/*

- In each line there are some spaces and stars are printed.
- In each line there are two loops are running.

*/

/*
Concept (Important for pattern printing):

Initially in each line
no. of spaces = n-1
no. of stars = 1

no. of spaces are decreased from 1 so that it become, nsp -= 1
no. of stars are increased from 2 so that it become, nst += 2

*/

/*
Output:

Enter the value of the n: 6
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * *

*/
