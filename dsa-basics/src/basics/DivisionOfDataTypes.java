package basics;

public class DivisionOfDataTypes {
    public static void main(String[] args) {

        // integer / integer => integer
        int a = 5 / 2;
        System.out.println("5 / 2 = " + a);

        // integer / double => double
        double b = 5 / 2.0;
        System.out.println("5 / 2.0 = " + b);

        // double / integer => double
        double c = 5.0 / 2;
        System.out.println("5.0 / 2 = " + c);

        // double / double => double
        double d = 5.0 / 2.0;
        System.out.println("5.0 / 2.0 = " + d);
    }
}


/*

RULES OF TYPE CONVERSION IN JAVA
--------------------------------

1. int + int       => int
2. int - int       => int
3. int * int       => int
4. int / int       => int

Example:
5 + 2  => 7
5 - 2  => 3
5 * 2  => 10
5 / 2  => 2


--------------------------------

5. int + double    => double
6. int - double    => double
7. int * double    => double
8. int / double    => double

Example:
5 + 2.0  => 7.0
5 - 2.0  => 3.0
5 * 2.0  => 10.0
5 / 2.0  => 2.5


--------------------------------

9. double + int    => double
10. double - int   => double
11. double * int   => double
12. double / int   => double


Example:
5.0 + 2  => 7.0
5.0 - 2  => 3.0
5.0 * 2  => 10.0
5.0 / 2  => 2.5


--------------------------------

13. double + double => double
14. double - double => double
15. double * double => double
16. double / double => double

Example:
5.0 + 2.0  => 7.0
5.0 - 2.0  => 3.0
5.0 * 2.0  => 10.0
5.0 / 2.0  => 2.5


--------------------------------

IMPORTANT RULE:
If any one operand is double,
the final result becomes double.

*/
