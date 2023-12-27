import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a quantidade de minutos consumidos no telefone: ");
        int minutosTelefone = scanner.nextInt();
        double valorPago = 50.00;

        if (minutosTelefone > 100) {
            valorPago += (minutosTelefone - 100) * 2.00;
        }
        System.out.printf("Valor a pagar: R$ %.2f", valorPago);
    }
}