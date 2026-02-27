package src.ss13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(
                Arrays.asList(
                        "Paracetamol",
                        "Ibuprofen",
                        "Panadol",
                        "Paracetamol",
                        "Aspirin",
                        "Ibuprofen"
                )
        );

        System.out.println("Output: " + input);

        ArrayList<String> uniqueList = new ArrayList<>();

        for (String medicine : input) {
            if (!uniqueList.contains(medicine)) {
                uniqueList.add(medicine);
            }
        }

        Collections.sort(uniqueList);

        System.out.println("Output: " + uniqueList);
    }
}
