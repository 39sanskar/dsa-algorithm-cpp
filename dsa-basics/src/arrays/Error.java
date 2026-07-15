package arrays;

public class Error {
    public static void main(String[] args) {
        int[] arr = {-6, -8, -14, -2, -23, -47, -7};
        System.out.println(arr[-1]);  // ArrayIndexOutOfBoundsException
        // Array index is out of bounds
        // Index -1 out of bounds for length 7 at arrays.Error.main(Error.java:6)
    }
}


/*

-- ArrayIndexOutOfBoundsException

-- If we try to access, print, or assign a value to an invalid array index, Java throws an ArrayIndexOutOfBoundsException.

-- If the size (length) of an array is n, then its valid indices range from 0 to n - 1.

-- Any index less than 0 or greater than or equal to n is invalid.

Examples:
arr[-1]  --> Throws ArrayIndexOutOfBoundsException
arr[n]   --> Throws ArrayIndexOutOfBoundsException

-- Example

int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr[-1]); // Throws ArrayIndexOutOfBoundsException
System.out.println(arr[5]);  // Throws ArrayIndexOutOfBoundsException

Note: In Java, array indices cannot be negative. The only valid indices for an array of length n are from 0 to n - 1 (inclusive).
Any attempt to access an index outside this range results in an ArrayIndexOutOfBoundsException.

*/
