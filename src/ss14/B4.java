package src.ss14;

import java.util.*;

public class B4 {
    public static void main(String[] args) {
        List<String> diseases = new ArrayList<>(
                Arrays.asList(
                        "Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"
                ));

        Map<String, Integer> report = new TreeMap<>();

        for (String disease : diseases) {
            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }

        System.out.println("Output (đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
