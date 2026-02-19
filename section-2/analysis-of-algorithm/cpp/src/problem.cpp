// Problem: Sum of n-natural number

#include<iostream>
using namespace std;

// Function declarations
int fun1(int n);
int fun2(int n);
int fun3(int n);

int main(){
  int num;
  cout << "Enter a Number: ";
  cin >> num;

  cout << "Sum fun1: " << fun1(num) << endl;
  cout << "Sum fun2: " << fun2(num) << endl;
  cout << "Sum fun3: " << fun3(num) << endl;
  
  return 0;
}

// Function definitions
int fun1(int n) {
  return n*(n + 1)/2;
} // time-complexity: O(1) ~ c1 (constant)

int fun2(int n) {
  int sum = 0;
  for(int i = 1; i <= n; i++) {
    sum = sum + i;
  }
  return sum;
} // time-complexity: O(n) ~ c2(n) + c3 (linear)

// Using nested-loop 
int fun3(int n) {
  int sum = 0;
  for (int i = 1; i<= n; i++) {
    for (int j = 1; j <= i; j++) {
      sum ++;
    }
  }
  return sum;
} // time-complexity: O(n^2) ~  c4(n^2) + c5(n) + c6 (Quadratic)

// If n is very large (like 100000+), fun3 will be very slow.
// For best performance, always prefer fun1.


// cd cpp
// g++ src/problem.cpp -o bin/problem
// bin/problem
