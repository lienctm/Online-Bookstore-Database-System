public class Book {
    private int bookID;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int quantity;
    private double sale_price;
    private double rent_price;

    public Book(int bookID, String title, String author, String publisher,
            int year, int quantity, double salePrice, double rentPrice) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantity = quantity;
        this.sale_price = salePrice;
        this.rent_price = rentPrice;
    }

}
