package loops;

// loops => A loop is a programming structure that repeatedly executes a set of statements while a specified condition is true.
public class basicLoop {
    public static void main(String[] args) {
        System.out.println("Aman and Ajay");

        int number = 0;
        for (int i = 1; i <= 5; i++) {  // how many times it will print => ( condition - initialization + 1 ) whenever <= condition
            System.out.println("Aman hits Ajay");
            number++;
        }
        System.out.println("Total times printed = " + number);
    }
}


// when we write i++ or ++i stand alone so it simply (i = i + 1);

/*

Syntax: for loop

for(initialization; condition; update) {
    // code
}

*/
