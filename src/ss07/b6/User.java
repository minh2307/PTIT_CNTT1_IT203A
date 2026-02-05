package src.ss07.b6;

public class User {
    private final int id;   // không thay đổi
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void display() {
        System.out.println("ID: " + id + ", Username: " + username);
    }
}


