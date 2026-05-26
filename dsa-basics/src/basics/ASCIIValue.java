package basics;

// ASCII = American Standard Code for Information Interchange

public class ASCIIValue {
    public static void main(String[] args) {

        // --------------------------------------------------
        // TYPECASTING
        // --------------------------------------------------
        // Typecasting = Conversion from one datatype to another datatype.

        // --------------------------------------------------
        // IMPLICIT TYPECASTING (Automatic Conversion)
        // --------------------------------------------------
        // Smaller datatype -> Larger datatype
        // Done automatically by Java.

        char ch = 'A';

        int x = ch; // implicit typecasting
        System.out.println(x); // 65


        // --------------------------------------------------
        // EXPLICIT TYPECASTING (Manual Conversion)
        // --------------------------------------------------
        // Larger datatype -> Smaller datatype
        // Done manually using (datatype)

        char symbol = '$';

        int y = (int) symbol; // explicit typecasting
        System.out.println(y); // 36


        // --------------------------------------------------
        // CHARACTER TO ASCII VALUE
        // --------------------------------------------------

        char harsh = '3';
        System.out.println((int) harsh); // 51

        // char aman = '33';
        // Error: char stores only one character.


        // --------------------------------------------------
        // FIND ASCII VALUE USING + 0
        // --------------------------------------------------

        char chat = 'b';

        System.out.println(chat + 0);
        // 98
        // Adding 0 converts character into integer ASCII value.


        // --------------------------------------------------
        // CHARACTER + CHARACTER
        // --------------------------------------------------

        System.out.println(chat + chat);

        // 196
        // ASCII value of 'b' = 98
        // 98 + 98 = 196


        // --------------------------------------------------
        // FIND ASCII VALUE USING * 1 (Another way)
        // --------------------------------------------------

        System.out.println(chat * 1);

        // 98
        // Multiplying by 1 converts character into integer.


        // --------------------------------------------------
        // INTEGER TO CHARACTER
        // --------------------------------------------------

        int z = 43;

        char zh = (char) z;
        System.out.println(zh);

        // +
        // ASCII value 43 represents '+'


        int s = 32;

        char sh = (char) s;
        System.out.println(sh);

        // Blank Space
        // ASCII value 32 represents space character.

    }
}


/*

IMPORTANT ASCII VALUES
-----------------------

ASCII value of 'A' = 65
ASCII value of 'a' = 97

ASCII value of '0' = 48
ASCII value of '1' = 49
ASCII value of '2' = 50
ASCII value of '3' = 51

ASCII value of Space = 32

*/

