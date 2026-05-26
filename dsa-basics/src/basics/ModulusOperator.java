package basics;

// Modulus Operator %
public class ModulusOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = -2;
        int c = a % b;
        System.out.println(c); //  1
    }
}


/*

 Properties of Modulus Operator
  1.  a % b = a (if a < b)
  example => 37%5 = 2; 5%37 = 5

  2.  a % (-b) = a % b
  example => 5 % -2 = 5 % 2 = 1

  3.  (-a)%b = -(a % b)
  example => (-39)%(-10) = (-39)%10 = -(39%10) = -9

*/

