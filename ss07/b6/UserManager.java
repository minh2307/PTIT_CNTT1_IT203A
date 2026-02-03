package ss07.b6;

public class UserManager {
    private static User[] users = new User[100]; // tối đa 100 user
    private static int count = 0;

    public static void addUser(User user) {
        if (count < users.length) {
            users[count] = user;
            count++;
        } else {
            System.out.println("Danh sách người dùng đã đầy!");
        }
    }

    public static User findById(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public static User findByUsername(String username) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        User u1 = new User(1, "minh", "123");
        User u2 = new User(2, "an", "456");

        UserManager.addUser(u1);
        UserManager.addUser(u2);

        UserManager.findById(2).display();
    }
}
