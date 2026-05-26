package basics;

public class IncrementDecrement {

    public static void main(String[] args) {
        // --------------------------------------------------
        // NORMAL UPDATE OF VARIABLE
        // --------------------------------------------------

        int ajay69 = 10;

        System.out.println(ajay69); // 10

        ajay69 = ajay69 + 6;
        System.out.println(ajay69); // 16

        ajay69 = ajay69 * 4;
        System.out.println(ajay69); // 64


        // --------------------------------------------------
        // SHORTCUT OPERATORS
        // --------------------------------------------------
        // +=  Addition Assignment
        // -=  Subtraction Assignment
        // *=  Multiplication Assignment
        // /=  Division Assignment
        // %=  Modulus Assignment
        // --------------------------------------------------

        int x = 11;

        x += 6; // x = x + 6
        System.out.println(x); // 17

        x *= 4; // x = x * 4
        System.out.println(x); // 68

        x -= 10; // x = x - 10
        System.out.println(x); // 58


        // --------------------------------------------------
        // INCREMENT OPERATOR
        // --------------------------------------------------
        // ++ increases value by 1
        // --------------------------------------------------

        int y = 10;

        System.out.println(y++);

        // Post Increment
        // First print the value
        // Then increase by 1
        //
        // Output => 10

        System.out.println(y);

        // Now value becomes 11


        // --------------------------------------------------
        // PRE INCREMENT
        // --------------------------------------------------

        int a = 5;

        System.out.println(++a);

        // Pre Increment
        // First increase value
        // Then print
        //
        // Output => 6

        System.out.println(a); // 6


        // --------------------------------------------------
        // DECREMENT OPERATOR
        // --------------------------------------------------
        // -- decreases value by 1
        // --------------------------------------------------

        int b = 8;

        System.out.println(b--);

        // Post Decrement
        // First print
        // Then decrease
        //
        // Output => 8

        System.out.println(b); // 7


        // --------------------------------------------------
        // PRE DECREMENT
        // --------------------------------------------------

        int c = 20;

        System.out.println(--c);

        // First decrease
        // Then print
        //
        // Output => 19

        System.out.println(c); // 19
    }
}


/*

IMPORTANT POINTS
-----------------

1. ++  => Increment Operator
   Increases value by 1

2. --  => Decrement Operator
   Decreases value by 1

---------------------------------
POST INCREMENT
x++

Step:
1. Use current value
2. Increase value

Example:
int x = 5;
System.out.println(x++);

Output => 5
Now x becomes 6

---------------------------------
PRE INCREMENT
++x

Step:
1. Increase value
2. Use updated value

Example:
int x = 5;
System.out.println(++x);

Output => 6

---------------------------------
POST DECREMENT
x--

First use value
Then decrease

---------------------------------
PRE DECREMENT
--x

First decrease value
Then use updated value

*/

