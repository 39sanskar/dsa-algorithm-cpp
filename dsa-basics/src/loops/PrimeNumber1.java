package loops;

import java.util.Scanner;

// Write a Program to check if a given number is prime or not.
public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Neither Prime nor Composite");
        } else {
            int x = 0; // 0 means prime { Assume }  // if you want also using flag instead of x and assign value of flag true.
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    x = 1;   // 1 means composite { Assume } assign value of flag is false.
                    break;
                }
            }

            if (x == 1) System.out.println("Composite Number!");
            if (x == 0) System.out.println("Prime Number!");
        }
        sc.close();
    }
}

// 0 and 1 are neither prime nor composite.

