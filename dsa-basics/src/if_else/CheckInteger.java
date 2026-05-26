package if_else;

// Take real number input and check if it is an integer or not.

import java.util.Scanner;

public class CheckInteger {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking real number input
        System.out.print("Enter a real number: ");
        double number = sc.nextDouble();

        // Checking whether number is integer or not
        if (number == (int) number) {
            System.out.println(number + " is an Integer");
        } else {
            System.out.println(number + " is NOT an Integer");
        }

        // Closing scanner
        sc.close();
    }
}

/*

A real number is any number that can exist on the number line.
It includes:
Positive numbers → 5, 12
Negative numbers → -7, -15
Zero → 0
Decimal numbers → 3.14, -2.5
Fractions → 1/2, 3/4

Types of Real Numbers
1. Integers
Whole numbers without decimals.
-5, -2, 0, 4, 10

2. Rational Numbers
Numbers that can be written in fraction form.
1/2, 0.75, -3.5

3. Irrational Numbers
Numbers that cannot be written exactly as fractions.
√2, π, √5

Examples of Real Numbers
5
-10
0
3.14
-7.25
1/3
√2


Not Real Numbers
Imaginary numbers are not real numbers.
Example:  √-1
This is an imaginary number, not a real number.

 */