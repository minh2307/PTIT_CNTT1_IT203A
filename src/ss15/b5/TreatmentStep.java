package src.ss15.b5;

public class TreatmentStep {
    public String description;
    public String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TreatmentStep{" +
                "description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
