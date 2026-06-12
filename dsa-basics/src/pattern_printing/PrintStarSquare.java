package pattern_printing;

import java.util.Scanner;
// Print a Star Square for n = 4.

public class PrintStarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();   // print the next line
        }
    }
}

/*

Output: n = 4;

*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *

*/
