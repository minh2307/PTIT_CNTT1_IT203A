package src.ss15.b4;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    public String id;
    public String name;
    public int priority;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(EmergencyPatient other) {
        return this.priority - other.priority;
    }

    @Override
    public String toString() {
        return "EmergencyPatient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
