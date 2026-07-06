package methods;

import java.util.Scanner;

// Find the Maximum of 4 Numbers using Built-in Function
public class MaxOfFourNumbersBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        System.out.print("Enter Fourth Number: ");
        int d = sc.nextInt();

        int max = Math.max(Math.max(a, b), Math.max(c, d));

        System.out.println("Maximum Number = " + max);

        sc.close();
    }
}
