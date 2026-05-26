package if_else;

import java.util.Scanner;

// Find Greatest of Three Numbers
// using Ternary Operator

public class GreatestOfThreeTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        // Important Step
        // Nested Ternary Operator
        int greatest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

        // Printing result
        System.out.println("Greatest Number = " + greatest);

        sc.close();
    }
}
