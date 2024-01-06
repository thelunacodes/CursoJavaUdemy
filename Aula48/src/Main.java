import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantPessoas = sc.nextInt();
        double[] alturas = new double[quantPessoas];
        char[] generos = new char[quantPessoas];
        int menorAlturaIndex = 0;
        int maiorAlturaIndex = 0;
        double mediaAlturaMulheres = 0;
        int quantHomens = 0;
        int quantMulheres = 0;

        for (int i = 0; i < quantPessoas; i++) {
            System.out.printf("Altura da %d° pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            do {
                System.out.printf("Genero da %d° pessoa: ", i+1);
                generos[i] = sc.next().toUpperCase().charAt(0);
                if (generos[i] == 'M' || generos[i] == 'F') {
                    break;
                }
            } while (true);

            if (alturas[i] > alturas[maiorAlturaIndex]) {
                maiorAlturaIndex = i;
            }
            if (alturas[i] < alturas[menorAlturaIndex]) {
                menorAlturaIndex = i;
            }
            if (generos[i] == 'F') {
                mediaAlturaMulheres += alturas[i];
                quantMulheres++;
            }
            if (generos[i] == 'M') {
                quantHomens++;
            }
        }
        mediaAlturaMulheres /= quantMulheres;
        System.out.printf("%nMenor altura: %.2f %n", alturas[menorAlturaIndex]);
        System.out.printf("Maior altura: %.2f %n", alturas[maiorAlturaIndex]);
        System.out.printf("Média das alturas das mulheres: %.2f %n", mediaAlturaMulheres);
        System.out.printf("Número de homens: %d %n", quantHomens);

        sc.close();
    }
}