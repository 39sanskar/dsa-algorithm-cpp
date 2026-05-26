/*

// Else-If Ladder Syntax

if (condition1) {

   // code executes if condition1 is true

} else if (condition2) {

   // code executes if condition2 is true

} else if (condition3) {

   // code executes if condition3 is true

} else if (condition4) {

   // code executes if condition4 is true

} else {

   // code executes if all conditions are false

}

The Else-If Ladder is used when we want to check multiple conditions one by one.
Java checks conditions from top to bottom.
The first true condition gets executed.
Remaining conditions are skipped.
If no condition is true, the else block executes.

*/

package if_else;

public class Ladder {

    public static void main(String[] args) {

        int marks = 82;

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 75) {

            System.out.println("Grade B");

        } else if (marks >= 50) {

            System.out.println("Grade C");

        } else if (marks >= 33) {

            System.out.println("Pass");

        } else {

            System.out.println("Fail");
        }
    }
}


