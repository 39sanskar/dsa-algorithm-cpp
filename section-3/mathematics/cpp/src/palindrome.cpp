/*

Palindrome: A number is called palindrome if its reverse is same as the original number.

Input: n = 78987, Output: Yes,   Input: n = 21, Output: No 
Input: 8, Output: Yes (a single digit is always a palindrome because from right to left it is same.)

Idea: Traverse digits from right to left to find reverse of a given number

*/

#include <iostream>
using namespace std;

bool isPalindrome(int n) {
  int reverse = 0;
  int temp = n;

  while (temp != 0) {
    int lastdigit = temp % 10;
    reverse = reverse * 10 + lastdigit;
    temp = temp / 10;
  }

  return (reverse == n);
}

int main() {
  int n;
  cout << "Enter a Number: ";
  
  // cin >> n; // read input only once and validate it at the same time: not use extra cin >> n 

  if (!(cin >> n)) { // if n is not a number  // read + validate together
    cout << "Invalid input! Please enter a number." << endl;
    return 0;
  }

  if (isPalindrome(n)) {
    cout << "Yes, number is Palindrome" << endl;
  } else {
    cout << "No, number is not Palindrome" << endl;
  }

  return 0;
}


/*

Why Θ(log n) is preferred

- In computer science, input size is measured in bits, not the numeric value.
- A number n is stored using log₂(n) bits
- So when you process a number digit by digit, you're effectively working on its representation size

That’s why:
d (digits) ≈ log₁₀(n)
In binary: bits ≈ log₂(n)

So interviewers prefer: Θ(log n) → more formal and standard

When Θ(d) is acceptable

- You can use Θ(d) when:
- The problem explicitly says "number of digits"

“The time complexity is Θ(d), where d is the number of digits. Since d = log₁₀(n), it can also be written as Θ(log n)

Space Complexity: Θ(1)

*/