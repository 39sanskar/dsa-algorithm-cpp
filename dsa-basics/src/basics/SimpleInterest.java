package basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + si);

        sc.close();
    }
}

// Take all values in the double format. so we got accurate answer.

