package methods;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println(Math.pow(a, b));

        sc.close();
    }
}

