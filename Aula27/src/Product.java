public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Name: " + name + "\nPrice: $ " + String.format("%.2f", price) + "\nQuantity: " + quantity + "\nTotal value: " + String.format("%.2f", quantity * price);
    }
}
