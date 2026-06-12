package pattern_printing;

import java.util.Scanner;

// without using maths only use some logic with a-- (Remember)
public class HorizontallyFlippedAlphabetTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        int a = n; // no. of values to be printed in each line
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a ; j++) {
                System.out.print((char)(i+64)+" ");
            }
            a--;
            System.out.println();
        }
    }
}


/*
Output:

Please Enter the value of n: 5
A A A A A
B B B B
C C C
D D
E

*/
