package src.ss15.b4;

import java.util.PriorityQueue;

public class EmergencyQueue {
    public PriorityQueue<EmergencyPatient> priorityQueue;

    public EmergencyQueue() {
        priorityQueue = new PriorityQueue<>();
    }

    public void addPatient(EmergencyPatient p) {
        priorityQueue.offer(p);
        System.out.println("Thêm bệnh nhân thành công.");
    }

    public EmergencyPatient callNextPatient() {
        if (!priorityQueue.isEmpty()) {
            EmergencyPatient removed = priorityQueue.poll();
            System.out.println("Đang khám: " + removed.getName());
            return removed;
        } else {
            System.out.println("Danh sách chống.");
            return null;
        }
    }

    public void displayQueue() {
        if (priorityQueue.isEmpty()) {
            System.out.println("Danh sách chống");
        } else {
            for (EmergencyPatient p : priorityQueue) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("1", "Minh", 2));
        queue.addPatient(new EmergencyPatient("2", "Minh1", 1));
        queue.addPatient(new EmergencyPatient("3", "Minh2", 1));
        queue.addPatient(new EmergencyPatient("4", "Minh3", 2));
        queue.addPatient(new EmergencyPatient("5", "Minh4", 1));

        queue.callNextPatient();

        queue.displayQueue();
    }
}
