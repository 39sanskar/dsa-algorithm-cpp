package if_else;

import java.util.Scanner;

// Take integer input and tell if its magnitude is smaller than 69 or not.

public class MagnitudeCheck1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Finding magnitude manually
        if (number < 0) {
            number = -number;
        }
        // Checking condition
        if (number < 69) {
            System.out.println("Magnitude is smaller than 69.");
        } else {
            System.out.println("Magnitude is NOT smaller than 69.");
        }

        sc.close();
    }
}