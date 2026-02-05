package src.ss06.b2;

public class Account {
    private String userName;
    private String passWord;
    private String email;

    public Account(String userName,String passWord,String email){
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public void displayAccount (){
        System.out.println("UserName: "+ this.userName);
        System.out.println("Email: "+this.email);
    }

    public static void main(String[] args) {
        Account a1 = new Account("minh", "123", "minh@gmail.com");

        a1.displayAccount();

        a1.setPassWord("345");

        a1.displayAccount();
    }
}
