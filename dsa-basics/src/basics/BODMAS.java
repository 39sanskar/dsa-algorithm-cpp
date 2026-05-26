package basics;

public class BODMAS {

    public static void main(String[] args) {

        // --------------------------------------------------
        // BODMAS RULE
        // --------------------------------------------------
        // B  => Bracket ()
        // O  => Order / Power
        // D  => Division /
        // M  => Multiplication *
        // A  => Addition +
        // S  => Subtraction -


        // --------------------------------------------------
        // PRIORITY OF OPERATORS
        // --------------------------------------------------
        // Highest Priority:
        //      /  *  %
        //
        // Lower Priority:
        //      +  -
        //
        // If operators have same priority,
        // then execution happens from LEFT to RIGHT.



        // --------------------------------------------------
        // EXAMPLE 1
        // --------------------------------------------------

        int x = 5 + 2 * 3;

        // Step:
        // 2 * 3 = 6
        // 5 + 6 = 11

        System.out.println(x); // 11



        // --------------------------------------------------
        // EXAMPLE 2
        // --------------------------------------------------

        int y = 20 / 5 * 2;

        // Same priority (/ and *)
        // Move LEFT to RIGHT
        //
        // 20 / 5 = 4
        // 4 * 2 = 8

        System.out.println(y); // 8



        // --------------------------------------------------
        // EXAMPLE 3
        // --------------------------------------------------

        int z = 10 + 20 - 5;

        // Same priority (+ and -)
        // Move LEFT to RIGHT
        //
        // 10 + 20 = 30
        // 30 - 5 = 25

        System.out.println(z); // 25



        // --------------------------------------------------
        // EXAMPLE 4
        // --------------------------------------------------

        int a = 10 % 3 + 2;

        // % has higher priority than +
        //
        // 10 % 3 = 1
        // 1 + 2 = 3

        System.out.println(a); // 3



        // --------------------------------------------------
        // EXAMPLE 5
        // --------------------------------------------------

        int b = (5 + 3) * 2;

        // Bracket has highest priority
        //
        // 5 + 3 = 8
        // 8 * 2 = 16

        System.out.println(b); // 16



        // --------------------------------------------------
        // EXAMPLE 6
        // --------------------------------------------------

        int c = 50 - 10 * 2 + 5;

        // 10 * 2 = 20
        // 50 - 20 + 5
        //
        // Same priority (+ and -)
        // LEFT to RIGHT
        //
        // 50 - 20 = 30
        // 30 + 5 = 35

        System.out.println(c); // 35
    }
}


/*

IMPORTANT POINTS
-----------------

1. Bracket () has highest priority.

2. /, *, % have higher priority than + and -.

3. If operators have same priority,
   execution happens from LEFT to RIGHT.

4. Always follow BODMAS rule in arithmetic expressions.

*/


// priority => /, * , % >  +, -   ==> division, multiplication and modulus has more priority as compare to addition and subtraction.

// In Arithmetic Operator who as the same priority then we go from left to right. otherwise follow BODMAS

