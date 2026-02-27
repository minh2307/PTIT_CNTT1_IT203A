package src.ss14.B5;

public class Patient implements Comparable<Patient> {
    public String name;
    public int severity;
    public int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Patient o) {
        if (this.severity != o.severity) {
            return Integer.compare(this.severity, o.severity);
        }

        return Integer.compare(this.arrivalTime, o.arrivalTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", severity=" + severity +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
