package ss01;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Số lượng sách mượn: ");
        int m = Integer.parseInt(sc.nextLine());

        double fee = n * m * 5000;

        

        boolean banAcount = (fee >= 50000);
        System.out.println("Tiền phạt gốc: " + fee);
        if (n > 7 && m >= 3) {
            fee = fee + fee * 0.2;
        }
        System.out.println("Tiền phạt sau khi điều chỉnh: " + fee);
        System.out.println("Được giảm giá: " + banAcount); 
    }
}