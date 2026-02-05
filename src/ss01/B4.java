package src.ss01;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD - Kiểu double): ");
        double priceBook = Double.parseDouble(sc.nextLine());
        float exchangeRate = 25450.0f;  
        double VND = (priceBook * exchangeRate);
        System.out.println("Giá chính xác (số thực): " + VND);
        long longVND = (long) VND;
        System.out.println("Giá làm tròn để thanh toán (long): "+  longVND);
        

    }
}
