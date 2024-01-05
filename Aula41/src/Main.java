import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantNum = sc.nextInt();
        int[] numeros = new int[quantNum];
        for (int i = 0; i < quantNum; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int quantPares = 0;
        System.out.print("Números pares: ");
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                System.out.print(numeros[j] + " ");
                quantPares++;
            }
        }
        System.out.printf("\nQuantidade de pares: %d", quantPares);
    }
}