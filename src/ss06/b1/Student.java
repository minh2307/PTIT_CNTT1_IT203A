package src.ss06.b1;

public class Student {
    private String msv;
    private String fullName;
    private String brithDay;
    private double avgScore;

    public Student(String msv,String fullName,String brithDay,double avgScore){
        this.msv = msv;
        this.fullName = fullName;
        this.brithDay = brithDay;
        this.avgScore = avgScore;
    }

    public void displayStudent(){
        System.out.println("Mã sinh viên: "+ this.msv);
        System.out.println("Họ và tên: "+ this.fullName);
        System.out.println("Năm sinh: "+ this.brithDay);
        System.out.println("Điểm trung bình: "+ this.avgScore);
    }

    public static void main(String[] args) {
        Student s1 = new Student("1","minh", "2006", 8.9);
        Student s2 = new Student("2","minh2", "2004", 5.9);

        s1.displayStudent();
        s2.displayStudent();
    }
}
