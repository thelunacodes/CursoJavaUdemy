import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int ex = 3;

        switch (ex) {
            case 1:
                //Exercício 1
                System.out.print("Insira um número inteiro entre 1 e 1000: ");
                int ex1_valX = scanner.nextInt();
                while (!(ex1_valX >= 1 && ex1_valX <= 1000)) {
                    System.out.print("Insira um número inteiro entre 1 e 1000: ");
                    ex1_valX = scanner.nextInt();
                }
                for (int i = 0; i <= ex1_valX; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                //Exercício 2
                int ex2_in = 0;
                int ex2_out = 0;
                int ex2_valX = 0;
                System.out.print("Insira o número de caracteres que serão lidos: ");
                int ex2_valN = scanner.nextInt();
                for (int i = 0; i < ex2_valN; i++) {
                    System.out.printf("Insira o número #%d: ", i+1);
                    ex2_valX = scanner.nextInt();
                    if (ex2_valX >= 10 && ex2_valX <= 20) {
                        ex2_in++;
                    } else {
                        ex2_out++;
                    }
                }
                System.out.printf("%d in %n%d out", ex2_in, ex2_out);
                break;
            case 3:
                //Exercício 3
                double ex3_nota1 = 0;
                double ex3_nota2 = 0;
                double ex3_nota3 = 0;
                double ex3_mediaNota = 0;
                System.out.print("Insira o número de testes: ");
                int ex3_numTestes = scanner.nextInt();
                for (int i = 0; i < ex3_numTestes; i++) {
                    System.out.printf("(Teste %d) Nota 1/3: ", i+1);
                    ex3_nota1 = scanner.nextDouble();
                    System.out.printf("(Teste %d) Nota 2/3: ", i+1);
                    ex3_nota2 = scanner.nextDouble();
                    System.out.printf("(Teste %d) Nota 3/3: ", i+1);
                    ex3_nota3 = scanner.nextDouble();
                    ex3_mediaNota = (ex3_nota1 * 2 + ex3_nota2 * 3 + ex3_nota3 * 5) / (2 + 3 + 5);
                    System.out.printf("Média das notas do teste #%d: %.1f %n%n", i+1, ex3_mediaNota);
                }
                break;
            case 4:
                //Exercício 4
                break;
            case 5:
                //Exercício 5
                break;
            case 6:
                //Exercício 6
                break;
            case 7:
                //Exercício 7
                break;
            default:
                System.out.println("Exercício Inválido");
        }
    }
}