package product;

public class Electronics extends Product {
    private String brand;
    private String warranty;

    public Electronics(String name, double price, int stock, String brand, String warranty) {
        super(name, price, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Brand: " + brand + ", Warranty: " + warranty);
    }
}
