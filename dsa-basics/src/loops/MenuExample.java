package loops;

import java.util.Scanner;
// Create a MenuExample using DoWhile loop.
public class MenuExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add User");
            System.out.println("2. Delete User");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
        } while (choice != 3);

        System.out.println("Program Closed");
        sc.close();
    }
}

