package ss07.b2;

public class Person {
    private String name;

    private Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // ===== PRIMITIVE =====
        int a = 10;
        int b = a;   // sao chép giá trị

        b = 20;

        System.out.println("PRIMITIVE:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        System.out.println();

        // ===== REFERENCE =====
        Person p1 = new Person("Minh");
        Person p2 = p1;   // sao chép địa chỉ

        p2.name = "An";

        System.out.println("REFERENCE:");
        System.out.println("p1.name = " + p1.name); // An
        System.out.println("p2.name = " + p2.name); // An
    }

}
