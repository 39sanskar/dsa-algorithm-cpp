package methods;

import java.util.Scanner;

// Find the Maximum of the three given Number using Builtin function.
public class MaxOfThreeNumberBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));       // Important step
        System.out.print("Maximum Number = "+ max);

        sc.close();
    }
}
