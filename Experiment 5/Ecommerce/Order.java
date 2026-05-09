package Ecommerce;

public class Order {
    Product product;
    int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void calculateTotal() {
        double total = product.price * quantity;
        System.out.println("Total Order Cost: " + total);
    }
}
