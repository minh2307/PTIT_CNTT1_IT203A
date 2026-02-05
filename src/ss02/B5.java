package src.ss02;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        int reputation = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        int n = 0;
        int negative_points = 0;
        while (n == 999){
            System.out.print("So ngay tra tre cua lan nay: ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0){
                negative_points -= 5;
            }else {
                negative_points += (n*2);
            }

            System.out.printf("-> Tra tre %d: -%d", n ,negative_points);
        }
        reputation -= negative_points;
        System.out.printf("Tong diem uy tin: %d", reputation);
        if (reputation > 120) {
            System.out.println("Doc gia than thiet");
        } else if (reputation > 80) {
            System.out.println("Doc gia tieu chuan");
        } else if (reputation >= 0) {
            System.out.println("Doc gia can luu y");
        }

    }
}