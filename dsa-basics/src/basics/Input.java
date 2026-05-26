package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // How to take input from user.
        Scanner sc = new Scanner(System.in); // here sc is the object and Scanner is the class.

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}

