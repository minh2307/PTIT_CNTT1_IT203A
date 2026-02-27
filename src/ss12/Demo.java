package src.ss12;

import java.util.Scanner;

public class Demo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    while (true) {
        System.out.println("\n===== MENU =====");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("0.");
        System.out.print("Chọn: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 0:
                System.out.println("Thoát chương trình.");
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
}
