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


/*

Explanation:

Example: 12345

Steps:

0*10+5 = 5
5*10+4 = 54
54*10+3 = 543
543*10+2 = 5432
5432*10+1 = 54321

Reverse Number: 54321
Time Complexity: O(number of digits)

Only follow three steps:
1.   r *= 10
2.   r += (n%10)  => provides the last digits of the number.
3.   r /= 10

- Follow all these steps in the sequence.
*/
