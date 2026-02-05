package src.ss09.b1;

public class Person {
    public String fullName;
    public int age;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public void showInfo(){
        System.out.println("Họ và Tên: "+ this.fullName);
        System.out.println("Tuổi: "+ this.age);
    }

    public static void main(String[] args) {
        Student s = new Student("Nguyễn Sơn Minh", 19, 8.5, "B23DCCN001");
        s.showInfo();
    }
}

class Student extends Person {
    private String msv;
    private double avgSocre;

    public Student(String fullName, int age, double avgSocre, String msv) {
        super(age,fullName);
        this.avgSocre = avgSocre;
        this.msv = msv;
    }
}

