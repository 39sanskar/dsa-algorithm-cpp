package pattern_printing;

import java.util.Scanner;

public class SimilarRowNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}

// usually outer loop is indicate with i
// usually inner loop is indicate with j

/*
output:

Please Enter the value of n: 5

1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
