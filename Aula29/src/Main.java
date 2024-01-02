import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Enter the name of the student: ");
        estudante.name = scanner.nextLine();
        System.out.print("Enter the first score: ");
        estudante.score1 = scanner.nextDouble();
        System.out.print("Enter the second score: ");
        estudante.score2 = scanner.nextDouble();
        System.out.print("Enter the third score: ");
        estudante.score3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f %n", estudante.getSum());
        estudante.isApproved();
    }
}