package src.ss15.b1;

public class EditAction {
    public String description;
    public String time;

    public EditAction(String description, String time) {
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
        return "EditAction{" +
                "description='" + description + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
