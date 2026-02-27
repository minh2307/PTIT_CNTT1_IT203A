package src.ss13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class B5 {

    public static Scanner sc = new Scanner(System.in);
    private static ArrayList<Patient> patientList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("==============MENU===============");
            System.out.println("1. tiếp nhận bệnh nhân.");
            System.out.println("2. cập nhập chuẩn đoán. ");
            System.out.println("3. Xuất viện.");
            System.out.println("4. Sắp xếp danh sách bệnh nhân.");
            System.out.println("5. Hiển thị danh sách bệnh nhân.");
            System.out.println("6. Thoát.");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    System.out.println("===== Danh sách bệnh nhân =====");
                    for (Patient p : patientList) {
                        p.display();
                    }
                    break;
                case 6:
                    System.out.println("Thoát khỏi chương trình");
                    return;
                default:
                    System.out.println("Chọn lại chức năng.");
            }


        } while (choice != 6);

    }


    public static void addPatient() {
        System.out.println("Nhập ID: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Tiếp nhận thành công!");
    }

    public static void updateDiagnosis() {
        System.out.println("Nhập ID cần cập nhập: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    private static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện bệnh nhân!");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân!");
    }

    private static void sortPatients() {

        patientList.sort((p1, p2) -> {
            if (p2.getAge() != p1.getAge()) {
                return p2.getAge() - p1.getAge();
            }
            return p1.getFullName().compareToIgnoreCase(p2.getFullName());
        });

        System.out.println("Danh sách sau khi sắp xếp:");
        for (Patient p : patientList) {
            p.display();
        }
    }
}
