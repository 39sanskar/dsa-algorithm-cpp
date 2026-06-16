package pattern_printing;

import java.util.Scanner;
// Implement using (i+j)%2 (implementing odd, even) method.

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
Output:

Enter the value of n: 5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

/*
Logic uses:
print 1 => when i+j is even.
print 0 => when i+j is odd.

if (i is odd & j is odd) --> print 1
if (i is odd & j is even) --> print 0
if (i is even & j is even) --> print 1
if (i is even & j is odd) --> print 0

*/
