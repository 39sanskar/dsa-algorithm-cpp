package if_else;

import java.util.Scanner;

public class NestedIfElseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Attendance Percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Outer if
        if (attendance >= 75) {

            System.out.println("Eligible for Exam");

            // Inner if
            if (marks >= 33) {

                System.out.println("Student Passed");

            } else {

                System.out.println("Student Failed");
            }

        } else {

            System.out.println("Not Eligible for Exam");
        }

        sc.close();
    }
}


/*

if (condition1) {

    // code

    if (condition2) {

        // code

    } else {

        // code
    }

} else {

    // code
}


Nested If-Else Definition:
A Nested If-Else means writing an if-else statement inside another if-else statement.
It is used when a condition depends on another condition.

 */