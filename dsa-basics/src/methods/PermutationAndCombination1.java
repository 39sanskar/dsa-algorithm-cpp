package methods;

import java.util.Scanner;

public class PermutationAndCombination1 {
    public static int fact (int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Please Enter the value of r: ");
        int r = sc.nextInt();

        int nCr = fact(n) / (fact(r)*fact(n-r)); // here we're using the function fact three times for fact(n), fact(r), fact(n-r).
        System.out.println(nCr);

        int nPr = fact(n) / fact(n-r);
        System.out.println(nPr);

    }
}

