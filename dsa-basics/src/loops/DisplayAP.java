package loops;

// Display this AP => 2,5,8,11... upto n terms. here a = 2, d = 3, an = 3n-1

import java.util.Scanner;

public class DisplayAP {

    // Print the AP upto user given number
    static void APNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Particular Number: ");
        int number = sc.nextInt();

        System.out.print("AP upto particular number: ");
        for (int i = 2; i < number; i+=3) {
            System.out.print(i+" ");
        }
    }

    static void APTerm() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Particular Term: ");
        int n = sc.nextInt();

        // 3*n-1 => Last Term
        System.out.print("AP upto particular term: ");
        for (int i = 2; i < 3*n-1; i+=3) {
            System.out.print(i+" ");
        }
    }

    // Important without Formula (when you know number of terms)
    static void AnotherMethodForAPTerm() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n for AnotherMethod: ");
        int n = sc.nextInt();

        int a = 2, d = 3;
        System.out.print("AP for Another Method: ");
        for (int i = 1; i < n; i++) {
            System.out.print(a+" ");
            a += d;
        }
    }

    public static void main(String[] args) {
        APNumber();
        System.out.println();

        APTerm();
        System.out.println();

        AnotherMethodForAPTerm();

    }
}
