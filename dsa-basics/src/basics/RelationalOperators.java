package basics;

// Relational Operators => used to compare two values or quantities

public class RelationalOperators {

    public static void main(String[] args) {

        // =====================================================
        // RELATIONAL OPERATORS IN JAVA
        // =====================================================

        // Operators:
        // ==   -> Equal to
        // !=   -> Not equal to
        // >    -> Greater than
        // <    -> Less than
        // >=   -> Greater than or equal to
        // <=   -> Less than or equal to


        // =====================================================
        // BASIC EXAMPLES
        // =====================================================

        System.out.println("===== BASIC EXAMPLES =====");

        System.out.println(5 > 3);    // true
        System.out.println(5 < 3);    // false

        System.out.println(10 == 10); // true
        System.out.println(10 != 5);  // true

        System.out.println(7 >= 7);   // true
        System.out.println(8 <= 4);   // false


        // =====================================================
        // USING VARIABLES
        // =====================================================

        System.out.println("\n===== USING VARIABLES =====");

        int a = 50;
        int b = 25;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(a > b);   // true
        System.out.println(a < b);   // false
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a >= b);  // true
        System.out.println(a <= b);  // false


        // =====================================================
        // BOOLEAN VARIABLES
        // =====================================================

        System.out.println("\n===== BOOLEAN VARIABLES =====");

        boolean x = true;
        boolean y = false;

        System.out.println(x); // true
        System.out.println(y); // false

        // boolean flag = (boolean)1;  This is invalid in Java ❌
        //It will give a compilation error.


        // boolean z = 1;
        // boolean p = 0; // In Java, boolean can store only true or false.

        // But in C/C++: 1 means true and 0 means false so boolean in C++ can store 0 and 1.


        // =====================================================
        // STUDENT MARKS EXAMPLE
        // =====================================================

        System.out.println("\n===== STUDENT MARKS EXAMPLE =====");

        int marks = 76;

        // Pass or fail
        System.out.println(marks >= 33); // true

        // Topper check
        System.out.println(marks > 90); // false

        // Exact marks check
        System.out.println(marks == 76); // true


        // =====================================================
        // AGE EXAMPLE
        // =====================================================

        System.out.println("\n===== AGE EXAMPLE =====");

        int age = 20;

        // Eligible for voting?
        System.out.println(age >= 18); // true

        // Child check
        System.out.println(age < 18); // false

        // Senior citizen check
        System.out.println(age >= 60); // false


        // =====================================================
        // BANK BALANCE EXAMPLE
        // =====================================================

        System.out.println("\n===== BANK BALANCE EXAMPLE =====");

        int balance = 5000;
        int withdraw = 2000;

        // Can withdraw money?
        System.out.println(balance >= withdraw); // true

        // Low balance check
        System.out.println(balance < 1000); // false


        // =====================================================
        // TEMPERATURE EXAMPLE
        // =====================================================

        System.out.println("\n===== TEMPERATURE EXAMPLE =====");

        int temperature = 42;

        // Very hot weather?
        System.out.println(temperature > 40); // true

        // Cold weather?
        System.out.println(temperature < 10); // false


        // =====================================================
        // MOBILE BATTERY EXAMPLE
        // =====================================================

        System.out.println("\n===== MOBILE BATTERY EXAMPLE =====");

        int battery = 15;

        // Low battery warning
        System.out.println(battery <= 20); // true

        // Fully charged?
        System.out.println(battery == 100); // false


        // =====================================================
        // GAME SCORE EXAMPLE
        // =====================================================

        System.out.println("\n===== GAME SCORE EXAMPLE =====");

        int player1 = 450;
        int player2 = 600;

        System.out.println(player1 > player2);  // false
        System.out.println(player1 < player2);  // true
        System.out.println(player1 == player2); // false
        System.out.println(player1 != player2); // true


        // =====================================================
        // CHARACTER COMPARISON
        // =====================================================

        System.out.println("\n===== CHARACTER COMPARISON =====");

        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println(ch1 == ch2); // false
        System.out.println(ch1 != ch2); // true
        System.out.println(ch1 < ch2);  // true

        // ASCII value of A is smaller than B


        // =====================================================
        // REAL WORLD EXAMPLE : SHOPPING
        // =====================================================

        System.out.println("\n===== SHOPPING EXAMPLE =====");

        int itemPrice = 1200;
        int walletMoney = 1500;

        // Can buy item?
        System.out.println(walletMoney >= itemPrice); // true

        // Not enough money?
        System.out.println(walletMoney < itemPrice); // false


        // =====================================================
        // FINAL SUMMARY
        // =====================================================

        System.out.println("\n===== FINAL SUMMARY =====");

        int m = 100;
        int n = 200;

        System.out.println("m > n  = " + (m > n)); // false
        System.out.println("m < n  = " + (m < n)); // true
        System.out.println("m == n = " + (m == n)); // false
        System.out.println("m != n = " + (m != n)); // true
        System.out.println("m >= n = " + (m >= n)); // false
        System.out.println("m <= n = " + (m <= n)); // true
    }
}
