package methods;

import java.util.Scanner;

// Swapping the number using Swap
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping the Number: "+ a+" "+b);
        // if you do (a = b and b = a) then it will not work ...

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping the Number: "+ a+" "+b);
    }
}

// Enter the value of a: 50
// Enter the value of b: 90
// Before Swapping the Number: 50 90
// After Swapping the Number: 90 50

