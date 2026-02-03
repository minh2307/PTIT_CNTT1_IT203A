package  ss08;
import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int count;
    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }
    private boolean isValidId(String id) {
        return id.matches("^SV\\d{3}$");
    }
    private boolean isDuplicateId(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    public void addStudent(Scanner sc) {
        if (count == students.length) {
            System.out.println("Mang da day, khong the them!");
            return;
        }
        System.out.print("Nhap ma SV (SV001): ");
        String id = sc.nextLine();
        if (!isValidId(id)) {
            System.out.println("Ma sinh vien sai dinh dang!");
            return;
        }
        if (isDuplicateId(id)) {
            System.out.println("Ma sinh vien da ton tai!");
            return;
        }
        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gioi tinh: ");
        String gender = sc.nextLine();
        System.out.print("Nhap diem Toan: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem Ly: ");
        double physics = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem Hoa: ");
        double chemistry = Double.parseDouble(sc.nextLine());
        Student s = new Student(id, name, age, gender, math, physics, chemistry);
        students[count] = s;
        count++;
        System.out.println("Them sinh vien thanh cong!");
    }
    public void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.println("===== DANH SACH SINH VIEN =====");
        System.out.printf("%-8s %-20s %-5s %-8s %-6s %-10s\n",
                "MaSV", "HoTen", "Tuoi", "GT", "DTB", "XepLoai");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
    public void searchStudent(Scanner sc) {
        System.out.print("Nhap ma hoac ten can tim: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
                if (students[i].getId().toLowerCase().contains(keyword)
                    || students[i].getName().toLowerCase().contains(keyword)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien!");
        }
    }
    public void updateStudent(Scanner sc) {
        System.out.print("Nhap ma SV can cap nhat: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                System.out.print("Nhap ten moi: ");
                String name = sc.nextLine();
                System.out.print("Nhap tuoi moi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Nhap gioi tinh moi: ");
                String gender = sc.nextLine();
                System.out.print("Nhap diem Toan moi: ");
                double math = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem Ly moi: ");
                double physics = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap diem Hoa moi: ");
                double chemistry = Double.parseDouble(sc.nextLine());
                students[i].updateInfo(name, age, gender, math, physics, chemistry);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ma SV!");
    }
    public void deleteStudent(Scanner sc) {
        System.out.print("Nhap ma SV can xoa: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ma SV!");
    }
    public void sortByAverage() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep theo diem TB giam dan!");
    }
    public void statistics() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        for (int i = 0; i < count; i++) {
            switch (students[i].getRank()) {
                case "Gioi": gioi++; break;
                case "Kha": kha++; break;
                case "Trung binh": tb++; break;
                default: yeu++;
            }
        }
        System.out.println("===== THONG KE =====");
        System.out.println("Gioi: " + gioi);
        System.out.println("Kha: " + kha);
        System.out.println("Trung binh: " + tb);
        System.out.println("Yeu: " + yeu);
    }
}
