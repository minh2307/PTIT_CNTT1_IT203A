package src.ss10;
import java.util.Scanner;

// Interface Shape
interface Shape {
    double getArea();
    double getPerimeter();
}

// Lớp Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Lớp Rectangle
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Class chính
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        // Nhập hình chữ nhật
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = sc.nextDouble();

        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double height = sc.nextDouble();
        Shape rectangle = new Rectangle(width, height);

        // In kết quả
        System.out.println("\n=== KẾT QUẢ ===");

        System.out.println("Hình tròn:");
        System.out.printf("Diện tích: %.2f\n", circle.getArea());
        System.out.printf("Chu vi: %.2f\n", circle.getPerimeter());

        System.out.println("\nHình chữ nhật:");
        System.out.printf("Diện tích: %.2f\n", rectangle.getArea());
        System.out.printf("Chu vi: %.2f\n", rectangle.getPerimeter());

        sc.close();
    }
}