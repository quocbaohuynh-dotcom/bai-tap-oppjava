package bai2_1;
// book

public class bai21b {
    private String name;
    private bai21a author;
    private double price;
    private int qty;

    public bai21b(String name, bai21a author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public bai21b(String name, bai21a author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public bai21a getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() +
               ",price=" + price + ",qty=" + qty + "]";
    } 
}
