package ss01;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự: ");
        int stt = Integer.parseInt(sc.nextLine());

        System.out.print("\n");
        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        if (stt >= 1 && stt <=25) {
            System.out.println("Kệ số: 1" + " - " + "Vị trí: " + stt);
        }else if (stt > 25 && stt <= 50) {
            System.out.println("Kệ số: 2" + " - " + "Vị trí: " + stt);
        }

        String khu = (stt >= 1 && stt <= 10) ? "Khu Cận" : "Khu Viễn";
        System.out.printf("Phân khu: %s (gần cửa))", khu);
    }
};