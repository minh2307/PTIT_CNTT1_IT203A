package src.ss02;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra muon: ");
        int late_books =  Integer.parseInt(sc.nextLine());
        int total = 0;
        for (int i = 1; i <= late_books; i++){
            System.out.printf("Nhap so ngay tre cua cuon sach thu %d; ", i);
            int n = Integer.parseInt(sc.nextLine());
            total += n;
        }

        System.out.printf("===> Tong so tien phat muon: %d VND", total*5000);
    }
}
