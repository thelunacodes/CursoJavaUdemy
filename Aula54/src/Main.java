import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas e colunas a matriz terá? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.printf("Insira o número em %d-%d: ", i+1, j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int k = 0; k < n; k++) {
            System.out.print(matriz[k][k] + " ");
        }
        System.out.println();
        int negCount = 0;
        for (int l = 0; l < n; l++) {
            for (int m = 0; m < n; m++) {
                if (matriz[l][m] < 0) {
                    negCount++;
                }
            }
        }
        System.out.println("Números negativos: " + negCount);
        System.out.println("Quant. linhas = " + matriz.length);
        System.out.println("Quant. colunas = " + matriz[0].length);

        sc.close();
    }
}