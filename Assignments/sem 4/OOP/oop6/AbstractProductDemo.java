// 11. AbstractProduct class with different product types

abstract class AbstractProduct {
    protected String productName;
    protected double price;

    AbstractProduct(String name, double prc) {
        productName = name;
        price = prc;
    }

    abstract void displayProduct();
}

class Electronics extends AbstractProduct {
    private String brand;
    private String warranty;

    Electronics(String name, double prc, String brnd, String warr) {
        super(name, prc);
        brand = brnd;
        warranty = warr;
    }

    void displayProduct() {
        System.out.println("Electronics: " + productName + ", Brand: " + brand + ", Price: " + price + ", Warranty: " + warranty);
    }
}

class Clothing extends AbstractProduct {
    private String size;
    private String material;

    Clothing(String name, double prc, String sz, String mat) {
        super(name, prc);
        size = sz;
        material = mat;
    }

    void displayProduct() {
        System.out.println("Clothing: " + productName + ", Size: " + size + ", Material: " + material + ", Price: " + price);
    }
}

class Furniture extends AbstractProduct {
    private String color;
    private String dimensions;

    Furniture(String name, double prc, String col, String dim) {
        super(name, prc);
        color = col;
        dimensions = dim;
    }

    void displayProduct() {
        System.out.println("Furniture: " + productName + ", Color: " + color + ", Dimensions: " + dimensions + ", Price: " + price);
    }
}

public class AbstractProductDemo {
    public static void main(String[] args) {
        AbstractProduct product1 = new Electronics("Laptop", 50000, "Dell", "2 years");
        AbstractProduct product2 = new Clothing("T-Shirt", 500, "M", "Cotton");
        AbstractProduct product3 = new Furniture("Chair", 5000, "Black", "60x60x80");

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}
