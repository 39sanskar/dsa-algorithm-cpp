package pattern_printing;

public class PatternsExample {

    // Method to print a hollow rectangle of size n x m
    public static void hollowRectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                // Print '*' at borders
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Inner space
                }
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to print an inverted rotated half pyramid
    public static void inverted_rotated_halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            // Print leading spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to print an inverted half pyramid with decreasing numbers
    public static void inverted_halfPyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            // Print decreasing numbers from 1 to (n - i + 1)
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to print Floyd's Triangle with consecutive numbers
    public static void floyds_triangle(int n) {
        int number = 1; // Start with 1
        for(int i=1; i<=n; i++) {
            // Print increasing count of numbers per row
            for(int j=1; j<=i; j++) {
                System.out.print(number +" ");
                number++; // Increment the number
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to print a triangle with alternating 0s and 1s
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            // For each column in row
            for(int j=1; j<=i; j++) {
                // If sum of indices is even, print 1; else print 0
                if((i+j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); // New line after each row
        }
    }

    // Method to print a butterfly pattern using stars
    public static void butterfly(int n) {
        // First half of the butterfly
        for(int i=1; i<=n; i++) {
            // Left wing: increasing stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // Middle gap: decreasing spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // Right wing: increasing stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }

        // Second half of the butterfly (mirror of first half)
        for(int i=n; i>=1; i--) {
            // Left wing: decreasing stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // Middle gap: increasing spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // Right wing: decreasing stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }
    }

    // Method to print a solid rhombus made of stars
    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            // Leading spaces to shift the shape right
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Print full row of stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }
    }

    // Method to print a hollow rhombus using stars
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            // Leading spaces to shift the shape right
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Hollow star pattern inside square
            for(int j=1; j<=n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Hollow center
                }
            }
            System.out.println(); // New line
        }
    }

    // Method to print a diamond pattern using stars
    public static void diamond(int n) {
        // Upper half including middle
        for(int i=1; i<=n; i++) {
            // Leading spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Odd number of stars per row
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }

        // Lower half excluding middle
        for(int i=n-1; i>=1; i--) {
            // Leading spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Odd number of stars per row
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line
        }
    }

    // Method to print a number pyramid where each row has repeated row number
    public static void number_pyramid(int n) {
        for(int i=1; i<=n; i++) {
            // Leading spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // Print current row number 'i' times
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println(); // New line
        }
    }

    // Method to print palindromic number pattern (mirror on both sides)
    public static void palindromic_pattern_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            // Leading spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Descending part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            // Ascending part (starting from 2 to avoid duplicate)
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println(); // New line
        }
    }

    // Main method to test all the patterns
    public static void main(String args[]) {
        System.out.println("Hollow Rectangle:");
        hollowRectangle(3, 5);

        System.out.println("\nInverted Rotated Half Pyramid:");
        inverted_rotated_halfPyramid(4);

        System.out.println("\nInverted Half Pyramid with Numbers:");
        inverted_halfPyramid_withNumbers(5);

        System.out.println("\nFloyd's Triangle:");
        floyds_triangle(5);

        System.out.println("\nZero One Triangle:");
        zero_one_triangle(5);

        System.out.println("\nButterfly Pattern:");
        butterfly(4);

        System.out.println("\nSolid Rhombus:");
        solid_rhombus(5);

        System.out.println("\nHollow Rhombus:");
        hollow_rhombus(5);

        System.out.println("\nDiamond Pattern:");
        diamond(4);

        System.out.println("\nNumber Pyramid:");
        number_pyramid(5);

        System.out.println("\nPalindromic Number Pattern:");
        palindromic_pattern_withNumbers(5);
    }
}
