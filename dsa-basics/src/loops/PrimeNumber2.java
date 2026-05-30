package loops;

import java.util.Scanner;

// Write a Program to check if a given number is prime or not.
public class PrimeNumber2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean flag = true; // true means prime

        if (n <= 1) {
            System.out.println("Neither Prime nor Composite");
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {  // Using built in Math.sqrt() function its code become more optimised.
                if (n % i == 0) {
                    flag = false; // false means composite
                    break;
                }
            }

            if (!flag)
                System.out.println("Composite Number!");
            else
                System.out.println("Prime Number!");
        }

        sc.close();
    }
}


/*

Concept:

-- If i is a factor of n then (n/i) is also a factor of n. { factor occurs in pairs }
--  i*(n/i) = n
--  i == n/i  => i^2 = n hence i = √n. so √n is the point check up to √n.

-- The number of factors before the √n and the number of factors after the square root of n are equal in count.
-- Factors of a number occur in pairs. The count of factors before √n and after √n is equal.

-- 60 = 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30 60  => here √60 is lie in between 6 and 10.

 */

