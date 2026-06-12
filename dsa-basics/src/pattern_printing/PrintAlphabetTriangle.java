package pattern_printing;

import java.util.Scanner;
// Alphabet Triangle

public class PrintAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}


/*
Conclusion:

1. The outer loop (i) controls the number of rows.
2. The inner loop (j) controls the number of columns/elements in each row.
3. Since the inner loop runs from 1 to i, each row contains as many characters as its row number.
4. j is converted to uppercase alphabets using:
      (char)(j + 64)
   because:
      A = 65, B = 66, C = 67, ...
5. Therefore:
      Row 1 prints: A
      Row 2 prints: A B
      Row 3 prints: A B C
      and so on.
6. This pattern is used whenever we need to print an increasing alphabet triangle
   where each row starts from A and ends at the alphabet corresponding to the row number.

Pattern Logic:
Row Number = Number of Characters Printed
Character = 'A' + (j - 1)

Example (n = 5):

A
A B
A B C
A B C D
A B C D E

*/

/*
Output:

Please Enter the value of n: 4
A
A B
A B C
A B C D


Please Enter the value of n: 5
A
A B
A B C
A B C D
A B C D E

*/
