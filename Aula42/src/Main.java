import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantNums = sc.nextInt();
        double[] numeros = new double[quantNums];
        for (int i = 0; i < quantNums; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }
        int maiorNumIndex = 0;
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > numeros[maiorNumIndex]) {
                maiorNumIndex = j;
            }
        }
        System.out.printf("%nMaior número = %.1f %nIndex: %d", numeros[maiorNumIndex], maiorNumIndex);
    }
}