package arrays;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 18;
        int found = -1;  // -1 is never be an index of an Array.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target exists in Array at index: "+ i);
                found = i;  // here we do two work target and it's index is found.
                break;
            }
        }
        if (found != -1) System.out.print("Target exists in Array at index "+found);
        else System.out.print("Target missing in Array");
    }
}

