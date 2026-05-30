package loops;

// Composite Number => If any factor of n is found between 2 and n-1, then n will be a composite number.
// A composite number is a number greater than 1 that has more than two factors. 0 and 1 are not composite numbers.

// Write a Program to check if a given number is composite  or not.

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isComposite = false;

        if (n <= 1) {
            isComposite = false;
        } else {
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;    // essence of break statement.
                }
            }
        }

        if (isComposite) {
            System.out.println(n + " is a Composite Number");
        } else {
            System.out.println(n + " is Not a Composite Number");
        }

        sc.close();
    }
}


/*

Definition of Composite Number:
-- A composite number is a positive integer greater than 1 that has more than two factors (divisors).
A composite number has factors other than 1 and itself.
Numbers 0 and 1 are neither prime nor composite.


Examples:
4 → Factors: 1, 2, 4 → Composite
6 → Factors: 1, 2, 3, 6 → Composite
12 → Factors: 1, 2, 3, 4, 6, 12 → Composite


Non-Examples:
2 → Factors: 1, 2 → Prime (not composite)
7 → Factors: 1, 7 → Prime (not composite)
1 → Only one factor → Neither prime nor composite


A short way to remember it:
Composite Number = A number greater than 1 having more than 2 factors.

-- more Optimised way when using Math.sqrt():

for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
        isComposite = true;
        break;
    }
}

*/

