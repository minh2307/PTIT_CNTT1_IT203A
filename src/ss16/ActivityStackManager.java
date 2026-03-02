package src.ss16;

import java.time.LocalDateTime;
import java.util.Stack;

public class ActivityStackManager {

    private Stack<String> stack = new Stack<>();

    public void log(String action) {
        stack.push(action + " | Thời gian: " + LocalDateTime.now());
    }

    public void undo() {
        if (!stack.isEmpty()) {
            System.out.println("Hoàn tác: " + stack.pop());
        } else {
            System.out.println("Không có thao tác để hoàn tác.");
        }
    }

    public void showLogs() {
        if (stack.isEmpty()) {
            System.out.println("Chưa có nhật ký.");
        } else {
            stack.forEach(System.out::println);
        }
    }
}