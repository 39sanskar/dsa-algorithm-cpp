/*
 * C++ Basics: Data Types, Operators, Casting, Input
 * ---------------------------------------------------
 * Topics covered:
 *   1. Fundamental data types
 *   2. Implicit conversion and truncation
 *   3. bool behaviour
 *   4. Integer sizes and overflow
 *   5. Arithmetic operators
 *   6. Assignment operators
 *   7. Increment / decrement (pre vs post)
 *   8. Relational and logical operators
 *   9. Bitwise operators
 *  10. Typecasting
 *  11. Ternary operator
 *  12. Output formatting
 *  13. Reading input
 */

#include <bits/stdc++.h>   // Handy for contests; prefer specific headers in real projects
using namespace std;

// Small helper to print a section heading so the output is easy to read
void section(const string &title) {
    cout << "\n===== " << title << " =====" << endl;
}

int main() {
    // Faster I/O (useful in competitive programming). Don't mix with printf/scanf afterwards.
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    /* ---------------------------------------------------------
     * 1. FUNDAMENTAL DATA TYPES
     * --------------------------------------------------------- */
    section("1. Data types");

    char   c = 'a';     // 1 byte, stores a single character (internally an integer code)
    int    a = 3;       // usually 4 bytes, range about -2.1e9 to 2.1e9
    float  fl = 3.14f;  // 4 bytes, ~7 digits of precision (note the 'f' suffix)
    double b = 3.5;     // 8 bytes, ~15 digits of precision (default for decimals)
    bool   flag = true; // 1 byte, true or false

    cout << c << " " << a << " " << fl << " " << b << " " << flag << endl;

    /* ---------------------------------------------------------
     * 2. IMPLICIT CONVERSION / TRUNCATION
     * --------------------------------------------------------- */
    section("2. Implicit conversion");

    a = 4.5;            // double -> int: the decimal part is DROPPED (not rounded)
    cout << a << endl;  // prints 4

    a = -4.9;           // truncation goes toward zero
    cout << a << endl;  // prints -4

    /* ---------------------------------------------------------
     * 3. BOOL BEHAVIOUR
     * --------------------------------------------------------- */
    section("3. bool");

    bool d = false;     // prints 0
    cout << d << endl;

    bool e = true;      // prints 1
    cout << e << endl;

    bool f = 2438004;   // ANY non-zero value becomes true
    cout << f << endl;  // prints 1

    bool zero = 0;      // only zero becomes false
    cout << zero << endl;

    cout << boolalpha;  // print true/false instead of 1/0
    cout << "With boolalpha: " << f << " " << zero << endl;
    cout << noboolalpha;

    /* ---------------------------------------------------------
     * 4. INTEGER SIZES AND OVERFLOW
     * --------------------------------------------------------- */
    section("4. Integer sizes");

    long long g = 12345;    // 8 bytes, range about +/- 9.2e18 (use for big sums/products)
    cout << g << endl;

    cout << "sizeof(char)      = " << sizeof(char) << endl;
    cout << "sizeof(int)       = " << sizeof(int) << endl;
    cout << "sizeof(long long) = " << sizeof(long long) << endl;
    cout << "sizeof(double)    = " << sizeof(double) << endl;

    cout << "INT_MAX = " << INT_MAX << endl;
    cout << "LLONG_MAX = " << LLONG_MAX << endl;

    // Overflow trap: int * int is computed in int BEFORE being stored in long long
    int big = 1000000;
    // long long unsafe = big * big;   // overflow (undefined behaviour for signed int)
    long long safe = (long long)big * big;   // cast one operand first
    cout << "Safe product: " << safe << endl;
    // Tip: never name a variable 'left' or 'right' with 'using namespace std';
    // they clash with the stream manipulators std::left / std::right.

    /* ---------------------------------------------------------
     * 5. ARITHMETIC OPERATORS
     * --------------------------------------------------------- */
    section("5. Arithmetic");

    cout << "25 % 7  = " << 25 % 7 << endl;      // modulus (remainder) = 4
    cout << "25 / 7  = " << 25 / 7 << endl;      // int / int = integer division = 3
    cout << "25 / 7.0 = " << 25 / 7.0 << endl;   // one double operand = real division
    cout << "-25 % 7 = " << -25 % 7 << endl;     // sign follows the dividend = -4
    cout << "(3 + 3.5) * 2 = " << (3 + b) * 2 << endl;  // parentheses control precedence

    // Tip: x % 2 == 0 checks even numbers, x % 10 gives the last digit, x / 10 removes it

    /* ---------------------------------------------------------
     * 6. ASSIGNMENT OPERATORS
     * --------------------------------------------------------- */
    section("6. Assignment operators");

    int x = 10;
    x += 5;  cout << "x += 5  -> " << x << endl;   // x = x + 5  -> 15
    x -= 3;  cout << "x -= 3  -> " << x << endl;   // x = x - 3  -> 12
    x *= 2;  cout << "x *= 2  -> " << x << endl;   // x = x * 2  -> 24
    x /= 4;  cout << "x /= 4  -> " << x << endl;   // x = x / 4  -> 6
    x %= 4;  cout << "x %= 4  -> " << x << endl;   // x = x % 4  -> 2

    /* ---------------------------------------------------------
     * 7. INCREMENT / DECREMENT
     * --------------------------------------------------------- */
    section("7. Increment and decrement");

    int i = 5;
    // Keep the modification and the read in SEPARATE statements; mixing them in one
    // expression is unsequenced (undefined behaviour before C++17).
    int old = i++;      // post: use value, THEN add 1
    cout << "i++ gives " << old << ", i is now " << i << endl;
    int cur = ++i;      // pre : add 1, THEN use value
    cout << "++i gives " << cur << ", i is now " << i << endl;
    old = i--;
    cout << "i-- gives " << old << ", i is now " << i << endl;
    cur = --i;
    cout << "--i gives " << cur << ", i is now " << i << endl;

    // Note: pre-increment can be slightly more efficient for iterators/objects,
    // so prefer ++i in loops unless you need the old value.

    /* ---------------------------------------------------------
     * 8. RELATIONAL AND LOGICAL OPERATORS
     * --------------------------------------------------------- */
    section("8. Relational and logical");

    int p = 7, q = 10;
    cout << "p == q : " << (p == q) << endl;   // equal to
    cout << "p != q : " << (p != q) << endl;   // not equal to
    cout << "p <  q : " << (p < q) << endl;
    cout << "p >= q : " << (p >= q) << endl;

    cout << "(p < q) && (q < 20) : " << ((p < q) && (q < 20)) << endl;  // AND
    cout << "(p > q) || (q < 20) : " << ((p > q) || (q < 20)) << endl;  // OR
    cout << "!(p < q)            : " << (!(p < q)) << endl;             // NOT

    // && and || short-circuit: the right side is skipped if the left decides the result.

    /* ---------------------------------------------------------
     * 9. BITWISE OPERATORS
     * --------------------------------------------------------- */
    section("9. Bitwise");

    int m = 6;  // binary 110
    int n = 3;  // binary 011
    cout << "6 & 3  = " << (m & n) << endl;   // AND -> 010 = 2
    cout << "6 | 3  = " << (m | n) << endl;   // OR  -> 111 = 7
    cout << "6 ^ 3  = " << (m ^ n) << endl;   // XOR -> 101 = 5
    cout << "6 << 1 = " << (m << 1) << endl;  // left shift  = multiply by 2  -> 12
    cout << "6 >> 1 = " << (m >> 1) << endl;  // right shift = divide by 2    -> 3
    cout << "Binary of 6: " << bitset<8>(m) << endl;

    /* ---------------------------------------------------------
     * 10. TYPECASTING
     * --------------------------------------------------------- */
    section("10. Typecasting");

    char h = 'b';
    cout << (int)h << endl;                 // C-style cast: ASCII code of 'b' = 98
    cout << static_cast<int>(h) << endl;    // C++ style cast (preferred, easier to search for)

    cout << (char)(h + 1) << endl;          // 'b' + 1 -> 99 -> 'c'
    cout << (char)('a' + 25) << endl;       // 'z'

    int total = 7, count = 2;
    cout << "Integer average: " << total / count << endl;                  // 3 (truncated)
    cout << "Real average   : " << (double)total / count << endl;          // 3.5

    // Useful char tricks
    char ch = 'k';
    cout << "Position in alphabet: " << (ch - 'a' + 1) << endl;            // 11
    cout << "Uppercase: " << (char)toupper(ch) << endl;                    // K
    cout << "Is digit('5')? " << (bool)isdigit('5') << endl;               // 1
    cout << "Digit value of '7': " << ('7' - '0') << endl;                 // 7

    /* ---------------------------------------------------------
     * 11. TERNARY OPERATOR
     * --------------------------------------------------------- */
    section("11. Ternary");

    int age = 20;
    string status = (age >= 18) ? "adult" : "minor";   // condition ? if_true : if_false
    cout << status << endl;

    cout << "max(p, q) = " << max(p, q) << ", min(p, q) = " << min(p, q) << endl;

    /* ---------------------------------------------------------
     * 12. OUTPUT FORMATTING
     * --------------------------------------------------------- */
    section("12. Output formatting");

    double pi = 3.14159265358979;
    cout << pi << endl;                                  // default: 6 significant digits
    cout << fixed << setprecision(3) << pi << endl;      // fixed: 3 digits AFTER the decimal point
    cout << setw(8) << 42 << "|" << endl;                // width 8, right aligned
    cout << left << setw(8) << 42 << "|" << endl;        // left aligned
    cout << right;
    cout.unsetf(ios::fixed);                             // reset to default formatting
    cout << setprecision(6);

    // Prefer '\n' over endl in heavy output: endl flushes the buffer each time (slower).

    /* ---------------------------------------------------------
     * 13. READING INPUT
     * --------------------------------------------------------- */
    section("13. Input");

    int u, v;
    cout << "Enter two integers: ";
    if (cin >> u >> v) {                                 // always check that reading succeeded
        cout << "Sum = " << u + v << '\n';
        cout << "Product = " << (long long)u * v << '\n';
        cout << "Quotient = " << (v != 0 ? to_string(u / v) : "undefined") << '\n';  // avoid divide-by-zero
    } else {
        cout << "Invalid input." << '\n';
    }

    return 0;   // 0 tells the OS the program finished successfully
}


