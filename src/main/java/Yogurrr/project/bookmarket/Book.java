package Yogurrr.project.bookmarket;

public class Book {
    private String ISBN;
    private String bookName;
    private int bookPrice;
    private String writer;
    private String details;
    private String category;
    private String pubdate;

    public Book() {
    }

    public Book(String ISBN, String bookName, int bookPrice, String writer, String details, String category, String pubdate) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.writer = writer;
        this.details = details;
        this.category = category;
        this.pubdate = pubdate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    @Override
    public String toString() {
        String fmt = "%s %s %d %s %s %s %s\n";
        return String.format(fmt, ISBN, bookName, bookPrice, writer, details, category, pubdate);
    }
}
