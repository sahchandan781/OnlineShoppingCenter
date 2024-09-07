package product;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Stock: " + stock);
    }

    public void purchase(int quantity) throws Exception {
        if (quantity > stock) {
            throw new Exception("Insufficient stock for product: " + name);
        }
        stock -= quantity;
    }
}
