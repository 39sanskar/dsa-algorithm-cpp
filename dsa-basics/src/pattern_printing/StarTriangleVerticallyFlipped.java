package pattern_printing;

import java.util.Scanner;

// Method-1: Consider this is a square.
public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output:

Enter the value of n: 4
      *
    * *
  * * *
* * * *

Enter the value of n: 5
        *
      * *
    * * *
  * * * *
* * * * *

*/

/*

Conclusion (Method-1: Consider the Pattern as a Square)
In this approach, we treat the triangle as an n × n square and visit every position (i, j) inside the square.
Instead of separately calculating the number of spaces and stars, we use a single condition:

if (i + j > n)

If the condition is true, print *.
Otherwise, print spaces.

This condition divides the square into two regions:
Upper-left region → spaces
Lower-right region → stars

As i increases, the number of positions satisfying i + j > n also increases, automatically forming a right-angled triangle aligned to the right side.

Key Idea: Think of the pattern as a square and decide for each cell whether it should contain a star or a space based on its row and column indices.

Advantages:

- Uses a single nested loop structure.
- Easy to create many patterns by changing only the condition.
- Helps develop pattern-recognition skills using coordinates (i, j).

Time and Space Complexity:
- Time Complexity: O(n²) (every cell of the square is visited)
- Space Complexity: O(1) (no extra space used)

Pattern Formula:
For a triangle of size n:

Print '*' if (i + j > n)
Print ' ' otherwise


 */