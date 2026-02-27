package src.ss14;

import java.util.LinkedHashSet;
import java.util.Set;

public class B1 {
    public static void main(String[] args) {
        Set<String> patient = new LinkedHashSet<>();

        patient.add("Nguyễn Văn A - Yên Bái");
        patient.add("Trần Văn B - Thái Bình");
        patient.add("Nguyễn Văn A - Yên Bái");
        patient.add("Lê Văn B - Hưng Yên.");

        System.out.println(patient);

    }
}
