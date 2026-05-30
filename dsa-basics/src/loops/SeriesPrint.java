package loops;

import java.util.Scanner;

public class SeriesPrint {

    static void PrintSeriesUsingI() {
        // Starting from 99
        System.out.print("Print Series Using I: ");
        for (int i = 99; i > 0; i = i - 4) {
            System.out.print(i + " ");
        }
    }

    // Method to print the series
    static void PrintSeriesUsingFirstTermAndCommonDifference() {

        int a = 99;   // First term
        int d = -4;   // Common difference

        System.out.print("Print Series Using First Term and Common Difference: ");

        // Print until terms are positive
        while (a > 0) {
            System.out.print(a + " ");
            a += d;
        }
    }

    // Display GP  (an = ar^(n-1) ) 
    static void DisplayGP() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Terms: ");
        int n = sc.nextInt();

        int a = 1, r = 2;
        System.out.print("Required Geometric Progression is: ");
        for (int i = 0; i <= n ; i++) {
            System.out.print(a+" ");
            a *= r;
        }
    }

    public static void main(String[] args) {
        PrintSeriesUsingI();

        System.out.println();
        PrintSeriesUsingFirstTermAndCommonDifference();

        System.out.println();
        DisplayGP();
    }

}
