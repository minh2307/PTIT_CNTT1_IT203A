package src.ss16;

import java.util.LinkedList;
import java.util.Queue;

public class SpaQueueManager {

    private Queue<ServiceRecord> queue = new LinkedList<>();

    public void add(ServiceRecord record) {
        queue.offer(record);
    }

    public void processNext() {
        ServiceRecord record = queue.poll();
        if (record != null) {
            System.out.println("Đang xử lý: " + record);
        } else {
            System.out.println("Không có thú cưng trong hàng đợi.");
        }
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
        } else {
            queue.forEach(System.out::println);
        }
    }
}