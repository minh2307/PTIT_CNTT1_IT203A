package ss06.b5;

public class Book {
    private String id;
    private String title;
    private String author;
    private double price;

    public Book(String id, String title, String author, double price) {
        this.id = id;         // this.id: biến instance // id: tham số
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("Mã sách: " + id);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá bán: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book("B01", "Java Cơ Bản", "Nguyễn Văn A", 50000);
        b.displayBook();
    }
}
