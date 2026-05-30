package loops;

import java.util.Scanner;

// Using While loop create a LoginSystem.
public class LoginSystem {
    public static void main(String[] args) {

        System.out.println("Login Retry System (Very Common)");
        Scanner sc = new Scanner(System.in);

        String password = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter Password: ");
            String input = sc.nextLine();  // Reads the entire line of input entered by the user

            if (input.equals(password)) {
                System.out.println("Login Successful");
                break;
            }
            attempts++;
            System.out.println("Wrong Password");
        }
        if (attempts == 3) {
            System.out.println("Account Locked");
        }
        sc.close();
    }
}

