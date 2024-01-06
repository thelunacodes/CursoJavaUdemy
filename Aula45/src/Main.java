import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamVetor = sc.nextInt();
        int[] numeros = new int[tamVetor];
        int quantPares = 0;
        double mediaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                quantPares++;
                mediaPares += numeros[i];
            }
        }
        if (quantPares != 0) {
            mediaPares /= (double) quantPares;
            System.out.printf("Média dos pares: %.1f", mediaPares);
        } else {
            System.out.println("Nenhum par encontrado.");
        }
    }
}