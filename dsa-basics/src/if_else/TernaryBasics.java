package if_else;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TernaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

//        if (n%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");


        // condition ? sach (when condition is true then it will be print) : jhoot (if condition is false then it will be print)
        System.out.println(n +" is "+((n%2 == 0) ? "Even": "Odd"));

        // Search in Google
        // In Java this will not work (basically we do not write printable statement in JAVA but it work on C++)
        // (n %2 == 0) ? System.out.println("Even") ? System.out.println("Odd");

    }
}

/*

// (n %2 == 0) ? System.out.println("Even") ? System.out.println("Odd");
//Because:
//Ternary operator requires : between true and false parts.
//        System.out.println() is a statement, not a value expression in this context.

*/
