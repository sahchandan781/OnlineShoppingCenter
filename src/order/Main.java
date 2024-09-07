package order;

import customer.Customer;
import product.Product;
import product.Electronics;
import product.Clothing;

public class Main {
    public static void main(String[] args) {
        try {
            // Create customer
            Customer customer = new Customer("John Doe");

            // Create products
            Product laptop = new Electronics("Laptop", 800.0, 10, "Dell", "2 years");
            Product tShirt = new Clothing("T-Shirt", 20.0, 50, "M", "Cotton");

            // Add products to cart
            customer.getCart().addProduct(laptop, 1);
            customer.getCart().addProduct(tShirt, 2);

            // Display cart items
            customer.getCart().displayCartItems();

            // Place order
            double total = customer.getCart().calculateTotal();
            Order order = new Order(customer, total);
            order.placeOrder();

            // Make payment
            order.makePayment(850.0);  // Provide a sufficient amount
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
