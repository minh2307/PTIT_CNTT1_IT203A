package src.ss08.HN_KS24_CNTT1_NguyenSonMinh;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n;

    public static void main(String[] args) {
        int choice = 0;

        do {
            System.out.println("------QUẢN LÝ ĐIỂM SINH VIÊN----------");
            System.out.println("1. Nhập danh sách sinh viên.");
            System.out.println("2 Hiển thị danh sách sinh viên.");
            System.out.println("3. Tìm kiếm sinh viên theo học lực.");
            System.out.println("4. Sắp xếp theo hpck lực giảm dần.");
            System.out.println("5. Thoát");
            System.out.println("--------------------------------------");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    findRankStudent();
                    break;
                case 4:
                    sortStudent();
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }

        }while(choice != 5);
    }

    public static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhập mã SV (SVxxx): ");
                id = sc.nextLine();
                if (id.matches("SV\\d{3}")) {
                    break;
                }
                System.out.println("Mã SV không hợp lệ!");
            }

            System.out.print("Nhập tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm TB: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    public static void displayStudent(){
        if (n == 0){
            System.out.println("Chưa có sinh viên nào được thêm vào");
            return;
        }

        for(Student s : students){
            System.out.println(s.toString());
        }
    }

    public static void findRankStudent(){
        if (n == 0){
            System.out.println("Chưa có sinh viên nào được thêm vào");
            return;
        }
        sc.nextLine();
        System.out.print("Nhập vào học lực muốn tìm kiếm: ");
        String rank = sc.nextLine();
        boolean check = false;
        for(Student s:students){
            if(s.getRank().equals(rank)){
                System.out.println(s.toString());
                check = true;
            }
        }

        if(!check){
            System.out.println("Không có học lực nào trùng với học lực bạn muốn tìm kiếm");
        }
    }

    public static void sortStudent() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Danh sách sinh viên đã được sắp xếp giảm dần theo điểm.");
    }

}
