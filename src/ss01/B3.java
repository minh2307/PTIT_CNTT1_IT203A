package src.ss01;

public class B3 {
    public static void main(String[] args) {
        // ===== BƯỚC 1: KHAI BÁO BIẾN =====
        // Stack: tạo 2 biến reference book1, book2
        // Heap (String Pool): tạo 2 object String
        //  "Java Basic"
        //  "Python Intro"
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        String temp;
        // ===== BƯỚC 2: GÁN temp = book1 =====
        // Stack: tạo thêm biến temp
        // temp trỏ tới cùng object String với book2
        // Heap: KHÔNG thay đổi, không tạo String mới
        temp = book1;

         // ===== BƯỚC 3: book1 = book2 =====
        // Stack: book2 đổi reference, trỏ sang "Python Intro"
        // Heap: KHÔNG thay đổi
        book1 = book2;

          // ===== BƯỚC 4: book2 = temp =====
        // Stack: book2 đổi reference, trỏ sang "Java Basic"
        // Heap: KHÔNG thay đổi
        book2 = temp;
    }
}
