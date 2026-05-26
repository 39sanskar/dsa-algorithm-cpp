package if_else;

// Take positive integer input and tell if it is divisible by 5 or not.

import java.util.Scanner;

public class IntegerDivisible {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if number is positive
        if (number > 0) {

            // Checking divisibility by 5
            if (number % 5 == 0) {
                System.out.println(number + " is divisible by 5");
            } else {
                System.out.println(number + " is not divisible by 5");
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing scanner
        sc.close();
    }
}
