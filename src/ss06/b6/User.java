package src.ss06.b6;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void displayUser() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        User u1 = new User("U01", "minh", "123456", "minh@gmail.com");
        u1.displayUser();

        User u2 = new User("U02", "an", "abcdef", "angmail.com");
        u2.displayUser();

        User u3 = new User("U03", "binh", "", "binh@gmail.com");
        u3.displayUser();
    }
}
