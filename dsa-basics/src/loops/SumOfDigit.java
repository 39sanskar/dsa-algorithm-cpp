package loops;

import java.util.Scanner;

// Print sum of digits of a number
public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");
        int n = sc.nextInt();

        n = Math.abs(n); // Handle negative numbers

        int sum = 0;

        while (n > 0) {
            // Apply all the below steps in sequence.

            int digit = n % 10; // Extract last digit
            sum += digit;       // Add digit
            n /= 10;            // Remove last digit
        }
        System.out.println("Sum of Digits: " + sum);
        sc.close();
    }
}

//  Hint no.1 : 5 + 6 + 1 + 4 + 2 = 2 + 4 + 1 + 6 + 5
//  Hint no.2:  n %10

/*

a % b = a (if a < b)    // Property
5 % 10 = 5

(-a)% b = -(a%b)   // Property

*/
