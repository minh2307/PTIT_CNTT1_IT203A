package src.ss14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Map<String, String> medicineList = new HashMap<>();

        medicineList.put("T01", "Paracetamol");
        medicineList.put("T02", "Ibuprofen");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã thuốc: ");
        String medicine = sc.nextLine();

        if (medicineList.containsKey(medicine)) {
            System.out.println("Tên thuốc: " + medicineList.get(medicine));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }
    }
}
