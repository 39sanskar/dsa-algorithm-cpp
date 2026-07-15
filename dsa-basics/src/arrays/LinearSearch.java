package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 88;
        boolean flag = false;  // false means target is not present in array.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target exist in Array at index "+i);
                flag = true;  // Target is present in Array
                break;
            }
        }
        // In Java, we can not write number in if-else statement. (Remember)
        if (flag == true) System.out.println("Target exist in Array");
        else System.out.println("Target missing in Array");
    }
}


