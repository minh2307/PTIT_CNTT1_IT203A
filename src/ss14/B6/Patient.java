package src.ss14.B6;

import java.util.Objects;

public class Patient {
    public String name;
    public int age;
    public String treatDept;

    public Patient(String name, int age, String treatDept) {
        this.name = name;
        this.age = age;
        this.treatDept = treatDept;
    }

    public String getName() {
        return name;
    }

    public String getTreatDept() {
        return treatDept;
    }

    @Override
    public String toString() {
        return "Patient(" + name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
