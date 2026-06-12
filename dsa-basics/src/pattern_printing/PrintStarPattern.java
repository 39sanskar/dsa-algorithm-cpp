package pattern_printing;

import java.util.Scanner;

// Print the given star pattern
public class PrintStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row numbers: ");
        int row = sc.nextInt();

        System.out.print("Enter the col numbers: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" * ");
            }
            System.out.println();   // print the next line
        }
    }
}

