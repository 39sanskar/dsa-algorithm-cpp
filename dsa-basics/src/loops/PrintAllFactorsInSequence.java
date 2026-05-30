package loops;

import java.util.Scanner;

// Take a number input and print all of its factors in sequence order.
public class PrintAllFactorsInSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        // Print smaller factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }

        // Print larger factors
        for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                // Avoid duplicate for perfect squares
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
        sc.close();
    }
}

// Factors occurs in pair: If i is a factor of n then (n/i) is also a factor of n.
// i * (n/i) => n

