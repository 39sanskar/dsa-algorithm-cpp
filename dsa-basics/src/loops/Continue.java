package loops;

// Print all even numbers from 1 to 100
public class Continue {
    public static void main(String[] args) {

        // 1. Skip Invalid User Records (Backend Development)
        System.out.println("Skip Invalid User Records (Backend Development)");
        String[] users = {"Ajay", "", "Rahul", null, "Sanskar"};

        for (String user : users) {
            if (user == null || user.isEmpty()) {
                continue;
            }
            System.out.println("Processing User: " + user);
        }

        System.out.println();
        // 2. Skip Failed Orders in E-Commerce
        System.out.println("Skip Failed Orders in E-Commerce");
        int[] orders = {101, 102, -1, 103, -1, 104};

        for (int orderId : orders) {
            if (orderId == -1) {
                continue;
            }
            System.out.println("Processing Order: " + orderId);
        }

        System.out.println();
        // 3. Log Processing (Very Common)
        System.out.println("Log Processing (Very Common)");
        String[] logs = {
                "User Login",
                "",
                "Payment Success",
                "",
                "Logout"
        };
        for (String log : logs) {
            if (log.isBlank()) {
                continue;
            }
            System.out.println("Reading Log: " + log);
        }

        System.out.println();
        // 4. API Data Validation
        System.out.println("API Data Validation");
        int[] ages = {25, -1, 30, -5, 18};

        for (int age : ages) {

            if (age < 0) {
                continue;
            }

            System.out.println("Valid Age: " + age);
        }
    }
}


/*
Output:

Skip Invalid User Records (Backend Development)
Processing User: Ajay
Processing User: Rahul
Processing User: Sanskar

Skip Failed Orders in E-Commerce
Processing Order: 101
Processing Order: 102
Processing Order: 103
Processing Order: 104

Log Processing (Very Common)
Reading Log: User Login
Reading Log: Payment Success
Reading Log: Logout

API Data Validation
Valid Age: 25
Valid Age: 30
Valid Age: 18

Process finished with exit code 0

*/

/*

Definition:
continue statement skips the remaining code inside the loop for the current iteration and transfers control to the next iteration.


| Statement  | Meaning                                    |
| ---------- | ------------------------------------------ |
| `break`    | Terminates the loop completely             |
| `continue` | Skips current iteration and continues loop |

Example:

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.print(i+ " ");
}

Output: 1 2 4 5

*/
