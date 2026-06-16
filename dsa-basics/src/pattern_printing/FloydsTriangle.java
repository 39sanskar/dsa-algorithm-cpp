package pattern_printing;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sanskar = 1;  // introducing extra variable...
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sanskar+" ");
                sanskar++;   // increment variable
            }
            System.out.println();
        }
    }
}

// Another way of doing this question is  method of difference...
/*
Output:

Enter the value of n: 5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
