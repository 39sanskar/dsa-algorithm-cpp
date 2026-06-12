package pattern_printing;

import java.util.Scanner;
// Print the Number Triangle

public class PrintNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


/*
Output:

Please Enter the value of n: 5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
