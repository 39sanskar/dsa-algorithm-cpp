package pattern_printing;

import java.util.Scanner;

// Implement using variable "a".
public class OddNumberTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = 1; // initialize new variable
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a += 2;   // increased by 2
            }
            System.out.println();
        }
    }
}


/*
Output:

Enter the value of n: 5
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9

*/


/*
Conclusion:

1. The outer loop (i) controls the number of rows.
2. For every new row, the variable 'a' is initialized to 1.
3. The inner loop (j) controls how many odd numbers are printed in that row.
4. After printing an odd number, 'a' is increased by 2:
      a += 2
   This generates the sequence:
      1, 3, 5, 7, 9, ...
5. Since 'a' is re-initialized to 1 for every row, each row starts again from 1.
6. The ith row contains the first i odd numbers.

Pattern Logic:
Start with a = 1
Print a
Increase a by 2
Repeat until the row is completed

Example (n = 4):

1
1 3
1 3 5
1 3 5 7

Observation:
- Odd numbers differ by 2.
- Resetting 'a' inside the outer loop makes every row start from 1.
- Moving 'a' outside the outer loop would create a continuous odd-number pattern.

*/
