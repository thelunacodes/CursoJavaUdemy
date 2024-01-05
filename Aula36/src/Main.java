import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de alturas a serem lidas: ");
        int quantAlturas = sc.nextInt();
        double[] alturas = new double[quantAlturas];
        for (int i = 0; i < quantAlturas; i++) {
            System.out.printf("Insira a altura #%d: ", i+1);
            alturas[i] = sc.nextDouble();
        }
        double mediaAltura = 0;
        for (int j = 0; j < quantAlturas; j++) {
            mediaAltura += alturas[j];
        }
        mediaAltura /= quantAlturas;
        System.out.printf("Média das alturas: %.2f", mediaAltura);
    }
}