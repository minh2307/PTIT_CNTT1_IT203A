package src.ss08;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private double math;
    private double physics;
    private double chemistry;
    private double average;
    private String rank;
    public Student(String id, String name, int age, String gender,
                   double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;

        calculateAverageAndRank();
    }
    public void calculateAverageAndRank() {
        average = (math + physics + chemistry) / 3;

        if (average >= 8.0 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5) {
            rank = "Gioi";
        } else if (average >= 6.5 && math >= 5 && physics >= 5 && chemistry >= 5) {
            rank = "Kha";
        } else if (average >= 5.0 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5) {
            rank = "Trung binh";
        } else {
            rank = "Yeu";
        }
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getAverage() {
        return average;
    }
    public String getRank() {
        return rank;
    }
    public void updateInfo(String name, int age, String gender,
                           double math, double physics, double chemistry) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverageAndRank();
    }
    @Override
    public String toString() {
        return String.format("%-8s %-20s %-5d %-8s %-6.2f %-10s",
                id, name, age, gender, average, rank);
    }
}
