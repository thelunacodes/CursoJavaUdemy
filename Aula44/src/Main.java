import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();
        double[] numeros = new double[tamanhoVetor];
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            media += numeros[i];
        }
        media /= tamanhoVetor;
        System.out.printf("Média do vetor: %.3f %n", media);
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] < media) {
                System.out.println(numeros[j]);
            }
        }
    }
}