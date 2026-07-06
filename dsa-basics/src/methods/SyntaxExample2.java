package methods;

public class SyntaxExample2 {
    public static void main(String[] args) {
        rishika();
    }
    public static void rishika() {
        System.out.println("Archit");
        ishan();
    }
    public static void ishan() {
        System.out.println("Lakshay");
        varad();
    }
    public static void varad() {
        System.out.println("Malani");
        rishika();
    }
}

// Output => Archit Lakshay Malani .... it will print infinite times..

// StackOverflowError
