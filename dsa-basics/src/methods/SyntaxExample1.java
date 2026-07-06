package methods;

public class SyntaxExample1 {
    public static void shravan() {
        karan();
        System.out.println("khushi");
    }
    public static void main(String[] args) {
        riyanshi();
    }
    public static void karan() {
        System.out.println("YASHIKA");
    }
    public static void riyanshi() {
        karan();
        shravan();
        System.out.println("Ajay");
        shravan();
    }
}

// Output:

// YASHIKA
// YASHIKA
// khushi
// Ajay
// YASHIKA
// khushi
