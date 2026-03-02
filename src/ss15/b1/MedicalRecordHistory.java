package src.ss15.b1;

import java.util.Stack;

public class MedicalRecordHistory {
    public Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action.getDescription());
    }

    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            EditAction removed = history.pop();
            System.out.println("Đã hoàn tác: " + removed.getDescription());
            return removed;
        } else {
            System.out.println("Chưa có chỉnh sửa gần nhất.");
            return null;
        }


    }

    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        } else {
            System.out.println("chưa có chỉnh sửa nào.");
            return null;
        }
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Chưa có lịch sử chỉnh sửa.");
        } else {
            for (EditAction action : history) {
                System.out.println(action);
            }
        }
    }

    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán", "09:00"));
        history.addEdit(new EditAction("Thêm đơn thuốc", "09:10"));
        history.addEdit(new EditAction("Chỉnh sửa tiền sử bệnh", "09:20"));

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        history.undoEdit();

        System.out.println("\nLịch sử hiện tại:");
        history.displayHistory();
    }

}

