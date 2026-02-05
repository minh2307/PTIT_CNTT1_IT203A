package src.ss03;

import java.util.Scanner;

public class B5 {
    public static int[] deleteBook(int[] arr, int n, int bookId) {
        int searchIndex;
        for(int i = 0; i < n; i++){
            if(arr[i] == bookId)  searchIndex = i;
        }

        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = 0;

        System.out.printf("Đã xoá mã sách %d\n", bookId);
        return arr;
    }

    public static void displayBookId(int[] arr) {
        System.out.printf("Kho sách hiện tại (%d): ", arr.length);
        System.out.print("[ ");
        for (int x:arr) {
            if (x == 0) continue;
            System.out.printf("%d ",x);
        }
        System.out.printf("]\n");
    }

    public static void main(String[] args) {
        int[] books = {101,102,103,104,105};

        displayBookId(books);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách cần xoá (0 để thoát): ");
        int bookId = sc.nextInt();
        if (bookId == 0) return;

        displayBookId(deleteBook(books, books.length, bookId));
    }
}
