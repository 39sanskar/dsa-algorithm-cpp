package if_else;

import java.util.Scanner;

// Take 3 positive integers input and print the greatest of them.

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // =====================================================
        // CASE 1 : All numbers are equal
        // =====================================================

        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        }

        // =====================================================
        // CASE 2 : Two numbers are equal and greatest
        // =====================================================

        else if (a == b && a > c) {
            System.out.println(a + " and " + b
                    + " are equal and Greatest.");
        }
        else if (b == c && b > a) {
            System.out.println(b + " and " + c
                    + " are equal and Greatest.");
        }
        else if (a == c && a > b) {
            System.out.println(a + " and " + c
                    + " are equal and Greatest.");
        }

        // =====================================================
        // CASE 3 : One number is greatest
        // =====================================================

        else if (a > b && a > c) {
            System.out.println(a + " is the Greatest Number.");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the Greatest Number.");
        }
        else {
            System.out.println(c + " is the Greatest Number.");
        }

        sc.close();
    }
}
