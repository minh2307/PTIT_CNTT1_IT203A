package ss06.b4;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
        this.id = "UNKNOWN";
        this.name = "UNKNOWN";
        this.salary = 0;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        // Tạo đối tượng bằng các constructor khác nhau
        Employee e1 = new Employee();
        Employee e2 = new Employee("E01", "An");
        Employee e3 = new Employee("E02", "Bình", 15000000);

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}
