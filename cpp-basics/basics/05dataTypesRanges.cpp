#include <bits/stdc++.h>
using namespace std;

int main() {

    // Integer data types
    cout << "CHAR RANGE: "
         << (int)numeric_limits<char>::min() << " to "
         << (int)numeric_limits<char>::max() << endl;   // CHAR RANGE: -128 to 127 

    cout << "SIGNED CHAR RANGE: "
         << (int)numeric_limits<signed char>::min() << " to "
         << (int)numeric_limits<signed char>::max() << endl;  // SIGNED CHAR RANGE: -128 to 127

    cout << "UNSIGNED CHAR RANGE: "
         << (int)numeric_limits<unsigned char>::min() << " to "
         << (int)numeric_limits<unsigned char>::max() << endl;  // UNSIGNED CHAR RANGE: 0 to 255 

    cout << "SHORT RANGE: "
         << numeric_limits<short>::min() << " to "
         << numeric_limits<short>::max() << endl;  // SHORT RANGE: -32768 to 32767 

    cout << "INT RANGE: "
         << numeric_limits<int>::min() << " to "
         << numeric_limits<int>::max() << endl;  // INT RANGE: -2147483648 to 2147483647

    cout << "UNSIGNED INT RANGE: "
         << numeric_limits<unsigned int>::min() << " to "
         << numeric_limits<unsigned int>::max() << endl;  // UNSIGNED INT RANGE: 0 to 4294967295 

    cout << "LONG RANGE: "
         << numeric_limits<long>::min() << " to "
         << numeric_limits<long>::max() << endl;  // LONG RANGE: -9223372036854775808 to 9223372036854775807

    cout << "LONG LONG RANGE: "
         << numeric_limits<long long>::min() << " to "
         << numeric_limits<long long>::max() << endl;  // LONG LONG RANGE: -9223372036854775808 to 9223372036854775807


    // Floating-point data types
    cout << scientific << setprecision(6); 

    cout << "\nFLOAT RANGE: "
         << numeric_limits<float>::lowest() << " to "
         << numeric_limits<float>::max() << endl;  // FLOAT RANGE: -3.402823e+38 to 3.402823e+38

    cout << "DOUBLE RANGE: "
         << numeric_limits<double>::lowest() << " to "
         << numeric_limits<double>::max() << endl;  // DOUBLE RANGE: -1.797693e+308 to 1.797693e+308

    cout << "LONG DOUBLE RANGE: "
         << numeric_limits<long double>::lowest() << " to "
         << numeric_limits<long double>::max() << endl;  // LONG DOUBLE RANGE: -1.189731e+4932 to 1.189731e+4932


    // Data type sizes
    cout << "\nDATA TYPE SIZES:" << endl;

    cout << "char: " << sizeof(char) << " bytes" << endl;  // char: 1 bytes 
    cout << "short: " << sizeof(short) << " bytes" << endl;  // short: 2 bytes 
    cout << "int: " << sizeof(int) << " bytes" << endl;  // int: 4 bytes 
    cout << "long: " << sizeof(long) << " bytes" << endl;  // long: 8 bytes 
    cout << "long long: " << sizeof(long long) << " bytes" << endl;  // long long: 8 bytes
    cout << "float: " << sizeof(float) << " bytes" << endl;  // float: 4 bytes
    cout << "double: " << sizeof(double) << " bytes" << endl;  // double: 8 bytes 
    cout << "long double: " << sizeof(long double) << " bytes" << endl; // long double: 16 bytes

    return 0;
}

