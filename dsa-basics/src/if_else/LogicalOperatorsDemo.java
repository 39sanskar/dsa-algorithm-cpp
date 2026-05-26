package if_else;


import java.util.Scanner;

/*
 Logical Operators in Java

 Logical operators are used to combine
 two or more conditions and return
 a boolean result (true or false).


 &&  -> Logical AND
        Returns true only if BOTH conditions are true.

 ||  -> Logical OR
        Returns true if AT LEAST ONE condition is true.

 !   -> Logical NOT
        Reverses the result:
        true becomes false
        false becomes true
*/

public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =====================================================
        // TAKING INPUT
        // =====================================================

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your attendance percentage: ");
        int attendance = sc.nextInt();

        // =====================================================
        // LOGICAL AND (&&)
        // Both conditions must be TRUE
        // =====================================================

        System.out.println("\n===== LOGICAL AND (&&) =====");

        // Student can sit in exam only if:
        // marks >= 40 AND attendance >= 75

        if (marks >= 40 && attendance >= 75) {

            System.out.println("Eligible for Exam");

        } else {

            System.out.println("Not Eligible for Exam");
        }

        // =====================================================
        // LOGICAL OR (||)
        // At least one condition must be TRUE
        // =====================================================

        System.out.println("\n===== LOGICAL OR (||) =====");

        // Person can get discount if:
        // age < 18 OR age > 60

        if (age < 18 || age > 60) {

            System.out.println("Eligible for Special Discount");

        } else {

            System.out.println("Not Eligible for Special Discount");
        }

        // =====================================================
        // LOGICAL NOT (!)
        // Reverses the result
        // =====================================================

        System.out.println("\n===== LOGICAL NOT (!) =====");

        boolean isRaining = false;

        // !false = true

        if (!isRaining) {

            System.out.println("You can play outside");

        } else {

            System.out.println("Stay inside");
        }

        // =====================================================
        // COMBINED LOGICAL OPERATORS
        // =====================================================

        System.out.println("\n===== COMBINED CONDITIONS =====");

        // Eligible for placement:
        // age >= 18
        // AND marks >= 60
        // AND attendance >= 75

        if (age >= 18 && marks >= 60 && attendance >= 75) {

            System.out.println("Eligible for Placement");

        } else {

            System.out.println("Not Eligible for Placement");
        }

        // =====================================================
        // REAL WORLD LOGIN EXAMPLE
        // =====================================================

        System.out.println("\n===== LOGIN EXAMPLE =====");

        boolean correctEmail = true;
        boolean correctPassword = false;

        // Login successful only if both are true

        if (correctEmail && correctPassword) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Invalid Credentials");
        }

        // =====================================================
        // VOTING SYSTEM
        // =====================================================

        System.out.println("\n===== VOTING SYSTEM =====");

        boolean hasVoterID = true;

        if (age >= 18 && hasVoterID) {

            System.out.println("Eligible to Vote");

        } else {

            System.out.println("Not Eligible to Vote");
        }

        // =====================================================
        // EVEN AND POSITIVE NUMBER CHECK
        // =====================================================

        System.out.println("\n===== NUMBER CHECK =====");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0 && number % 2 == 0) {

            System.out.println("Positive Even Number");

        } else {

            System.out.println("Condition Not Matched");
        }

        // =====================================================
        // FINAL BOOLEAN EXAMPLES
        // =====================================================

        System.out.println("\n===== BOOLEAN RESULTS =====");

        System.out.println(true && true);   // true
        System.out.println(true && false);  // false

        System.out.println(true || false);  // true
        System.out.println(false || false); // false

        System.out.println(!true);          // false
        System.out.println(!false);         // true

        sc.close();
    }
}
