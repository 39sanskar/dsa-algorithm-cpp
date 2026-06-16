package pattern_printing;

import java.util.Scanner;

// Rhombus => break into triangle and square(Triangle + Square).
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");   // spaces
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");   // print star
            }
            System.out.println();
        }
    }
}

/*

Output:

Enter the value of n: 5
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

*/
