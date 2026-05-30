package loops;

import java.util.Scanner;

// Take n as input and print: 1 n 2 n-1 3 n-2 ...1
// for example when n = 5: then print => 1 5 2 4 3 3 4 2 5 1
public class PrintSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1, j = n; i <= n;  i++, j--) {
            System.out.print(i + " ");
            System.out.print(j+ " ");
        }
        sc.close();
    }
}

// Output: 1 5 2 4 3 3 4 2 5 1
