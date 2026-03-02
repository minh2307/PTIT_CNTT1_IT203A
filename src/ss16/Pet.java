package src.ss16;

public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private double price;

    public Pet(String id, String name, String species, int age, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mã: " + id +
                " | Tên: " + name +
                " | Loài: " + species +
                " | Tuổi: " + age +
                " | Giá: " + price;
    }
}