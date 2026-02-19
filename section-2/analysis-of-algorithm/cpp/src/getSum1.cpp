// Multiple Orders of growths

#include <iostream>
#include <string>
using namespace std;

// Function declaration
int getSum1(int arr[], int n);

int main()
{
  string input;
  int n;

  cout << "Enter size of array: ";
  getline(cin, input);

  // Check empty input
  if (input.empty())
  {
    cout << "Invalid size!" << endl;
    return 0;
  }

  // Convert string to integer safely
  try
  {
    n = stoi(input);
  }
  catch (...)
  {
    cout << "Invalid size!" << endl;
    return 0;
  }

  // Check for zero or negative
  if (n <= 0)
  {
    cout << "Invalid size!" << endl;
    return 0;
  }

  int arr[n]; // Create array

  cout << "Enter " << n << " elements: ";
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  cout << "Sum: " << getSum1(arr, n) << endl;

  return 0;
}

// Function definition
int getSum1(int arr[], int n)
{

  // Only calculate sum if size is odd
  if (n % 2 == 0)
  {
    return 0;
  }

  int sum = 0;
  for (int i = 0; i < n; i++)
  {
    sum += arr[i];
  }

  return sum;
}

// best-case: O(1) constant
// average-case: O(n) Linear (under the assumption that even and odd cases are equally likely.)
// wrost-case: O(n) linear


