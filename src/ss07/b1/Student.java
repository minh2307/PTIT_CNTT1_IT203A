package src.ss07.b1;

public class Student {
    private String msv;
    private String nameSv;
    static int totalStudent = 0;

    public Student(String msv, String nameSv) {
        this.msv = msv;
        this.nameSv = nameSv;
        totalStudent ++;
    }

    public void getTotalStudent() {
        System.out.println("Tổng số sv: " + totalStudent);
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }

    public String getNameSv() {
        return nameSv;
    }

    public void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void display(){
        System.out.println("Mã sinh viên: " + getMsv());
        System.out.println("Tên sinh viên: " + getNameSv());
        System.out.println("-------------");

    }

    public static void main(String[] args) {
        Student s = new Student("1", "cat");
        Student s1 = new Student("2", "minh");

        s.display();
        s1.display();
        s.getTotalStudent();
    }

}
