package loops;

import java.util.Scanner;

public class PrintEvenOddNumbers {

    // Print Even Numbers: Print even numbers from 1 to 100
     static void EvenNumbers() {
         for (int i = 0; i < 100; i++) {
             if (i%2 == 0) System.out.print(i +" ");
         }
     }

     // Print Odd Numbers: Print odd numbers from 1 to 100
    static void OddNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0) System.out.print(i+" ");
        }
    }

    // Print 15 Table
    static void PrintTable() {
        for (int i = 15; i <= 150 ; i = i + 15) {
            System.out.print(i+" ");
        }
    }

    // Print all odd numbers divisible by 3 from 1 to 100
    static void OddNumberDivisibleBy3() {
        System.out.print("Odd Number Divisible by Three is: ");
        for (int i = 1; i < 100; i++) {
            if (i%2 != 0 && i%3 == 0) System.out.print(i+" ");
        }
    }

    // Print the Table of n. and take n from the users
    static void PrintTableOfN() {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
         System.out.print("Table Of the "+ n + " is: ");
         // fori
         for (int i = 1; i <= 10; i++) {
             System.out.print(i*n+" ");
         }
    }

    // Main Function
    public static void main(String[] args) {
        System.out.print("Even Numbers are: ");
        EvenNumbers();                    //  Calling Function

        System.out.println();
        System.out.print("Odd Numbers are: ");

        OddNumbers();
        System.out.println();

        System.out.print("Table Of 15 is: ");
        PrintTable();

        System.out.println();
        OddNumberDivisibleBy3();

        System.out.println();
        PrintTableOfN();

    }
}

// using shortcut: fori
