package if_else;

import java.util.Scanner;

// Given a point (x, y), check its position (Remember Priority)

public class QuadrantCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        // Checking origin
        if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        }

        // Checking x-axis
        else if (y == 0) {
            System.out.println("Point lies on the X-axis");
        }

        // Checking y-axis
        else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        }

        // 1st Quadrant
        else if (x > 0 && y > 0) {
            System.out.println("Point lies in the 1st Quadrant");
        }

        // 2nd Quadrant
        else if (x < 0 && y > 0) {
            System.out.println("Point lies in the 2nd Quadrant");
        }

        // 3rd Quadrant
        else if (x < 0 && y < 0) {
            System.out.println("Point lies in the 3rd Quadrant");
        }

        // 4th Quadrant
        else {
            System.out.println("Point lies in the 4th Quadrant");
        }

        sc.close();
    }
}
