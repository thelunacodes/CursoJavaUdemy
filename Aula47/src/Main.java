import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int quantAlunos = sc.nextInt();
        String[] nomes = new String[quantAlunos];
        double[] notasSem1 = new double[quantAlunos];
        double[] notasSem2 = new double[quantAlunos];
        double[] mediaNotas = new double[quantAlunos];

        for (int i = 0; i < quantAlunos; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome do(a) %d° aluno(a): ", i+1);
            nomes[i] = sc.nextLine();
            System.out.printf("Digite a nota (1° semestre) do(a) %d° aluno(a): ", i+1);
            notasSem1[i] = sc.nextDouble();
            System.out.printf("Digite a nota (2° semestre) do(a) %d° aluno(a): ", i+1);
            notasSem2[i] = sc.nextDouble();
            mediaNotas[i] = (notasSem1[i] + notasSem2[i]) / 2;
        }
        System.out.println("Alunos aprovados: ");
        for (int j = 0; j < quantAlunos; j++) {
            if (mediaNotas[j] >= 6.0) {
                System.out.println(nomes[j] + " (média: " + String.format("%.1f",mediaNotas[j]) + ")");
            }
        }
    }
}