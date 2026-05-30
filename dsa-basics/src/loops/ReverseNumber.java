package loops;

import java.util.Scanner;

// Reverse of a number
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");
        int n = sc.nextInt();

        int reverse = 0;
        while(n != 0) {
            // All steps apply in a proper sequence.
            reverse *= 10;
            reverse += (n%10);
            n /= 10;
        }
        System.out.println(reverse);

    }
}
