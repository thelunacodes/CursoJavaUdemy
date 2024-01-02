import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.printf("Circuference: %.2f %n", Calculator.calculateCircuference(radius));
        System.out.printf("Volume: %.2f %n", Calculator.calculateVolume(radius));
        System.out.printf("Pi: %.2f", Calculator.pi);
    }
}