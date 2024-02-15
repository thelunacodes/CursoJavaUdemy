import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas a matriz terá? ");
        int m = sc.nextInt();
        System.out.print("Quantas columas a matriz terá? ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++){
            System.out.printf("Insira os números na %d° linha: %n", i+1);
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Insira o número que deseja procurar: ");
        int num = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == num) {
                    System.out.printf("Posição: %d,%d %n",i,j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (j < n-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (i < m-1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}