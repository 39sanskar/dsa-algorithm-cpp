package loops;

public class LimitOfDataTypes {
    public static void main(String[] args) {

        System.out.println("Byte Range:");
        System.out.println("Min Value: " + Byte.MIN_VALUE);
        System.out.println("Max Value: " + Byte.MAX_VALUE);

        System.out.println("\nShort Range:");
        System.out.println("Min Value: " + Short.MIN_VALUE);
        System.out.println("Max Value: " + Short.MAX_VALUE);

        System.out.println("\nInt Range:");
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("Max Value: " + Integer.MAX_VALUE);

        System.out.println("\nLong Range:");
        System.out.println("Min Value: " + Long.MIN_VALUE);
        System.out.println("Max Value: " + Long.MAX_VALUE);

        System.out.println("\nFloat Range:");
        System.out.println("Min Value: " + Float.MIN_VALUE);
        System.out.println("Max Value: " + Float.MAX_VALUE);

        System.out.println("\nDouble Range:");
        System.out.println("Min Value: " + Double.MIN_VALUE);
        System.out.println("Max Value: " + Double.MAX_VALUE);

        System.out.println("\nCharacter Range:");
        System.out.println("Min Value: " + (int) Character.MIN_VALUE);
        System.out.println("Max Value: " + (int) Character.MAX_VALUE);
    }
}

/*
Output:

Byte Range:
Min Value: -128
Max Value: 127

Short Range:
Min Value: -32768
Max Value: 32767

Int Range:
Min Value: -2147483648
Max Value: 2147483647

Long Range:
Min Value: -9223372036854775808
Max Value: 9223372036854775807

Float Range:
Min Value: 1.4E-45
Max Value: 3.4028235E38

Double Range:
Min Value: 4.9E-324
Max Value: 1.7976931348623157E308

Character Range:
Min Value: 0
Max Value: 65535

*/