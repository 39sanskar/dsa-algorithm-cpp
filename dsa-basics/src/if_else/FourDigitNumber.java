package if_else;

// Take positive integer input and tell if it is a four-digit number or not.

import java.util.Scanner;


public class FourDigitNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a Positive NUmber");
        }
        // Checking four-digit number
       //  else if (999 < n < 10000)   // It is not valid in Programming, but valid in Maths.
        else if (n > 999 && n < 10000) {
            System.out.println("It is a Four Digit Number.");
        } else {
            System.out.println("It is NOT a Four Digit Number.");
        }

        sc.close();
    }
}
