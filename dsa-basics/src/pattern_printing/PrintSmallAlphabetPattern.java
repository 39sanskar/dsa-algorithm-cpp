package pattern_printing;

import java.util.Scanner;

public class PrintSmallAlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+96)+ " "); // typecasting
            }
            System.out.println();
        }
    }
}

/*
97 => a
65 => A
Output:

Please Enter the value of n: 4
a b c d
a b c d
a b c d
a b c d

Please Enter the value of n: 5
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e

*/
