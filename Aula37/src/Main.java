import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de produtos: ");
        int quantProdutos = sc.nextInt();
        Produto[] produtos = new Produto[quantProdutos];
        for (int i = 0; i < quantProdutos; i++) {
            sc.nextLine();
            System.out.printf("Insira o nome do produto #%d: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Insira o preço do produto #%d: ", i+1);
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }
        double mediaPreco = 0;
        for (int j = 0; j < quantProdutos; j++) {
            mediaPreco += produtos[j].getPreco();
        }
        mediaPreco /= quantProdutos;
        System.out.printf("Média de preço: R$ %.2f", mediaPreco);
    }
}