package methods;

public class ReturnType1 {
    public static int  rajan(int a) {
        System.out.println("banu");
        if (a>0) return 5;
        else return 10;
    }
    public static void main(String[] args) {
        int x = rajan(7);  // it will be return the value 5 which is store in the x.
        System.out.println(x);
        System.out.println(3+x);
    }
}


// Output:
// banu
// 5
// 8

