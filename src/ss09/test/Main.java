package src.ss09.test;

public class Main {
    public static void main(String[] args) {

        BirdAnimal bird = new BirdAnimal();
        MamalAnimal mamal = new MamalAnimal();

        System.out.println("=== Nhập thông tin chim ===");
        bird.input();

        System.out.println("\n=== Nhập thông tin động vật có vú ===");
        mamal.input();

        System.out.println("\n=== Thông tin chim ===");
        bird.display();

        System.out.println("\n=== Thông tin động vật có vú ===");
        mamal.display();
    }
}
