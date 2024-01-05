import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Cadastro de pessoas
        System.out.print("Quantas pessoas serão cadastradas? ");
        int quantPessoas = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[quantPessoas];
        for (int i = 0; i < quantPessoas; i++) {
            sc.nextLine();
            System.out.printf("Insira o nome da %d° pessoa: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Insira a idade da %d° pessoa: ", i+1);
            int idade = sc.nextInt();
            System.out.printf("Insira a altura da %d° pessoa: ", i+1);
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        //Media
        double media = 0;
        for (int j = 0; j < pessoas.length; j++) {
            media += pessoas[j].getAltura();
        }
        media /= quantPessoas;
        System.out.printf("Média das alturas: %.2f %n", media);

        //Porcentagem de pessoas com menos de 16 anos + nomes
        int menosDeDezesseis = 0;
        for (int k = 0; k < pessoas.length; k++) {
            if (pessoas[k].getIdade() < 16) {
                menosDeDezesseis++;
            }
        }
        double porcMenosDeDezesseis = (double) menosDeDezesseis * 100 / quantPessoas;
        System.out.printf("Pessoas com menos de dezesseis anos: %.1f%% %n", porcMenosDeDezesseis);
        for (int l = 0; l < pessoas.length; l++) {
            if (pessoas[l].getIdade() < 16) {
                System.out.println(pessoas[l].getNome());
            }
        }
    }
}