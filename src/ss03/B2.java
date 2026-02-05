package src.ss03;

import java.util.Scanner;

public class B2 {
    public static int searchBooks(String[] arr, String search) {
            for (int i = 0; i < arr.length; i++){
                if (arr[i].equals(search)) return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = {"s", "b", "a", "c", "d"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();
        int flag = searchBooks(books, search);
        if (flag == -1){
            System.out.print("Sách không tồn tại trong thư viện.");
        }else{
            System.out.printf("Tìm thấy sách '%s' tại vị trí số: %d", search, flag);
        }
    }

}


