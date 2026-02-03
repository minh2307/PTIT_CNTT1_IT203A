package ss02;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double avg = 0f;
        int max = 0;
        int min = 0;
        for (int i = 0 ; i < 7 ; i++){
            System.out.printf("Nhap lượt muon ngay %d: ", i+2);
            n = Integer.parseInt(sc.nextLine());
            avg += n;
            if (max < n) max = n;
            if (min > n) min = n;
        }

        System.out.println("\n");
        System.out.println("--- KET QUA THONG KE ---");
        System.out.printf("Luot muon thap nhat: %d \n", min);
        System.out.printf("Luot muon cao nhat: %d \n", max);
        System.out.printf("Trung binh luot muon/ngay: %.2f \n", avg/7);
    }
}
