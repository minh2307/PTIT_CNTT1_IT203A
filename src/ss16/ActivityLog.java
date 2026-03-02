package src.ss16;

import java.time.LocalDateTime;

public class ActivityLog {
    private String action;
    private String time;

    public ActivityLog(String action) {
        this.action = action;
        this.time = LocalDateTime.now().toString();
    }

    @Override
    public String toString() {
        return action + " | Time: " + time;
    }
}