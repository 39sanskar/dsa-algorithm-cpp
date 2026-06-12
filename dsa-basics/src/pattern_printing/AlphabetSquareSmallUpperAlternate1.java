package pattern_printing;

import java.util.Scanner;

public class AlphabetSquareSmallUpperAlternate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Determine the character once per row
            char ch;
            if (i % 2 != 0) {
                ch = (char) ('a' + i - 1);
            } else {
                ch = (char) ('A' + i - 1);
            }

            // Print the character n times
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*

Output:  n = 4

a a a a
B B B B
c c c c
D D D D

*/
