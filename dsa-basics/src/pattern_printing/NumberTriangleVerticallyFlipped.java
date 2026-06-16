package pattern_printing;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  "); // print space
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");  // print number
            }
            System.out.println(); // print new line
        }
    }
}


/*
Output:

Enter the value of n: 5
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5

*/