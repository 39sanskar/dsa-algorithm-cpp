package if_else;

import java.util.Scanner;

// Take real number input and check if it is an integer or not.

public class IsInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // details in OOPS

        System.out.print("Enter Number: "); // eg. 3.14

        double n = sc.nextDouble();

        // Typecasting double to int
        int x = (int) n;  // typecasting (here convert it into integer) eg. x = 3

        // Checking
        if (n - x == 0) {  // Alternative: (n - (int)n == 0)  System.out.println("Is an Integer");
            System.out.println("Is an Integer");
        } else {
            System.out.println("Not an Integer");
        }

        sc.close();
    }
}
