package if_else;

import java.util.Scanner;

// Take 3 positive integers input and print the least of them.

public class LeastNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Checking if all numbers are equal
        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        }
        // Checking least number
        else if (a <= b && a <= c) {
            System.out.println(a + " is the Least Number.");
        }
        else if (b <= a && b <= c) {
            System.out.println(b + " is the Least Number.");
        }
        else {
            System.out.println(c + " is the Least Number.");
        }

        sc.close();
    }
}
