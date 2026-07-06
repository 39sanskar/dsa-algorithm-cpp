package methods;

// This program demonstrates pass-by-value in Java.
// Arrays will be used later to explain how references are passed by value.
public class PassByValueAndReference {

    public static void change(int x) {
        // x is a copy of the original value.
        x = 10;
    }

    public static void main(String[] args) {
        int x = 6;

        System.out.println(x);

        // The value of x (6) is passed to the method.
        change(x);  // change is the name of the method. When we call change(x), the current value of x (which is 6) is copied and passed to the method.

        System.out.println(x);
    }
}

// Output:
// 6
// 6

/*

Important Note:
-- Java does not support pass-by-reference. Even for arrays and objects,
Java passes the reference by value, not by reference.

-- A void method does not return a value. You can use a return; statement only to exit the method early,
but you cannot return any value.

-- In Java, primitive data types (int, char, double, boolean, etc.) are always passed by value. The method receives a copy of the original value,
so modifications inside the method do not affect the original variable.

-- Execution Flow
x is created with the value 6.
System.out.println(x); prints 6.
change(x) is called. A copy of x (which is 6) is passed to the parameter x inside the change() method.
Inside change(), the copied value is changed to 10.
The original variable in main() remains 6.
System.out.println(x); prints 6 again.


-- Memory Representation

main()
------
x = 6
        │
        │ change(x)
        ▼

change()
--------
x = 6   ← Copy of the original value
x = 10  ← Only the copy changes

Back to main()
--------------
Original x = 6


Conclusion
Java is always pass-by-value.
-- For primitive data types (int, char, double, etc.), the method receives a copy of the value.
-- For objects and arrays, the method receives a copy of the reference, not the original reference itself.
This is why methods can modify the object's contents, but they cannot make the caller's variable refer to a different object.


*/