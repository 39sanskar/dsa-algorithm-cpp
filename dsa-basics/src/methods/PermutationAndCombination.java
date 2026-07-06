package methods;

import java.util.Scanner;

// Take ‘n’ and ‘r’ as input and print nCr and nPr.
public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Please enter the value of r: ");
        int r = sc.nextInt();

        // nCr = n! / r!*(n-r)!
        // nPr = n! / (n-r)!

        // calculate factorial of n
        int nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        // calculate the factorial of r
        int rFact = 1;
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }
        // calculate the factorial of (n-r)
        int nrFact = 1;
        for (int i = 1; i <= n-r; i++) {
            nrFact *= i;
        }
        // Combination
        int nCr = nFact / (rFact*nrFact);
        System.out.println(nCr);

        // Permutation
        int nPr = nFact / nrFact;
        System.out.println(nPr);
    }
}

/*

Permutation => A permutation is the different way of arranging a given number of objects in a specific order.

Formula =>  nPr = n! / (n-r)!
n = Total number of objects
r = Number of objects to be arranged
! = Factorial

Combination => A combination is the different way of selecting objects from a group without considering their order.

Formula =>  nCr => n! / r!*(n-r)!

Where:
n = Total number of objects
r = Number of objects selected

*/
