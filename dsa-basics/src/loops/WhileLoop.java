package loops;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 1;
//        for(; i<=10;){
//            System.out.println(i+ " ");
//            i++;
//        }

        int i = 1;
        while(i <= 10) {
            System.out.print(i+ " ");
            i++;
        }
    }
}


/*

-- Use Case: Generally used when there are multiple conditions.
-- Used when the number of iterations is not known beforehand.

Initialization
      |
      v
Condition -----> false → Exit Loop
      |
      true
      |
      v
Loop Body
      |
      v
Increment / Decrement
      |
      └───────────────> Back to Condition

*/

