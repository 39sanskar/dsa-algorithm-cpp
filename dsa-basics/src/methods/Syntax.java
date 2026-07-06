package methods;

public class Syntax {
    public static void Sanskar(){
        System.out.println("Samyak Aacharan!");
    }

    public static void main(String[] args) {
        System.out.println("Ajay");
        Sanskar();  // this is the methods
        System.out.println("Aman");
        Sanskar();
    }
}

// The `main()` function is executed first when the program starts, regardless of whether it is written above or below other functions in the source code. (specially in JAVA)
// The `main()` function is executed first, regardless of its position in the source code.

/*

Visual Execution diagram:

main()
 │
 ├── print "Ajay"
 │
 ├── Sanskar()
 │     └── print "Samyak Aacharan!"
 │
 ├── print "Aman"
 │
 ├── Sanskar()
 │     └── print "Samyak Aacharan!"
 │
 └── End Program


Conclusion:

The execution of the program starts from the main() method. First, "Ajay" is printed.
Then the Sanskar() method is called, which prints "Samyak Aacharan!" and returns control to the main() method.
Next, "Aman" is printed, and the Sanskar() method is called again, printing "Samyak Aacharan!" a second time.
After the second method call completes, the main() method finishes execution and the program terminates.
This demonstrates that whenever a method is called, the control temporarily transfers to that method, executes its statements, and then returns to the point from which it was called.

Final Output:

Ajay
Samyak Aacharan!
Aman
Samyak Aacharan!

*/
