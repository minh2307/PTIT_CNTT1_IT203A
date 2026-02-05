package src.ss02;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khu vuc (A,B,C,D): ");
        char character = sc.next().charAt(0);

        switch (character) {
            case 'A':
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Ma khu vuc khong hop le.");
        }
    }
}
