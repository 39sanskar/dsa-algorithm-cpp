package if_else;

// Take positive integer input and tell if it is odd or even

import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking whether number is positive or not
        if (number > 0) {

            // Checking odd or even
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing scanner
        sc.close();
    }
}
