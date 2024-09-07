package cart;

import java.util.ArrayList;
import product.Product;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) throws Exception {
        product.purchase(quantity);
        products.add(product);
    }

    public void displayCartItems() {
        System.out.println("Cart Items:");
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
