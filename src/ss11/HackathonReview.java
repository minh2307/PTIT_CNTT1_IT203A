package src.ss11;


    import java.util.Scanner;

    public class HackathonReview {

        static Scanner sc = new Scanner(System.in);

        // =========================
        // CÂU 1 - PHẦN 1
        // =========================
        public static void tachNguyenAmPhuAm() {
            System.out.print("Nhập chuỗi: ");
            String str = sc.nextLine();

            String nguyenAm = "";
            String phuAm = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        nguyenAm += c;
                    } else {
                        phuAm += c;
                    }
                }
            }

            System.out.println("Nguyên âm: " + nguyenAm);
            System.out.println("Phụ âm: " + phuAm);
        }

        // =========================
        // CÂU 1 - PHẦN 2
        // =========================
        public static void kyTuXuatHienNhieuNhat() {
            System.out.print("Nhập chuỗi: ");
            String str = sc.nextLine().toLowerCase();

            int maxCount = 0;
            char result = ' ';

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (!Character.isLetter(c)) continue;

                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (c == str.charAt(j)) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    result = c;
                }
            }

            System.out.println(result + " (xuất hiện " + maxCount + " lần)");
        }

        // =========================
        // CÂU 2 - PHẦN 1
        // =========================
        public static void deleteAndShift() {
            System.out.print("Nhập n: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Nhập mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Nhập x cần xóa: ");
            int x = sc.nextInt();

            int k = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] != x) {
                    arr[k++] = arr[i];
                }
            }

            System.out.println("Mảng sau khi xóa:");
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("\nKích thước mới: " + k);
            sc.nextLine(); // clear buffer
        }

        // =========================
        // CÂU 2 - PHẦN 2
        // =========================
        public static void evenOddPartition() {
            System.out.print("Nhập n: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Nhập mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            while (left < right) {

                while (left < right && arr[left] % 2 == 0) {
                    left++;
                }

                while (left < right && arr[right] % 2 != 0) {
                    right--;
                }

                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }

            System.out.println("Mảng sau khi phân tách:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            sc.nextLine(); // clear buffer
        }

        // =========================
        // CÂU 3
        // =========================
        public static boolean isExist(int[] arr, int size, int value) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == value) return true;
            }
            return false;
        }

        public static boolean isInArray(int[] arr, int size, int value) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == value) return true;
            }
            return false;
        }

        public static void intersection() {
            System.out.print("Nhập số phần tử mảng A: ");
            int n = sc.nextInt();
            int[] A = new int[n];

            System.out.println("Nhập mảng A:");
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            System.out.print("Nhập số phần tử mảng B: ");
            int m = sc.nextInt();
            int[] B = new int[m];

            System.out.println("Nhập mảng B:");
            for (int i = 0; i < m; i++) {
                B[i] = sc.nextInt();
            }

            int[] result = new int[n];
            int k = 0;

            for (int i = 0; i < n; i++) {
                if (isInArray(B, m, A[i]) && !isExist(result, k, A[i])) {
                    result[k++] = A[i];
                }
            }

            System.out.println("Giao hai mảng:");
            for (int i = 0; i < k; i++) {
                System.out.print(result[i] + " ");
            }

            System.out.println();
            sc.nextLine(); // clear buffer
        }

        // =========================
        // MENU CHÍNH
        // =========================
        public static void main(String[] args) {

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Tách Nguyên âm / Phụ âm");
                System.out.println("2. Ký tự xuất hiện nhiều nhất");
                System.out.println("3. Xóa và Dịch chuyển");
                System.out.println("4. Phân tách Chẵn - Lẻ");
                System.out.println("5. Giao hai mảng");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");

                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        tachNguyenAmPhuAm();
                        break;
                    case 2:
                        kyTuXuatHienNhieuNhat();
                        break;
                    case 3:
                        deleteAndShift();
                        break;
                    case 4:
                        evenOddPartition();
                        break;
                    case 5:
                        intersection();
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
    }

