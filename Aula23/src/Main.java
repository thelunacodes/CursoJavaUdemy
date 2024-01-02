import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a, b, c);
        showResults(higher);
        scanner.close();
    }
    public static int max(int a, int b, int c) {
        int higher = 0;
        if (a > b && a > c) {
            higher = a;
        } else if (b > c) {
            higher = b;
        } else {
            higher = c;
        }
        return higher;
    }
    public static void showResults(int h) {
        System.out.printf("O maior número é: %d", h);
    }
}