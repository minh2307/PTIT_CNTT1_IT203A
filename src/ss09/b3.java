package src.ss09;

class Employee1 {
    protected String name;
    protected double basicSalary;


    public Employee1(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Employee1 {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary);
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Department: " + department);
    }
}

public class b3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Smith", 5000.0, "IT");
        manager.displayInfo();
    }
}