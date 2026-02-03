package ss05;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniProject {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n===== MINI PROJECT =====");
        System.out.println("1. Two Sum");
        System.out.println("2. Move Zeroes");
        System.out.println("3. Valid Palindrome");
        System.out.println("4. Reverse Words");
        System.out.println("5. Happy Number");
        System.out.println("0. Thoát");
    }

    // ================= FR1 =================
    static void twoSum() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tìm thấy: i = " + i + ", j = " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cặp số!");
        }
    }

    // ================= FR2 =================
    static void moveZeroes() {
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau khi xử lý:");
        System.out.println(Arrays.toString(arr));
    }

    // ================= FR3 =================
    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        // 1. Tạo pattern: chỉ giữ chữ cái & số
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);

        // 2. Thay thế bằng chuỗi rỗng
        s = matcher.replaceAll("").toLowerCase();

        // 3. Two pointers kiểm tra palindrome
        int left = 0, right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Kết quả: " + isPalindrome);

    }


    // ================= FR4 =================
    static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        // Xóa khoảng trắng thừa
        s = s.trim().replaceAll("\\s+", " ");
        if (s.isEmpty()) {
            System.out.println("Chuỗi rỗng!");
            return;
        }

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println("Kết quả: " + result.toString().trim());
    }

    // ================= FR5 =================
    static void happyNumber() {
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        int slow = n;
        int fast = n;

        do {
            slow = sumSquareDigits(slow);
//            System.out.printf("slow: %d\n", slow);
            fast = sumSquareDigits(sumSquareDigits(fast));
//            System.out.printf("flast: %d\n", fast);
        } while (slow != fast);

        if (slow == 1) {
            System.out.println("Đây là số hạnh phúc");
        } else {
            System.out.println("Đây KHÔNG phải số hạnh phúc");
        }
    }

    static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
