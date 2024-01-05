import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números decimais: ");
        int quantNums = sc.nextInt();
        double[] numerosDecimais = new double[quantNums];
        for (int i = 0; i < quantNums; i++) {
            System.out.printf("Insira o número decimal #%d: ", i+1);
            numerosDecimais[i] = sc.nextDouble();
        }
        System.out.print("Valores: ");
        for (int j = 0; j < quantNums; j++) {
            System.out.print(numerosDecimais[j] + " ");
        }
        double soma = 0;
        for (int k = 0; k < quantNums; k++) {
            soma += numerosDecimais[k];
        }
        System.out.println("\nSoma: " + String.format("%.2f", soma));
        System.out.println("Média: " + String.format("%.2f", (soma / quantNums)));
    }
}