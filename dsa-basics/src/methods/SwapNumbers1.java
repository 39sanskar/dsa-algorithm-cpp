package methods;

import java.util.Scanner;

public class SwapNumbers1 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping the Number: "+ a+" "+b);

        swap(a, b);
        System.out.println("After Swapping the Number: "+ a+" "+b);

        sc.close();
    }
}

// Important (Must be Remembered)

/*

Your program is correct, and it demonstrates an important concept in Java: primitive variables are passed by value.
Therefore, the values of a and b in main() are not swapped.

Sample Output
Input:

Enter the value of a: 5
Enter the value of b: 10

Output:

Before Swapping the Numbers: 5 10
After Swapping the Numbers: 5 10

Notice that the numbers do not change.

Why Doesn't the Swap Work?
When you call:  swap(a, b);

Java copies the values of a and b.
Initially:

main()
------
a = 5
b = 10

When swap(a, b) is called:
swap()
------
a = 5   ← copy
b = 10  ← copy

Inside swap():
int temp = a;
a = b;
b = temp;

After Swapping:
swap()
------
a = 10
b = 5

Only the copies are swapped.
When the method finishes, its local variables are destroyed.

swap() ends
The original variables in main() remain unchanged.

main()
------
a = 5
b = 10

Therefore, the output is:
Before Swapping the Numbers: 5 10
After Swapping the Numbers: 5 10

-- Memory Diagram

Before method call

main()
-------
a = 5
b = 10


            swap(a, b)
                 │
                 ▼

swap()
-------
a = 5   ← copy
b = 10  ← copy

temp = 5
a = 10
b = 5

Method ends
(Local variables are destroyed.)

main()
-------
a = 5
b = 10

-- Important Conclusion
Java always uses pass-by-value.
For primitive types (int, double, char, boolean, etc.), the method receives copies of the values.
Swapping the copied values does not affect the original variables in the calling method.

-- Rule to remember:
If you pass primitive variables to a method in Java, any modifications made to the parameters affect only the copies.
The original variables remain unchanged.
Therefore, you cannot swap two primitive variables by passing them directly to a method.

*/
