package if_else;

public class TernarySyntax {

    public static void main(String[] args) {

        int number = 10;

        String result = (number % 2 == 0)
                ? "Even Number"
                : "Odd Number";

        System.out.println(result);
    }
}


/*

Ternary Operator in Java
Definition:
The Ternary Operator is a shorthand way of writing an if-else statement in a single line.
It works with three operands, therefore it is called the Ternary Operator.
It is mainly used for:

simple conditions
assigning values
short decision making

variable = (condition) ? value_if_true : value_if_false;

How it works
If condition is true
→ expression before : executes
If condition is false
→ expression after : executes


*/
