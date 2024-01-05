import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantNums = 0;
        do {
            System.out.print("Insira um número de 1 a 10: ");
            quantNums = sc.nextInt();
        } while (quantNums <= 0 || quantNums >= 11);
        int[] numeros = new int[quantNums];
        for (int i = 0; i < quantNums; i++) {
            System.out.printf("Insira o número #%d: ", i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int j = 0; j < quantNums; j++) {
            if (numeros[j] < 0) {
                System.out.println(numeros[j]);
            }
        }
    }
}