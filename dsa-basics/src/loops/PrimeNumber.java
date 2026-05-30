package loops;

import java.util.Scanner;

// Write a Program to check if a given number is prime or not.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

        sc.close();
    }
}

/*

Definition of Prime Number:
A prime number is a positive integer greater than 1 that has exactly two factors (divisors): 1 and itself.

Examples:
2 → Factors: 1, 2 → Prime
3 → Factors: 1, 3 → Prime
5 → Factors: 1, 5 → Prime
7 → Factors: 1, 7 → Prime

Non-Examples:
4 → Factors: 1, 2, 4 → Composite (not prime)
6 → Factors: 1, 2, 3, 6 → Composite (not prime)
1 → Has only one factor → Neither prime nor composite

Short definition:
Prime Number = A number greater than 1 having exactly 2 factors: 1 and itself.

 */