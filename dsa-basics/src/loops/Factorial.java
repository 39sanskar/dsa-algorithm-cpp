package loops;

//  Factorial of a number.
import java.util.Scanner;
public class Factorial {

    // Using For Loop
    static long factorialFor(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Using While Loop
    static long factorialWhile(int n) {
        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        return fact;
    }

    // Using Recursion
    static long factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial using For Loop      : " + factorialFor(n));
            System.out.println("Factorial using While Loop    : " + factorialWhile(n));
            System.out.println("Factorial using Recursion     : " + factorialRecursion(n));
        }

        sc.close();
    }
}

/*

Important Interview Points
- 0! = 1
- Factorial of a negative number is not defined.
- Use long instead of int because factorial values grow very quickly.
- Iterative solution (loop) is generally preferred over recursion because it uses less memory.

Time Complexity
Loop Method: O(n)
Recursive Method: O(n)

Space Complexity
Loop Method: O(1)
Recursive Method: O(n) (due to function call stack)

Example Outputs:

Input: 4
Output: 24

Input: 5
Output: 120

Input: 0
Output: 1

Method Summary:

| Method     | Time Complexity | Space Complexity |
| ---------- | --------------- | ---------------- |
| For Loop   | O(n)            | O(1)             |
| While Loop | O(n)            | O(1)             |
| Recursion  | O(n)            | O(n)             |

*/
