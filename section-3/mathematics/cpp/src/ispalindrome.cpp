// Working for both String + Number

#include <iostream>
#include <algorithm>
using namespace std;

// Check numeric palindrome
bool isPalindromeNumber(long long n)
{
  if (n < 0) return false; // negative numbers not palindrome

  long long reverse = 0, temp = n;

  while (temp != 0)
  {
    int lastdigit = temp % 10;
    reverse = reverse * 10 + lastdigit;
    temp /= 10;
  }

  return reverse == n;
}

// Check string palindrome
bool isPalindromeString(string s)
{
  string rev = s;                  // copy the string
  reverse(rev.begin(), rev.end()); // uses the built-in STL reverse function
  return s == rev;                 // compare , If original == reversed → palindrome
}

// Check if string is a number
bool isNumber(string s)
{
  if (s.empty())
    return false; // check empty string, Prevents invalid input like ""

  for (char c : s)
  { // loop through each character (goes character by character eg. "123" -> "1", "2", "3")
    if (!isdigit(c))
      return false;
  }
  return true;
}

int main()
{
  string input;

  cout << "Enter a value: ";
  cin >> input;

  if (isNumber(input))
  {
    long long num = stoll(input); //  convert string → number, eg. "1" -> 1

    if (isPalindromeNumber(num))
    {
      cout << "Yes, number is Palindrome" << endl;
    }
    else
    {
      cout << "No, number is not Palindrome" << endl;
    }
  }
  else
  {
    if (isPalindromeString(input))
    {
      cout << "Yes, string is Palindrome" << endl;
    }
    else
    {
      cout << "No, string is not Palindrome" << endl;
    }
  }

  return 0;
}

/*

  isdigit(c) checks:
  '0' to '9' → valid
  anything else → invalid
  If any character is NOT a digit → immediately return false

*/
