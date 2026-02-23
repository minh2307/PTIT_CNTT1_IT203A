package src.ss10;
import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class B6 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 20000000));
        products.add(new Product("Phone", 10000000));
        products.add(new Product("Tablet", 15000000));
        products.add(new Product("Headphone", 2000000));


        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }


        });

        System.out.println("=== Sắp xếp theo giá tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\n=== Sắp xếp theo tên A-Z (Lambda) ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
