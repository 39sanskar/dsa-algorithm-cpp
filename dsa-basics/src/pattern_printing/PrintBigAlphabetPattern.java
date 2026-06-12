package pattern_printing;

import java.util.Scanner;

public class PrintBigAlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (char i = 1; i <= n; i++) {
            for (char j = 1; j <= n; j++) {
                System.out.print((char)(j+64) +" "); // Typecast
            }
            System.out.println();
        }

    }
}

/*
Summary:

| Method                    | Returns           |
| ------------------------- | ----------------- |
| `sc.nextLine()`           | String            |
| `sc.next()`               | String (one word) |
| `sc.nextLine().charAt(0)` | char              |
| `sc.next().charAt(0)`     | char              |

Output:

Please Enter the value of n: 6

A B C D E F
A B C D E F
A B C D E F
A B C D E F
A B C D E F
A B C D E F

*/
