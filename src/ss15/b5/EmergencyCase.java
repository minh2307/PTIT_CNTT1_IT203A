package src.ss15.b5;

import src.ss15.b2.Patient;

import java.util.Stack;

public class EmergencyCase {
    public Patient patient;
    public Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "EmergencyCase{" +
                "patient=" + patient +
                ", steps=" + steps +
                '}';
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Thêm bệnh nhân thành công.");
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep removed = steps.pop();
            System.out.println("Hoàn tác bước: " + removed.getDescription());
            return removed;
        } else {
            System.out.println("Không có bước nào để hoàn tác.");
            return null;
        }
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý.");
        } else {
            System.out.println("Các bước xử lý:");
            for (TreatmentStep step : steps) {
                System.out.println(step);
            }
        }
    }
}
