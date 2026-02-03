package ss07.b4;

public class ClassRoom {
    private String nameStudent;
    private static double classFund = 0;

    public ClassRoom(String nameStudent, double price) {
        this.nameStudent = nameStudent;
        classFund += price;
        System.out.println(this.nameStudent + " đóng tiền quỹ lớp: " + price);
    }

    public static void getClassFund() {
        System.out.println("Tổng số tiền quỹ lớp là: " + classFund);
    }

    public static void main(String[] args) {
        ClassRoom c = new ClassRoom("Minh", 120);
        ClassRoom c1 = new ClassRoom("Minh1", 120);
        ClassRoom c2 = new ClassRoom("Minh2", 120);
        ClassRoom c3 = new ClassRoom("Minh3", 120);

        ClassRoom.getClassFund();
    }
}
