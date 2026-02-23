package src.ss10;

// Lớp trừu tượng Vehicle
abstract class Vehicle {
    protected String brand;

    // Constructor khởi tạo hãng xe
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Phương thức trừu tượng
    public abstract void move();

    // Phương thức hiển thị thông tin chung
    public void display() {
        System.out.print(brand + " - Cách di chuyển: ");
        move();
    }
}

// Lớp Car kế thừa Vehicle
class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}

// Lớp Bicycle kế thừa Vehicle
class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng sức người");
    }
}

// Class chính
public class B2 {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        car.display();
        bicycle.display();
    }
}
