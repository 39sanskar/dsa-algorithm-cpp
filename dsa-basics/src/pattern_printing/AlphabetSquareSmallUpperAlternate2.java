package pattern_printing;

import java.util.Scanner;
// Even Cleaner (Using Ternary Operator)

public class AlphabetSquareSmallUpperAlternate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            char ch = (i % 2 != 0)
                    ? (char) ('a' + i - 1)
                    : (char) ('A' + i - 1);

            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

