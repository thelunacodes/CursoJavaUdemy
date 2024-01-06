import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você irá digitar? ");
        int quantPessoas = sc.nextInt();
        String[] nomes = new String[quantPessoas];
        int[] idades = new int[quantPessoas];
        int maiorIdadeIndex = 0;

        for (int i = 0; i < quantPessoas; i++) {
            sc.nextLine();
            System.out.printf("Insira o nome da %d° pessoa: ", i+1);
            nomes[i] = sc.nextLine();
            System.out.printf("Insira a idade da %d° pessoa: ", i+1);
            idades[i] = sc.nextInt();
            if (idades[i] > idades[maiorIdadeIndex]) {
                maiorIdadeIndex = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s", nomes[maiorIdadeIndex]);
    }
}