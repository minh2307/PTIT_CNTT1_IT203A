package src.ss13;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class B4 {

    private LinkedList<String> patientQueue;

    public void EmergencyRoom() {
        patientQueue = new LinkedList<>();
    }

    public void patientCheckIn(String name) {
        patientQueue.addLast(name);
        System.out.println(name + "đã vào hàng đợi khám.");
    }

    public void emergencyCheckIn(String name) {
        patientQueue.addFirst(name);
        System.out.println("ca nguy kịch: " + name + " được ưu tiên!");
    }

    public void treatPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
        }

        String name = patientQueue.removeFirst();

        System.out.println("đang khám: " + name);

    }

    public static void main(String[] args) {
        B4 room = new B4();

        // Mô phỏng
        room.patientCheckIn("A");
        room.patientCheckIn("B");
        room.emergencyCheckIn("C");

        System.out.println("\n--- Bắt đầu khám ---");

        room.treatPatient();
        room.treatPatient();
        room.treatPatient();
    }
}
