package methods;

public class PowerFunctionExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        double result;

        // Here second argument is NaN,
        // output will be NaN
        result = Math.pow(2, nan);
        System.out.println(result);

        // Here second argument is zero
        result = Math.pow(1254, 0);
        System.out.println(result);

        // Here second argument is one
        result = Math.pow(5, 1);
        System.out.println(result);

        System.out.println(Math.pow(-3.1415, -3.1415)); //  NaN
        System.out.println(Math.pow(0, 0));  // 1.0  // that is wrong...
    }
}

/*

Important Points:

- Any number raised to the power of 0 equals 1. This is a fundamental rule in mathematics, known as the "zero exponent rule." For example, 5⁰ = 1, 10⁰ = 1, etc.
- Any number raised to the power of 1 is the number itself. This is because raising a number to the power of 1 does not change its value. For example, 5¹ = 5, 10¹ = 10, etc.
- If the exponent is "NaN" (Not a Number), the result of the power operation becomes "NaN" as well.
- When the base is 0 and the exponent is a negative number (e.g., 0 raised to a negative power), it results in infinity.
- If the base is "NaN" (Not a Number), any power of it also results in "NaN."
- When the base is negative, the exponent must be an integer; otherwise, the result is not a real number.

*/

/*

Key features and Special Cases
The below table demonstrates the special cases:

+--------------------------+----------------------------------+
| Case                     | Result                           |
+--------------------------+----------------------------------+
| exponent = 0             | 1.0 (any number⁰ = 1)            |
| exponent = 1             | Same as base (e.g., 5¹ = 5)      |
| exponent = NaN           | NaN (Not a Number)               |
| base = 0, exponent < 0   | Infinity                         |
| base = NaN               | NaN                              |
+--------------------------+----------------------------------+

*/