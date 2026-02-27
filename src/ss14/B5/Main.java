package src.ss14.B5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Patient> patientList = new TreeSet<>();

        patientList.add(new Patient("minh", 1, 12));
        patientList.add(new Patient("minh2", 2, 10));
        patientList.add(new Patient("minh3", 3, 9));
        patientList.add(new Patient("minh4", 3, 6));
        patientList.add(new Patient("minh5", 3, 7));

        for (Patient p : patientList) {
            System.out.println(p);
        }


    }
}
