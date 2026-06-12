package pattern_printing;

import java.util.Scanner;
// This is the Another Method to print the Horizontally Flipped Triangle  {Important}
public class HorizontallyFlippedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value of n: ");
        int n = sc.nextInt();
        int a = n; // no. of stars to be printed in each line
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("*"+" ");
            }
            a--;
            System.out.println();
        }

    }
}

/*

Output:

Please Enter the value of n: 5
* * * * *
* * * *
* * *
* *
*

*/