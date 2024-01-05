import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int tamanhoVetores = sc.nextInt();
        int[] vetorA = new int[tamanhoVetores];
        int[] vetorB = new int[tamanhoVetores];
        int[] vetorC = new int[tamanhoVetores];

        for (int i = 0; i < vetorA.length ; i++) {
            System.out.printf("Digite o %d° valor do vetor A: ", i+1);
            vetorA[i] = sc.nextInt();
        }
        for (int j = 0; j < vetorB.length ; j++) {
            System.out.printf("Digite o %d° valor do vetor B: ", j+1);
            vetorB[j] = sc.nextInt();
        }
        System.out.println("Vetor resultante: ");
        for (int k = 0; k < vetorC.length; k++) {
            vetorC[k] = vetorA[k] + vetorB[k];
            System.out.println(vetorC[k]);
        }
    }
}