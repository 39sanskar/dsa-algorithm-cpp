package loops;

// Print all alphabets with their corresponding ASCII values.
// A 65, B 66, C 67, .......  Z 90
public class PrintASCIIValues {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " " + (int)i + "  ");
        }
    }
}

// Output:
// A 65  B 66  C 67  D 68  E 69  F 70  G 71  H 72  I 73  J 74  K 75  L 76  M 77  N 78  O 79  P 80  Q 81  R 82  S 83  T 84  U 85  V 86  W 87  X 88  Y 89  Z 90.
