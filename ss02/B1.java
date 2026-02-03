package ss02;

import java.util.Scanner;

public class B1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so sach dang muon: ");
        int books = Integer.parseInt(sc.nextLine());

        if(age < 18){
            System.out.println("Ket qua: Khong du diru kien.");
            System.out.println("- Ly do: Ban phai du 18 tuoi tro len");
        }else if(books > 3){
            System.out.println("Ket qua: Khong du diru kien.");
            System.out.println("- Ly do: Ban da muon toi da 3 cuon");
        }else {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        }
    }
}