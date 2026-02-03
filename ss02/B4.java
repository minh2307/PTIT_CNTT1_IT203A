package ss02;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        while(id <= 0){
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            id = Integer.parseInt(sc.nextLine());
            if (id <= 0){
                System.out.println("Loi: ID phai la so dương. Moi nhao lại");
            }
        }
        System.out.printf("Xac nhan: Ma sach %d da duoc ghi nhan");
    }
}
