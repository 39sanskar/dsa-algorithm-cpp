package loops;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter power (b): ");
        int b = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= b ; i++) {
            result *= a;
        }

        System.out.println(a + " raised to power " +  b + " is: "+ a + "^" + b + " = " + result);

        sc.close();

    }
}

/*

Special Cases:

a^0 = 1      (e.g., 5^0 = 1)
0^b = 0      (for b > 0)
1^b = 1

*/