package if_else;

import java.util.Scanner;

// Take positive integer input and tell if it is divisible by 5 or 3.

public class DivisibleBy5Or3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking divisibility
        if (number % 5 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 5 or 3.");
        } else {
            System.out.println(number + " is NOT divisible by 5 or 3.");
        }

        sc.close();
    }
}
