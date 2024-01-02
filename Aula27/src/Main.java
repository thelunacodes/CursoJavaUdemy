import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product produto;
        produto = new Product();
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: \n");
        System.out.print("Name: ");
        produto.name = scanner.nextLine();
        System.out.print("Price: ");
        produto.price = scanner.nextDouble();
        System.out.print("Quantity: ");
        produto.quantity = scanner.nextInt();

        System.out.println("\n" + produto.toString());

        //System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f %n%n", produto.name, produto.price, produto.quantity, produto.totalValueInStock());

        System.out.print("\nEnter the number of produts to be added in stock: ");
        int quantAdd = scanner.nextInt();
        produto.addProducts(quantAdd);
        System.out.println("\n" + produto.toString());

        System.out.print("\nEnter the number of products to be removed from stock: ");
        int quantRem = scanner.nextInt();
        produto.removeProducts(quantRem);
        System.out.println("\n" + produto.toString());
    }

}