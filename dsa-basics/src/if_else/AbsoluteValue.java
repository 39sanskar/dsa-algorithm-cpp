package if_else;

// Take integer input and print the absolute value of that integer

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Finding absolute value
        if (number < 0) {
            number = -number;
        }

        // Printing absolute value
        System.out.println("Absolute value is: " + number);

        // Closing scanner
        sc.close();
    }
}

/*

The absolute value of a number is its distance from 0 on the number line, without considering the sign.
- Absolute value is always positive or zero.
- It removes the negative sign from a negative number.

Examples:

Absolute value of 5   = 5
Absolute value of -5  = 5
Absolute value of 0   = 0

Mathematical Representation
The absolute value of a number is written between vertical bars: |x|

Example:
|-10| = 10
|7|   = 7

*/
