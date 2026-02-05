package src.ss01;
import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách (4 chữ số nguyên): ");
        int bookId = Integer.parseInt(sc.nextLine());

        int thousands = bookId / 1000;
        int hundreds = (bookId % 1000) / 100;
        int tens = (bookId % 100) / 10;
        int units = bookId % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + tens;

        if (sumOfFirstThreeNumber % 10 == units) {
            System.out.println("Mã sách hợp lệ");
        } else {
            System.out.println("Mã sách không hợp lệ");
        }
    }   
}
