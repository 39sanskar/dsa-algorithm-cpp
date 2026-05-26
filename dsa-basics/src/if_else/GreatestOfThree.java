package if_else;

import java.util.Scanner;

// Find the greatest among three numbers
// using Nested If-Else

public class GreatestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        // Finding greatest number
        if (a >= b) {

            if (a >= c) {
                System.out.println(a + " is the Greatest Number.");
            } else {
                System.out.println(c + " is the Greatest Number.");
            }

        } else {

            if (b >= c) {
                System.out.println(b + " is the Greatest Number.");
            } else {
                System.out.println(c + " is the Greatest Number.");
            }
        }

        sc.close();
    }
}


// Using Ternary Operator
// (a > b) ? ((a < c)?a:c): ((b>c)?b:c);

