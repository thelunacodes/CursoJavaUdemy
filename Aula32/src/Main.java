import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: \n");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product produto = new Product(name, price, quantity);
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