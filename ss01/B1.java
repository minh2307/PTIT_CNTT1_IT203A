package ss01;
import java.text.NumberFormat.Style;
import java.time.LocalDate;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String bookId = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá bìa: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Sách còn trong kho (true/false): ");
        boolean inStock = Boolean.parseBoolean(sc.nextLine());

        int year = LocalDate.now().getYear();

        System.out.println("--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.print("Mã sách: " + bookId + " | ");
        System.out.println("Năm xuất bản: " + (year - publishYear) + " năm");
        System.out.println("Giá bìa: " + price);
        System.out.println("Còn trong kho: " + (inStock ? "Còn hàng" : "Hết hàng"));

        sc.close();
    }
    
}