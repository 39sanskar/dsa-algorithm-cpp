package pattern_printing;

import java.util.Scanner;

public class HorizontallyFlippedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i ; j++) {
                System.out.print((char)(j+96)+" "); // if you want to print some specific value in row then using j.
            }
            System.out.println();
        }
    }
}


/*
Output:

Please Enter the value of n: 5
a b c d e
a b c d
a b c
a b
a

*/
