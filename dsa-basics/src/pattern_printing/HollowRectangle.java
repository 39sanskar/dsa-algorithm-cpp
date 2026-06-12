package pattern_printing;

import java.util.Scanner;

// Printing Hollow Rectangle
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the value of col: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ( i == 1 || i == row || j == 1 || j == col) { // condition for printing "*"
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
Output:

Enter the value of row: 5
Enter the value of col: 6
* * * * * *
*         *
*         *
*         *
* * * * * *

*/
