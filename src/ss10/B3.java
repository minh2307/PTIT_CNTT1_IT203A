package src.ss10;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Tên: " + name);
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang bay.");
    }
}

class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi.");
    }
}

// Class chính
public class B3 {
    public static void main(String[] args) {

        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        System.out.println("=== Duck ===");
        duck.displayName();
        duck.swim();
        duck.fly();

        System.out.println("\n=== Fish ===");
        fish.displayName();
        fish.swim();

    }
}
