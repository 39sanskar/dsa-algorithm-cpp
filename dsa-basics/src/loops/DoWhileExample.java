package loops;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}


/*

-- Definition of do-while Loop
A do-while loop is an exit-controlled loop in Java where the loop body executes at least once, and then the condition is checked.

-- Short Definition:
A do-while loop executes the block of code first and checks the condition afterward.

Syntax:

do {
    // Loop Body
} while (condition);


Flow:

Execute Body
      ↓
Check Condition
      ↓
true  → Repeat Again
false → Exit Loop

-- Difference Between while and do-while

| `while` Loop           | `do-while` Loop              |
| ---------------------- | ---------------------------- |
| Checks condition first | Executes first, checks later |
| May execute 0 times    | Executes at least 1 time     |
| Entry-controlled       | Exit-controlled              |

*/
