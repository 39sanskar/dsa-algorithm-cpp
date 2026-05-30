package loops;

import java.util.Scanner;

// Take a number input and print all of its factor.
public class PrintAllFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }
}
