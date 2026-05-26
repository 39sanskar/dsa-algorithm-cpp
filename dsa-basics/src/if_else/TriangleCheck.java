package if_else;

import java.util.Scanner;

// Take 3 positive integers input and tell if they can be the sides of a triangle or not.

public class TriangleCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Checking triangle condition
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("These sides can form a Triangle.");
        } else {
            System.out.println("These sides cannot form a Triangle.");
        }

        sc.close();
    }
}

// Priority: Arithmetic > Relational Operator.
// Triangle Inequality Theorem => a+b>c, b+c>a, c+a>b

