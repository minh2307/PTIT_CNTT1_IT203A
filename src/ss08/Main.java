package src.ss08;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);
        while (true) {
            System.out.println("\n===== QUAN LY SINH VIEN =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Cap nhat sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Sap xep theo diem TB");
            System.out.println("7. Thong ke");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.addStudent(sc);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.searchStudent(sc);
                    break;
                case 4:
                    manager.updateStudent(sc);
                    break;
                case 5:
                    manager.deleteStudent(sc);
                    break;
                case 6:
                    manager.sortByAverage();
                    break;
                case 7:
                    manager.statistics();
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
