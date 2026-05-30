package loops;

// Print Aman and Sunday ‘n’ times. Take ‘n’ input from user
import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Printing statement n times
        for (int i = 1; i <= n; i++) {
            System.out.println("Aman and Sunday!");
        }
        sc.close();
    }
}
