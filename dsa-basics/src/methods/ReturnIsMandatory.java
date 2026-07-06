package methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(sanskar(3));
    }
    public static int sanskar(int a) {
        if (a < 5) {
            return a;
        }
        else return -3;
    }
}


/*

-- Explanation:
// In Java, if a method has a non-void return type and you place a return statement inside an if block,
// you must ensure that every possible execution path returns a value.
// This can be done by adding a return statement in the else block or
// by placing another return statement after the if statement.

*/
