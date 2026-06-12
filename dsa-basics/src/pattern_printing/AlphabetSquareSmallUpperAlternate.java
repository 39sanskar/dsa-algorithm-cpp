package pattern_printing;

import java.util.Scanner;

public class AlphabetSquareSmallUpperAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print((char)(i+96)+ " ");
                } else {
                    System.out.print((char)(i+64)+ " ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output:

Please Enter the value of n: 4

a a a a a
B B B B B
c c c c c
D D D D D

*/