package basics;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side: ");
        int side = sc.nextInt();
        int square = side * side;
        System.out.println("Square of the Number: " + square);
    }
}
