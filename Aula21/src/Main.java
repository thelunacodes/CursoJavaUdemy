import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int mascara = 0b100000;

        if ((n & mascara) != 0 ) {
            System.out.println("O sexto bit é verdadeiro!");
        } else {
            System.out.println("O sexto bit é falso!");
        }

        scanner.close();
    }
}