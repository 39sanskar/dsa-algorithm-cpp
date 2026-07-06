package methods;

public class SyntaxExample {
    public static void main(String[] args) {
        ajay();
    }
    public static void ajay() {
        System.out.println("Ajay");
        aman();
    }
    public static void aman() {
        Karan();
        System.out.println("Aman");
    }
    public static void Karan() {
        System.out.println("Karan");
    }
}

// Output:
// Ajay
// Karan
// Aman
