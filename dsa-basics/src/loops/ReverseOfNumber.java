package loops;

import java.util.Scanner;

// Reverse of a number
public class ReverseOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        n = Math.abs(n);

        while (n != 0) {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        if (original < 0) {
            reverse = -reverse;
        }
        System.out.println("Reverse Number: " + reverse);
        sc.close();
    }
}
