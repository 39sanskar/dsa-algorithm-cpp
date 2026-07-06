package methods;

import java.util.Scanner;
// A built-in function can be treated like any other value, such as a number or a string.
// This concept exists in some programming languages where functions are first-class citizens.
// "Builtin function itself as a value" means using the function object itself, rather than immediately calling it and using its return value.

public class BuiltInMathFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value of number n: ");
        double n = sc.nextDouble();

        // ===========================
        // BASIC MATHEMATICAL FUNCTIONS
        // ===========================

        System.out.println("Math.abs(n) = " + Math.abs(n)); // Returns the absolute (positive) value of a number.

        System.out.println("Math.sqrt(n) = " + Math.sqrt(n)); // Returns the square root of a number.

        System.out.println("Math.cbrt(n) = " + Math.cbrt(n)); // Returns the cube root of a number.

        System.out.println("Math.pow(n, 2) = " + Math.pow(n, 2)); // Returns n raised to the power of 2.

        System.out.println("Math.signum(n) = " + Math.signum(n)); // Returns -1, 0, or 1 depending on the sign of n.

        // ===========================
        // ROUNDING FUNCTIONS
        // ===========================

        System.out.println("Math.ceil(n) = " + Math.ceil(n)); // Rounds UP to the nearest integer.

        System.out.println("Math.floor(n) = " + Math.floor(n)); // Rounds DOWN to the nearest integer.

        System.out.println("Math.round(n) = " + Math.round(n)); // Rounds to the nearest whole number.

        System.out.println("Math.rint(n) = " + Math.rint(n)); // Rounds to the nearest double value.

        // ===========================
        // MAXIMUM & MINIMUM
        // ===========================

        System.out.println("Math.max(n, 100) = " + Math.max(n, 100)); // Returns the larger of two numbers.

        System.out.println("Math.min(n, 100) = " + Math.min(n, 100)); // Returns the smaller of two numbers.

        // ===========================
        // RANDOM NUMBERS
        // ===========================

        System.out.println("Math.random() = " + Math.random()); // Generates a random number between 0.0 and 1.0.

        // ===========================
        // TRIGONOMETRIC FUNCTIONS
        // ===========================

        System.out.println("Math.sin(n) = " + Math.sin(n)); // Returns sine of n radians.

        System.out.println("Math.cos(n) = " + Math.cos(n)); // Returns cosine of n radians.

        System.out.println("Math.tan(n) = " + Math.tan(n)); // Returns tangent of n radians.

        System.out.println("Math.asin(0.5) = " + Math.asin(0.5)); // Returns inverse sine in radians.

        System.out.println("Math.acos(0.5) = " + Math.acos(0.5)); // Returns inverse cosine in radians.

        System.out.println("Math.atan(1) = " + Math.atan(1)); // Returns inverse tangent in radians.

        // ===========================
        // ANGLE CONVERSIONS
        // ===========================

        System.out.println("Math.toRadians(90) = " + Math.toRadians(90)); // Converts degrees to radians.

        System.out.println("Math.toDegrees(Math.PI) = "
                + Math.toDegrees(Math.PI)); // Converts radians to degrees.

        // ===========================
        // LOGARITHMIC FUNCTIONS
        // ===========================

        System.out.println("Math.log(n) = " + Math.log(n)); // Natural logarithm (base e).

        System.out.println("Math.log10(n) = " + Math.log10(n)); // Base-10 logarithm.

        System.out.println("Math.log1p(n) = " + Math.log1p(n)); // Calculates log(1 + n).

        // ===========================
        // EXPONENTIAL FUNCTIONS
        // ===========================

        System.out.println("Math.exp(n) = " + Math.exp(n)); // Calculates e raised to the power n.

        System.out.println("Math.expm1(n) = " + Math.expm1(n)); // Calculates e^n - 1.

        // ===========================
        // HYPOTENUSE
        // ===========================

        System.out.println("Math.hypot(3, 4) = " + Math.hypot(3, 4)); // Calculates sqrt(x² + y²).

        // ===========================
        // REMAINDER FUNCTIONS
        // ===========================

        System.out.println("Math.IEEEremainder(10, 3) = "
                + Math.IEEEremainder(10, 3)); // Returns IEEE 754 floating-point remainder.

        // ===========================
        // EXACT INTEGER OPERATIONS
        // ===========================

        System.out.println("Math.addExact(10, 20) = "
                + Math.addExact(10, 20)); // Adds two integers exactly.

        System.out.println("Math.subtractExact(20, 10) = "
                + Math.subtractExact(20, 10)); // Subtracts exactly.

        System.out.println("Math.multiplyExact(10, 5) = "
                + Math.multiplyExact(10, 5)); // Multiplies exactly.

        System.out.println("Math.incrementExact(10) = "
                + Math.incrementExact(10)); // Increases value by 1.

        System.out.println("Math.decrementExact(10) = "
                + Math.decrementExact(10)); // Decreases value by 1.

        System.out.println("Math.negateExact(10) = "
                + Math.negateExact(10)); // Returns negative value.

        // ===========================
        // CONSTANTS
        // ===========================

        System.out.println("Math.PI = " + Math.PI); // Math is a class, PI is a static variable (constant) of the Math class, and cbrt() is a static method of the Math class.
        // Value of π (3.14159...)

        System.out.println("Math.E = " + Math.E); // Euler's Number (2.71828...)

        sc.close();
    }
}

