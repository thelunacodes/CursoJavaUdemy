import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee empregado1 = new Employee();

        System.out.print("Name: ");
        empregado1.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        empregado1.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        empregado1.tax = scanner.nextDouble();

        System.out.println("Employee: " + empregado1.toString());

        System.out.print("Which percentage to increse salary? ");
        double salaryIncreasePercentage = scanner.nextDouble();
        empregado1.increaseSalary(salaryIncreasePercentage);

        System.out.println("Updated data: " + empregado1.toString());
    }
}