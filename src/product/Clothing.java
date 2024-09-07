package product;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, int stock, String size, String material) {
        super(name, price, stock);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size + ", Material: " + material);
    }
}
