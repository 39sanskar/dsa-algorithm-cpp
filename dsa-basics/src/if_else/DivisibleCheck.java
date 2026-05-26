package if_else;

import java.util.Scanner;

// Take positive integer input and check divisibility

public class DivisibleCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // In an if-else-if ladder when one condition becomes true, its block executes and the remaining
        // else-if and else blocks are skipped.

        // Checking divisibility
        if (number % 5 == 0 && number % 3 == 0) {   // Priority first you write this statement and then write another statement.
            System.out.println(number + " is divisible by both 5 and 3");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 5 or 3");
        }

        sc.close();
    }
}
