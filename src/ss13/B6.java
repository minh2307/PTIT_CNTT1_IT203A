package src.ss13;

import java.util.*;

public class B6 {


    static Scanner sc = new Scanner(System.in);
    static ArrayList<Medicine> medicineList = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MENU KÊ ĐƠN THUỐC =====");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ (<50.000)");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printBill();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }

    private static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : medicineList) {
            if (m.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập thêm số lượng: ");
                int addQty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + addQty);
                System.out.println("Đã cộng thêm số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công!");
    }

    private static void updateQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Iterator<Medicine> iterator = medicineList.iterator();

        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getId().equalsIgnoreCase(id)) {

                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    iterator.remove();
                    System.out.println("Thuốc đã bị xóa vì số lượng = 0.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Cập nhật thành công.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc!");
    }


    private static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        medicineList.removeIf(m -> m.getId().equalsIgnoreCase(id));

        System.out.println("Nếu mã tồn tại, thuốc đã được xóa.");
    }

    private static void printBill() {

        if (medicineList.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }

        double total = 0;

        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                "Mã", "Tên", "Giá", "SL", "Thành tiền");

        for (Medicine m : medicineList) {
            System.out.printf("%-10s %-15s %-10.0f %-10d %-10.0f\n",
                    m.getId(),
                    m.getName(),
                    m.getPrice(),
                    m.getQuantity(),
                    m.getTotal());

            total += m.getTotal();
        }

        System.out.println("-------------------------------------------");
        System.out.println("TỔNG TIỀN: " + total + " VNĐ");

        // Xóa đơn sau khi in
        medicineList.clear();
        System.out.println("Đã xóa dữ liệu đơn thuốc sau khi in.");
    }


    private static void findCheapMedicine() {

        System.out.println("Danh sách thuốc giá < 50.000:");

        for (Medicine m : medicineList) {
            if (m.getPrice() < 50000) {
                System.out.println(m.getId() + " - " + m.getName() + " - " + m.getPrice());
            }
        }
    }
}

