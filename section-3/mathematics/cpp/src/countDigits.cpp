#include <iostream>
using namespace std;

int countDigits(int x);
int main() {
  int x;
  cout << "Enter the Number: ";
  cin >> x;

  if (x < 0) {
    cout << "Invalid number!" << endl;
    return 0;
  }
  
  cout << "DigitCount: " << countDigits(x) << endl;

}
int countDigits(int x) {
  int result = 0;

  while (x > 0) {
    x = x/10;
    result++;
  }
  return result;
}

// Time Complexity: theta(d); d => no. of d digit then its going to run d times.
