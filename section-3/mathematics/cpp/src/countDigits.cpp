#include <iostream>
using namespace std;

int countDigits(int x); // function declaration 
int main() {
  int x;
  cout << "Enter the Number: ";
  cin >> x;

  if (x < 0) {
    cout << "Invalid number!" << endl;
    return 1;
  }
  
  cout << "DigitCount: " << countDigits(x) << endl;

}

// function definition 
int countDigits(int x) {
  int result = 0;

  while (x > 0) {
    x = x/10;
    result++;
  }
  return result;
}

// If function is below main() → declaration needed
// If function is above main() → no declaration needed

// Time Complexity: theta(d); d => no. of d digit then its going to run d times.

/*

return → exits function + gives back a value

return 0 in main() → success signal
Program finished successfully
You are sending status 0 to the operating system
return 1 → often used for error or true

*/
