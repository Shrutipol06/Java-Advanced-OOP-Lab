

import Ecommerce.Customer;
import Ecommerce.Order;
import Ecommerce.Product;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 50000);

        Customer c1 = new Customer(101, "Shruti");

        Order o1 = new Order(p1, 2);

        p1.displayProduct();
        System.out.println();

        c1.displayCustomer();
        System.out.println();

        o1.calculateTotal();
    }
}
