package pattern_printing;

import java.util.Scanner;

// implement using maths
public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Output:

Enter the value of n: 4
1
1 3
1 3 5
1 3 5 7

Enter the value of n: 6
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
1 3 5 7 9 11

*/

/*

Logic:

1. Outer loop (i) controls the rows.
2. Inner loop (j) controls the number of elements in each row.
3. The jth odd number is:
      2*j - 1
4. For row i, print the first i odd numbers.

Example:
j = 1 -> 1
j = 2 -> 3
j = 3 -> 5
j = 4 -> 7

Pattern:
1
1 3
1 3 5
1 3 5 7

*/
