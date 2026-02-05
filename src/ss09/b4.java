
class Animal1 {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void fetch() {
        System.out.println("Dog is fetching ball");
    }
}

public class b4 {
    public static void main(String[] args) {
        Animal1 animal = new Dog1();

        animal.makeSound();

        if (animal instanceof Dog1) {
            Dog1 dog = (Dog1) animal;
            dog.fetch();
        }
    }
}