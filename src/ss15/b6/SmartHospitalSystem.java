package src.ss15.b6;

import java.time.LocalDateTime;
import java.util.*;

public class SmartHospitalSystem {

    static class Patient {
        String id;
        String name;
        int age;
        String gender;

        public Patient(String id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Mã: " + id + " | Tên: " + name +
                    " | Tuổi: " + age + " | Giới tính: " + gender;
        }
    }

    static class PatientWaitingQueue {
        Queue<Patient> waitingQueue = new LinkedList<>();
        int totalPatients = 0;

        public void addPatient(Patient patient) {
            waitingQueue.offer(patient);
            totalPatients++;
            System.out.println("Đã thêm bệnh nhân vào hàng chờ.");
        }

        public void callNextPatient() {
            Patient p = waitingQueue.poll();
            if (p != null) {
                totalPatients--;
                System.out.println("Đang khám: " + p);
            } else {
                System.out.println("Không còn bệnh nhân.");
            }
        }
    }

    static class EditAction {
        String description;
        String editedBy;
        LocalDateTime editTime;

        public EditAction(String description, String editedBy) {
            this.description = description;
            this.editedBy = editedBy;
            this.editTime = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return description + " | Bởi: " + editedBy +
                    " | Thời gian: " + editTime;
        }
    }

    static class MedicalRecordHistory {
        Stack<EditAction> editStack = new Stack<>();
        String recordId;

        public MedicalRecordHistory(String recordId) {
            this.recordId = recordId;
        }

        public void addEdit(EditAction action) {
            editStack.push(action);
            System.out.println("Đã ghi nhận chỉnh sửa.");
        }

        public void undoLastEdit() {
            if (!editStack.isEmpty()) {
                System.out.println("Hoàn tác: " + editStack.pop());
            } else {
                System.out.println("Không có chỉnh sửa nào.");
            }
        }
    }

    static class Ticket {
        int ticketNumber;
        LocalDateTime issuedTime;

        public Ticket(int ticketNumber) {
            this.ticketNumber = ticketNumber;
            this.issuedTime = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Số: " + ticketNumber + " | Phát lúc: " + issuedTime;
        }
    }

    static class TicketSystem {
        Queue<Ticket> ticketQueue = new LinkedList<>();
        int currentNumber = 0;

        public void issueTicket() {
            currentNumber++;
            Ticket ticket = new Ticket(currentNumber);
            ticketQueue.offer(ticket);
            System.out.println("Phát số thành công: " + ticket);
        }

        public void callNextTicket() {
            Ticket ticket = ticketQueue.poll();
            if (ticket != null) {
                System.out.println("Mời số: " + ticket.ticketNumber);
            } else {
                System.out.println("Không còn số chờ.");
            }
        }
    }

    static class InputAction {
        String fieldName;
        String oldValue;
        String newValue;
        LocalDateTime actionTime;

        public InputAction(String fieldName, String oldValue, String newValue) {
            this.fieldName = fieldName;
            this.oldValue = oldValue;
            this.newValue = newValue;
            this.actionTime = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Trường: " + fieldName +
                    " | Cũ: " + oldValue +
                    " | Mới: " + newValue +
                    " | Thời gian: " + actionTime;
        }
    }

    static class UndoManager {
        Stack<InputAction> undoStack = new Stack<>();
        int maxUndoSteps = 5;

        public void addAction(InputAction action) {
            if (undoStack.size() >= maxUndoSteps) {
                undoStack.remove(0);
            }
            undoStack.push(action);
            System.out.println("Đã lưu thao tác.");
        }

        public void undo() {
            if (!undoStack.isEmpty()) {
                InputAction action = undoStack.pop();
                System.out.println("Hoàn tác thao tác: " + action);
            } else {
                System.out.println("Không có thao tác để hoàn tác.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("===== HỆ THỐNG BỆNH VIỆN THÔNG MINH =====");

        PatientWaitingQueue queue = new PatientWaitingQueue();
        queue.addPatient(new Patient("BN01", "An", 30, "Nam"));
        queue.addPatient(new Patient("BN02", "Bình", 25, "Nữ"));
        queue.callNextPatient();

        MedicalRecordHistory history = new MedicalRecordHistory("HS001");
        history.addEdit(new EditAction("Sửa chẩn đoán", "Bác sĩ Minh"));
        history.undoLastEdit();

        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.issueTicket();
        ticketSystem.issueTicket();
        ticketSystem.callNextTicket();

        UndoManager undoManager = new UndoManager();
        undoManager.addAction(new InputAction("Huyết áp", "120", "140"));
        undoManager.undo();
    }
}