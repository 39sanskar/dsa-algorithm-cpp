package pattern_printing;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char)(i+64)+" "); // typecasting
            }
            System.out.println();
        }
    }
}

/*
Output:

Please Enter the value of n: 4
A A A A
B B B B
C C C C
D D D D

*/
