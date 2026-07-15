package arrays;

// Multiply odd indexed elements by 2 and add 10 to even indexed elements.
import java.util.Scanner;

public class MultiplicationAndAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        // Initialization
        int[] arr = new int[n];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The Required Multiplication and Addition in an Array is: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {          // Even index
                System.out.print((arr[i] + 10) + " ");
            } else {                   // Odd index
                System.out.print((arr[i] * 2) + " ");
            }
        }
        sc.close();
    }
}


/*

Enter Array size: 4
Enter Array Elements: 12 23 34 45
The Required Multiplication and Addition in an Array is: 22 46 44 90

*/

/*

-- Remember
arr[i] % 2 → Checks whether the element/value is even or odd.
i % 2 → Checks whether the index is even or odd.

*/
