import java.time.LocalDate;
import java.io.Serializable;

public class Book extends Material implements Serializable {
    private static final long serialVersionUID = 1L;
    private String isbn;
    private String publisher;
    private String shelfCategory;

    public Book() { }

    public Book(String id, String name, String author, LocalDate publicationDate, int stock, MaterialCondition condition, String isbn, String publisher, String shelfCategory) {
        super(id, name, author, publicationDate, stock, condition);
        this.isbn = isbn;
        this.publisher = publisher;
        this.shelfCategory = shelfCategory;
    }

    public Book(Book other) {
        super(other);
        this.isbn = other.isbn;
        this.publisher = other.publisher;
        this.shelfCategory = other.shelfCategory;
    }

    @Override
    public boolean validate() {
        return super.validate() && isbn != null && !isbn.trim().isEmpty();
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public String getShelfCategory() { return shelfCategory; }
    public void setShelfCategory(String shelfCategory) { this.shelfCategory = shelfCategory; }

    @Override
    public String toString() {
        return "Book[" + super.toString() + ", isbn='" + isbn + "', publisher='" + publisher + 
               "', shelfCategory='" + shelfCategory + "']";
    }
}
