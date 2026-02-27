package src.ss14.B6;

import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Set<Patient> patientList = new HashSet<>();

        patientList.add(new Patient("Lan", 12, "Tim Mạch"));
        patientList.add(new Patient("Hùng", 23, "Nội Tiết"));
        patientList.add(new Patient("Mai", 23, "Tim Mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {
            String dept = p.getTreatDept();

            departmentMap.computeIfAbsent(dept, k -> new ArrayList<>()).add(p);
        }

        String maxDept = "";
        int maxSize = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + maxDept + " đang đông nhất (" + maxSize + " bệnh nhân)");
    }
}
