package ss03;

import java.util.Scanner;

public class B1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.printf("Nhập mã số cho %d cuốn sách \n", n);
        for (int i = 0; i < n; i++){
            System.out.printf("Sách thứ %d: ", i);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã máy: ");
        for (int x : arr){
            System.out.printf("%d, ",x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        displayLibraries(addBookToLibraries(n));
    }
}
