// Simple function with same order of growth for every input.

#include<iostream>
#include <string>
using namespace std;

// Function declarations
int getSum(int arr[], int n);

int main() {
  string input;
  int n;

  cout << "Enter size of array: ";
  getline(cin, input);

  // Check empty input
  if (input.empty()) {
    cout << "Invalid size!" << endl;
    return 0;
  }

  // Try converting to integer
  try {
    n = stoi(input);
  }
  catch (...) {
    cout << "Invalid size!" << endl;
    return 0;
  }

  if (n <= 0) {
    cout << "Invalid size!" << endl;
    return 0;
  }

  int arr[n];   // Array declaration

  cout << "Enter exactly " << n << " elements: ";
  for (int i = 0; i < n; i++) {
    cin >> arr[i];  // user enters elements
  }

  cout << "Sum: " << getSum(arr, n) << endl;
  return 0;
}

// Function definition

int getSum(int arr[], int n) {
  int sum = 0;
  for (int i = 0; i < n; i++) {
    sum = sum + arr[i];
  }
  return sum;
}

// Order of growth: O(n) ~ Linear 

// getline() is used to read a full line of input from the user — including spaces — until the user presses Enter.
// " " is a string literal
// In C++, a non-empty string is treated like a true value
