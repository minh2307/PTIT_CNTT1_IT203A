package src.ss16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PetManager petManager = new PetManager();
        CustomerManager customerManager = new CustomerManager();
        SpaQueueManager spaManager = new SpaQueueManager();
        ActivityStackManager logManager = new ActivityStackManager();

        while (true) {

            System.out.println("\n===== HỆ THỐNG PET KINGDOM =====");
            System.out.println("1. Thêm thú cưng");
            System.out.println("2. Hiển thị danh sách thú cưng");
            System.out.println("3. Tìm thú cưng theo mã");
            System.out.println("4. Xóa thú cưng (đã bán)");
            System.out.println("5. Đăng ký khách hàng");
            System.out.println("6. Thêm thú cưng vào Spa");
            System.out.println("7. Xử lý Spa");
            System.out.println("8. Xem nhật ký");
            System.out.println("9. Hoàn tác");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập mã: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập loài: ");
                    String species = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());

                    petManager.add(new Pet(id, name, species, age, price));
                    logManager.log("Thêm thú cưng " + name);
                    break;

                case 2:
                    petManager.getAll().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Nhập mã cần tìm: ");
                    Pet found = petManager.findById(sc.nextLine());
                    System.out.println(found != null ? found : "Không tìm thấy.");
                    break;

                case 4:
                    System.out.print("Nhập mã cần xóa: ");
                    if (petManager.deleteById(sc.nextLine())) {
                        System.out.println("Xóa thành công.");
                        logManager.log("Xóa thú cưng");
                    } else {
                        System.out.println("Không tìm thấy thú cưng.");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã khách hàng: ");
                    String cid = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String cname = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();

                    if (customerManager.register(new Customer(cid, cname, phone))) {
                        System.out.println("Đăng ký thành công.");
                        logManager.log("Đăng ký khách hàng " + cname);
                    } else {
                        System.out.println("Số điện thoại đã tồn tại.");
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã thú cưng: ");
                    Pet pet = petManager.findById(sc.nextLine());
                    if (pet != null) {
                        spaManager.add(new ServiceRecord(pet, "Spa trọn gói"));
                        logManager.log("Thêm vào hàng đợi Spa");
                    } else {
                        System.out.println("Không tìm thấy thú cưng.");
                    }
                    break;

                case 7:
                    spaManager.processNext();
                    logManager.log("Xử lý dịch vụ Spa");
                    break;

                case 8:
                    logManager.showLogs();
                    break;

                case 9:
                    logManager.undo();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}