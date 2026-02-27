package src.ss14;

import java.util.HashSet;
import java.util.Set;

public class B3 {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        setA.add("Aspirin");
        setA.add("Caffeine");
        setA.add("Paracetamol");

        setB.add("Penicillin");
        setB.add("Aspirin");
        setB.add("Pollen");

        setA.retainAll(setB);
        System.out.println("Canh bao di ung " + setA);
        setB.removeAll(setA);
        System.out.println("Thanh phan an toan " + setB);
    }
}
