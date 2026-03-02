package src.ss15.b5;

import src.ss15.b2.Patient;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    // Thêm ca vào Queue
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã thêm ca của: " + c.getPatient().getName());
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {
        if (!cases.isEmpty()) {
            EmergencyCase next = cases.poll();
            System.out.println("Đang xử lý: " + next.getPatient().getName());
            return next;
        } else {
            System.out.println("Không còn ca nào.");
            return null;
        }
    }

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("1", "Minh", 20);
        Patient p2 = new Patient("2", "Lan", 25);

        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        queue.addCase(case1);
        queue.addCase(case2);

        EmergencyCase currentCase = queue.getNextCase();

        currentCase.addStep(new TreatmentStep("Tiếp nhận", "09:00"));
        currentCase.addStep(new TreatmentStep("Chẩn đoán", "09:05"));
        currentCase.addStep(new TreatmentStep("Điều trị", "09:10"));

        currentCase.displaySteps();


        currentCase.undoStep();

        currentCase.displaySteps();
    }
}

