public class Main {
    public static void main(String[] args) {
        double preco = 34.05;
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Desconto: R$ %.2f", desconto);
    }
}