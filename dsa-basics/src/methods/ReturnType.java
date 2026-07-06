package methods;

public class ReturnType {
    public static int aman() {
        System.out.println("Aman");
        return 5; // in the last return the integer.
    }
    public static void main(String[] args) {
        System.out.println(aman()); // basically here aman() itself an integer, and it's value is 5
    }
}

// Output:
// Aman
// 5

/*

// return type ? => The return type of a function specifies what kind of value the function returns when it completes its execution.
-- Why is a return type needed?
-- The return type tells the compiler and the programmer:
-- What type of value to expect from the function.
-- How that returned value can be used.
-- Whether the function returns a value at all.

-- Method Returning an int

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum = " + sum);
    }
}

Output: Sum = 30

Explanation:
int is the return type.
The method returns the integer value a + b.
The returned value is stored in the variable sum.


// A function has two jobs:
// 1. Execute the code written inside it.
// 2. The function itself can produce (return) a value.


*/
