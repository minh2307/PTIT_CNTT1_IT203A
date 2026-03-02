package src.ss15.b2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    public Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bênh nhân: " + p.getName());
    }

    public Patient callNextPatient() {
        if (!queue.isEmpty()) {
            Patient removed = queue.poll();
            System.out.println("Đang khám: " + removed.getName());
            return removed;
        } else {
            System.out.println("Hết bệnh nhân chờ khám.");
            return null;
        }
    }

    public Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Hết bệnh nhân chờ khám.");
            return null;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
        } else {
            System.out.println("Danh sách bệnh nhân đang chờ:");
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {

        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("P01", "Minh", 20));
        patientQueue.addPatient(new Patient("P02", "Lan", 25));
        patientQueue.addPatient(new Patient("P03", "Hùng", 30));

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println("\nGọi khám:");
        patientQueue.callNextPatient();

        System.out.println("\nDanh sách còn lại:");
        patientQueue.displayQueue();
    }
}
