package methods;

public class Arguments {
    public static void sum(int a, int b) { // parameters
        System.out.println(a+b);
    }

    // create a max function
    public static void max(int a, int b, int c) {
        if (a >= b && a >= c) System.out.println(a);
        else if (b >= a && b >= c) System.out.println(b);
        else System.out.println(c);
    }
    public static void main(String[] args) {
        sum(5, 8); // arguments
        max(5, 7, 8);
    }
}