// Math is a class, PI is a static variable (constant) of the Math class, and cbrt() is a static method of the Math class.
// Value of π (3.14159...)
// System.out.println(Math.PI);       // Accessing the static variable PI
// System.out.println(Math.cbrt(27)); // Calling the static method cbrt()

/*

Theory (Important)

| Function                   | Description                                                                        |
| -------------------------- | ---------------------------------------------------------------------------------- |
|  Math.abs(x)               | Returns the absolute (positive) value of `x`.                                      |
|  Math.sqrt(x)              | Returns the square root of `x`.                                                    |
|  Math.cbrt(x)              | Returns the cube root of `x`.                                                      |
|  Math.pow(x, y)            | Returns `x` raised to the power `y` (`x^y`).                                       |
|  Math.signum(x)            | Returns `-1`, `0`, or `1` depending on whether `x` is negative, zero, or positive. |
|  Math.ceil(x)              | Rounds `x` up to the nearest integer and returns it as a `double`.                 |
|  Math.floor(x)             | Rounds `x` down to the nearest integer and returns it as a `double`.               |
|  Math.round(x)             | Rounds `x` to the nearest whole number.                                            |
|  Math.rint(x)              | Returns the nearest integer as a `double`.                                         |
|  Math.max(a, b)            | Returns the larger of two values.                                                  |
|  Math.min(a, b)            | Returns the smaller of two values.                                                 |
|  Math.random()             | Returns a random `double` between `0.0` (inclusive) and `1.0` (exclusive).         |
|  Math.sin(x)               | Returns the sine of an angle (in radians).                                         |
|  Math.cos(x)               | Returns the cosine of an angle (in radians).                                       |
|  Math.tan(x)               | Returns the tangent of an angle (in radians).                                      |
|  Math.asin(x)              | Returns the inverse sine (arcsine) in radians.                                     |
|  Math.acos(x)              | Returns the inverse cosine (arccosine) in radians.                                 |
|  Math.atan(x)              | Returns the inverse tangent (arctangent) in radians.                               |
|  Math.toRadians(x)         | Converts degrees to radians.                                                       |
|  Math.toDegrees(x)         | Converts radians to degrees.                                                       |
|  Math.log(x)               | Returns the natural logarithm (base e) of `x`.                                     |
|  Math.log10(x)             | Returns the base-10 logarithm of `x`.                                              |
|  Math.log1p(x)             | Returns `log(1 + x)` accurately for small values.                                  |
|  Math.exp(x)               | Returns `e^x`.                                                                     |
|  Math.expm1(x)             | Returns `e^x - 1`.                                                                 |
|  Math.hypot(x, y)          | Calculates `√(x² + y²)` without overflow/underflow issues.                         |
|  Math.IEEEremainder(x, y)  | Returns the IEEE 754 floating-point remainder of `x/y`.                            |
|  Math.addExact(x, y)       | Adds two integers and throws an exception on overflow.                             |
|  Math.subtractExact(x, y)  | Subtracts two integers and throws an exception on overflow.                        |
|  Math.multiplyExact(x, y)  | Multiplies two integers and throws an exception on overflow.                       |
|  Math.incrementExact(x)    | Increments an integer by 1 and checks for overflow.                                |
|  Math.decrementExact(x)    | Decrements an integer by 1 and checks for overflow.                                |
|  Math.negateExact(x)       | Returns the negation of a number and checks for overflow.                          |
|  Math.PI                   | Constant value of π (3.141592653589793).                                           |
|  Math.E                    | Constant value of Euler's number e (2.718281828459045).                            |

*/
