#include<bits/stdc++.h>
using namespace std; 

int main() {
    // Calculation preference: operations are generally performed using the higher data type.
    // char ==> int ==> long int ==> long long int ==> float ==> double

    cout << 7 / 2.0 << endl; 
    // 2.0 is a double, so the result is 3.5 (floating-point division).

    cout << 'c' + 1 << endl; 
    // char is automatically converted into int (ASCII value).
    // ASCII value of 'c' = 99, so output = 100.

    int a = 3/2.0;  
    // 3/2.0 = 1.5 (double), but storing it in int removes the decimal part.
    // Therefore, a = 1.
    cout << a << endl; 

    double b = 3/2.0; 
    // The result is 1.5 and double stores the fractional part.
    cout << b << endl; 

    // Operator Precedence
    // * and / have the same precedence and are evaluated from left to right.

    cout << 7/2 * 3 << endl; 
    // 7/2 = 3 (integer division), 3*3 = 9.

    cout << 3 * 7 / 2 << endl; 
    // 3*7 = 21, 21/2 = 10 (integer division).

    // Overflow and Ranges
    // int       ==> approximately -10^9 to 10^9
    // long int  ==> platform-dependent (do not assume it is always 10^12).
    // long long ==> approximately -9.22 * 10^18 to 9.22 * 10^18.

    int c = 100000; 
    int d = 100000; 
    int e = c*d; 
    // Integer overflow: 100000 * 100000 = 10^10, which exceeds INT_MAX.
    cout << e << endl; 

    int max = INT_MAX; 
    // INT_MAX represents the maximum value an int can store.
    cout << max << endl; 

    cout << max + 1 << endl; 
    // Signed integer overflow: undefined behavior in C++.

    // long int
    long int f = 100000; 
    long int g = 100000; 
    long int h = f*g; 
    // On platforms where long int is 64-bit, this calculation fits.
    cout << h << endl;

    // Using 1LL ==> forces the multiplication to use long long int.
    int i = 100000; 
    int j = 100000; 
    long int k = i * 1LL * j; 
    // 1LL is a long long integer literal.
    // Multiplication is performed using long long before assignment.
    cout << k << endl; 

    // Using double
    double l = 100000; 
    double m = 100000;
    double n = l * m; 
    // double can represent large numbers, but with limited precision.
    cout << n << endl;  // Scientific notation: 1e+10
    cout << fixed << n << endl; 

    // Do not rely on double for exact integer calculations beyond its precision.
    double o = 1e24; 
    cout << o << endl;  
    // double cannot represent every integer exactly at this magnitude.
    // The displayed value may differ from the original integer.

    // Why should we avoid double for exact integer calculations?
    // float and double use binary floating-point representation.
    // Some decimal values cannot be represented exactly.
    // For integer calculations, prefer int, long long, etc.,
    // provided the values fit within their ranges.
}

