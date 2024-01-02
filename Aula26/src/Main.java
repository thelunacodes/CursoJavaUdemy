import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle x, y;
        x = new Triangle(); //Instanciação
        y = new Triangle();
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();
        largerArea(areaX, areaY);

        scanner.close();
    }
    public static void largerArea(double a1, double a2) {
        if (a1 > a2) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}