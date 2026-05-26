package basics;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sanskar = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int aman = sanskar.nextInt();
        System.out.print("Enter the Second Number: ");
        int rajan = sanskar.nextInt();

        int sum = aman + rajan;
        System.out.println("Sum of Two Number is: " + sum);

    }
}
