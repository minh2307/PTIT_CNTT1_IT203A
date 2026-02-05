package src.ss06.b3;

public class Product {
    private String msp;
    private String nameSP;
    private double price;

    public Product(String msp, String nameSP, double price){
        this.msp = msp;
        this.nameSP = nameSP;
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá sản phẩm phải lớn hơn 0");
        }
    }

    public void displayProduct(){
        System.out.println("Mã SP: "+this.msp);
        System.out.println("Tên SP: "+this.nameSP);
        System.out.println("Giá bán: "+this.price);
    }

    public static void main(String[] args) {
        Product p = new Product("123", "Kẹo", 0);
        p.displayProduct();

        System.out.println("--------");
        p.setPrice(15000);
        p.displayProduct();
    }
}
