package loops;

import java.util.Scanner;

// Count digits of a Number.
public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");
        int n = sc.nextInt();

        // Handle negative numbers
        n = Math.abs(n);
        int count = 0;
        if (n == 0) { // here 0 is a digit number that's count is 1.
            count = 1;
        } else {
            while (n != 0) {
                n /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in a number is: " + count);
        sc.close();
    }
}
