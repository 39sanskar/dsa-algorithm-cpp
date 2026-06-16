package pattern_printing;

import java.util.Scanner;

// Trick: Take minimum of min(i, j) this is valid for every case... i represents row and j represents column
public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int a = i, b = j;
                if (i > n) a = 2*n - i;
                if (j > n) b = 2*n - j;
                System.out.print(Math.min(a, b)+" ");
            }
            System.out.println();
        }
    }
}


/*
Output:

Enter the value of n: 5
1 1 1 1 1 1 1 1 1
1 2 2 2 2 2 2 2 1
1 2 3 3 3 3 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 3 3 3 3 2 1
1 2 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1 1

*/


/*

Concept of Fake values:
i = 1 to 2n-1 lines are available.


        3 2 1
1 2 3 4 5 6 7

here 5 + 3 = 6 + 2 = 7 + 1 = 8

int a = i, b = j;
if (i > n) a = 2*n - i;
if (j > n) b = 2*n - j;
System.out.print(Math.min(a, b)+" ");

*/


/*

Another way to implement: (One fourth of the code)

1. Using if-else
if (i < j) System.out.print(i+" ")
else System.out.print(j+" ")


2. Using Ternary Operator
for (int j = 1; j <= n; j++) {
    System.out.print((i<j) ? i : j)+" ");
}

*/
