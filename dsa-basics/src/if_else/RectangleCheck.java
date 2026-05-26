package if_else;

import java.util.Scanner;

// Take length and breadth of rectangle as input
// and check whether area is greater than perimeter

public class RectangleCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        // Calculating area
        double area = length * breadth;

        // Calculating perimeter
        double perimeter = 2 * (length + breadth);

        // Printing values
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        // Checking condition
        if (area > perimeter) {

            System.out.println("Area is greater than Perimeter");

        } else {

            System.out.println("Area is NOT greater than Perimeter");
        }

        sc.close();
    }
}

