/*
 * C++: Type Promotion, Operator Precedence, Overflow and Precision
 * ------------------------------------------------------------------
 * Topics covered:
 *   1. Type promotion (which type does an expression become?)
 *   2. Truncation when storing into a smaller type
 *   3. Operator precedence and associativity
 *   4. Integer ranges (and how to print them)
 *   5. Overflow: how it happens, how to detect it
 *   6. Fixing overflow: long long, the 1LL trick, casts
 *   7. Modular arithmetic (the usual contest use case)
 *   8. double: scientific notation, precision, exact-integer limit
 *   9. Comparing doubles safely
 *  10. Quick rules of thumb
 */

#include <bits/stdc++.h>
using namespace std;

void section(const string &title) {
    cout << "\n===== " << title << " =====" << '\n';
}

int main() {
    /* ---------------------------------------------------------
     * 1. TYPE PROMOTION
     * ---------------------------------------------------------
     * In a mixed expression, the "smaller" operand is converted to the
     * "bigger" one before the operation happens. Rough ranking:
     *
     *   char/short  ->  int  ->  long  ->  long long  ->  float  ->  double  ->  long double
     *
     * Note: char and short are ALWAYS promoted to at least int first, so
     * 'c' + 1 is an int, not a char.
     * Integer types rank below floating-point types, so int + double = double.
     */
    section("1. Type promotion");

    cout << 7 / 2.0 << '\n';          // int / double -> double division = 3.5
    cout << 7 / 2 << '\n';            // int / int    -> integer division = 3
    cout << 'c' + 1 << '\n';          // char + int   -> int: 99 + 1 = 100
    cout << (char)('c' + 1) << '\n';  // cast back to char -> 'd'
    cout << 5 + 2.5f << '\n';         // int + float  -> float = 7.5
    cout << 10 / 4 * 1.0 << '\n';     // (10/4) is int division = 2, THEN * 1.0 -> 2
    cout << 10 * 1.0 / 4 << '\n';     // (10*1.0) is double, THEN / 4 -> 2.5

    // Lesson: the promotion happens operation by operation, left to right
    // (according to precedence), NOT for the whole expression at once.

    // Handy: check the resulting type of an expression at compile time
    static_assert(is_same<decltype('c' + 1), int>::value, "char + int is int");
    static_assert(is_same<decltype(1 + 2.0), double>::value, "int + double is double");
    static_assert(is_same<decltype(1 + 2LL), long long>::value, "int + long long is long long");

    /* ---------------------------------------------------------
     * 2. TRUNCATION WHEN STORING
     * --------------------------------------------------------- */
    section("2. Truncation on assignment");

    int a = 3 / 2.0;       // the right side is 1.5 (double), but 'a' is an int,
    cout << a << '\n';     // so the decimal part is dropped -> 1

    double b = 3 / 2.0;    // stored in a double: nothing is lost
    cout << b << '\n';     // 1.5

    double c = 3 / 2;      // CLASSIC BUG: integer division happens first (=1), then converted
    cout << c << '\n';     // 1  (not 1.5!)

    int rounded = round(2.7);       // use round() if you want rounding instead of truncation
    cout << "round(2.7) = " << rounded << ", floor = " << floor(2.7)
         << ", ceil = " << ceil(2.1) << '\n';

    /* ---------------------------------------------------------
     * 3. OPERATOR PRECEDENCE
     * ---------------------------------------------------------
     * Order (high -> low):  ()  ->  * / %  ->  + -  ->  comparisons  ->  && ||  ->  =
     * Operators of the SAME level are evaluated left to right
     * (assignment is the exception: right to left).
     */
    section("3. Operator precedence");

    cout << 7 / 2 * 3 << '\n';       // (7/2)*3 = 3*3 = 9   (division first, it is on the left)
    cout << 3 * 7 / 2 << '\n';       // (3*7)/2 = 21/2 = 10 (multiplication first)
    cout << 7 / (2 * 3) << '\n';     // parentheses change it: 7/6 = 1
    cout << 2 + 3 * 4 << '\n';       // 14, not 20
    cout << (2 + 3) * 4 << '\n';     // 20

    // Same numbers, different order, different answer: integer division loses
    // information, so multiply BEFORE dividing when you can (watch overflow though).

    int x, y, z;
    x = y = z = 5;                   // assignment is right to left: z=5, then y=z, then x=y
    cout << x << y << z << '\n';

    // When in doubt, add parentheses. They cost nothing and make intent obvious.

    /* ---------------------------------------------------------
     * 4. INTEGER RANGES
     * ---------------------------------------------------------
     * Rough ranges (the exact limits are printed below):
     *   int        : about -2.1 * 10^9  to 2.1 * 10^9   (4 bytes)
     *   long       : 4 bytes on Windows, 8 bytes on Linux/Mac (so it is NOT portable)
     *   long long  : about -9.2 * 10^18 to 9.2 * 10^18  (8 bytes)
     *
     * Remember: int is "about 2 * 10^9", so values up to 10^9 are safe but
     * the SUM of two such values can already overflow.
     */
    section("4. Ranges");

    cout << "int       : " << INT_MIN << " to " << INT_MAX << '\n';
    cout << "long      : " << LONG_MIN << " to " << LONG_MAX << '\n';
    cout << "long long : " << LLONG_MIN << " to " << LLONG_MAX << '\n';
    cout << "unsigned int max : " << UINT_MAX << '\n';
    // Or use numeric_limits (works for any type):
    cout << "numeric_limits<int>::max() = " << numeric_limits<int>::max() << '\n';

    /* ---------------------------------------------------------
     * 5. OVERFLOW
     * ---------------------------------------------------------
     * Signed integer overflow is UNDEFINED BEHAVIOUR in C++: the compiler may
     * produce any result. It often "wraps around" in practice, but never rely on it.
     * Below we use compiler builtins so the demo itself is well defined.
     */
    section("5. Overflow");

    int p = 100000;
    int q = 100000;                          // p * q = 10^10 which does NOT fit in an int
    int product;
    bool overflowed = __builtin_mul_overflow(p, q, &product);   // GCC/Clang builtin
    cout << "100000 * 100000 in int  -> wrapped value " << product
         << ", overflow detected: " << overflowed << '\n';

    int biggest = INT_MAX;                   // (renamed from 'max' to avoid hiding std::max)
    cout << biggest << '\n';
    int sum;
    bool sumOverflow = __builtin_add_overflow(biggest, 1, &sum);
    cout << "INT_MAX + 1 in int -> wrapped value " << sum
         << ", overflow detected: " << sumOverflow << '\n';

    // Common mistake: the overflow happens in the multiplication, so assigning
    // to a bigger variable AFTERWARDS is too late:
    //     long long bad = p * q;           // p*q is computed as int first -> overflow!

    /* ---------------------------------------------------------
     * 6. FIXING OVERFLOW
     * --------------------------------------------------------- */
    section("6. Fixing overflow");

    // (a) Use a bigger type for the variables themselves
    long long f = 100000;
    long long g = 100000;
    long long h = f * g;
    cout << h << '\n';                       // 10000000000

    // (b) Keep ints but promote during the calculation with the 1LL trick:
    //     1LL is a long long literal, so i * 1LL becomes long long before the next *
    int i = 100000;
    int j = 100000;
    long long k = i * 1LL * j;               // (i * 1LL) -> long long, then * j -> long long
    cout << k << '\n';

    // (c) Or cast one operand
    long long k2 = (long long)i * j;
    cout << k2 << '\n';

    // WRONG placement of 1LL: it must touch an operand BEFORE the overflowing multiplication
    // long long wrongPlacement = (long long)(i * j);   // cast is applied too late: i*j already overflowed
    // (left commented out because running it would be undefined behaviour)

    // Tip: in contests, default to long long for anything that might exceed ~10^9.
    // Use "#define int long long" only if you understand the memory/speed trade-off.

    /* ---------------------------------------------------------
     * 7. MODULAR ARITHMETIC
     * ---------------------------------------------------------
     * Many problems ask for the answer "modulo 10^9 + 7". Reduce after EVERY
     * multiplication so values never exceed ~10^18 (the long long limit).
     */
    section("7. Modular arithmetic");

    const long long MOD = 1'000'000'007LL;
    long long factorial = 1;
    for (int n = 1; n <= 20; n++) {
        factorial = factorial * n % MOD;     // stays below MOD * 20, far from overflow
    }
    cout << "20! mod 1e9+7 = " << factorial << '\n';

    // Identities used with mod:
    //   (a + b) % m == ((a % m) + (b % m)) % m
    //   (a * b) % m == ((a % m) * (b % m)) % m
    // Subtraction can go negative in C++, so fix it up:
    long long diff = ((5 - 12) % MOD + MOD) % MOD;
    cout << "(5 - 12) mod 1e9+7 = " << diff << '\n';

    /* ---------------------------------------------------------
     * 8. DOUBLE: NOTATION AND PRECISION
     * --------------------------------------------------------- */
    section("8. double");

    double l = 100000;
    double m = 100000;
    double n = l * m;
    cout << n << '\n';                       // 1e+10  (default: scientific for large values)
    cout << fixed << n << '\n';              // 10000000000.000000  (fixed notation)
    cout << setprecision(2) << n << '\n';    // 10000000000.00
    cout.unsetf(ios::fixed);                 // go back to default formatting
    cout << setprecision(6);

    // A double stores about 15-16 significant decimal digits (53 bits of mantissa).
    // Whole numbers are exact only up to 2^53 = 9007199254740992 (about 9 * 10^15).
    double o = 1e24;
    cout << fixed << o << '\n';              // 999999999999999983222784.000000, NOT 10^24 exactly!
    cout.unsetf(ios::fixed);

    double big = 9007199254740992.0;         // 2^53
    cout << fixed << big + 1 << '\n';        // still ...992: the +1 is lost
    cout.unsetf(ios::fixed);
    cout << setprecision(6);

    // Why? Doubles store numbers in binary. Many decimals (0.1, 0.2, ...)
    // have no exact binary form, just like 1/3 has no exact decimal form.
    cout << setprecision(17) << 0.1 + 0.2 << '\n';   // 0.30000000000000004
    cout << setprecision(6);

    /* ---------------------------------------------------------
     * 9. COMPARING DOUBLES
     * --------------------------------------------------------- */
    section("9. Comparing doubles");

    double r1 = 0.1 + 0.2;
    double r2 = 0.3;
    cout << boolalpha;
    cout << "r1 == r2 ?        " << (r1 == r2) << '\n';           // false (surprise!)
    const double EPS = 1e-9;
    cout << "|r1 - r2| < EPS ? " << (fabs(r1 - r2) < EPS) << '\n'; // true: compare with a tolerance
    cout << noboolalpha;

    // Rule: never use == on doubles. Use an epsilon, or avoid doubles entirely
    // (e.g. keep money in integer cents, compare fractions by cross-multiplying).

    /* ---------------------------------------------------------
     * 10. QUICK RULES OF THUMB
     * ---------------------------------------------------------
     *  - Values up to ~10^9  -> int is OK. Products/sums of them -> long long.
     *  - Values up to ~10^18 -> long long. Beyond that you need big integers.
     *  - Use doubles for real-world measurements (averages, geometry), NOT for
     *    exact counting. Doubles are fine for calculations, just not for exact
     *    integer arithmetic past 2^53 or for equality checks.
     *  - Remember that integer / integer truncates; convert one operand first.
     *  - Multiply before you divide only if the product cannot overflow.
     *  - Signed overflow is undefined behaviour: detect it, don't depend on it.
     */

    return 0;
}
