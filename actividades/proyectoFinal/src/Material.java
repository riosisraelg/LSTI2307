import java.time.LocalDate;
import java.io.Serializable;

public abstract class Material extends LibraryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String author;
    protected LocalDate publicationDate;
    protected int stock;
    protected MaterialCondition condition;

    public Material() { }

    public Material(String id, String name, String author, LocalDate publicationDate, int stock, MaterialCondition condition) {
        super(id, name);
        this.author = author;
        this.publicationDate = publicationDate;
        this.stock = stock;
        this.condition = condition;
    }

    public Material(Material other) {
        super(other);
        this.author = other.author;
        this.publicationDate = other.publicationDate;
        this.stock = other.stock;
        this.condition = other.condition;
    }

    public boolean isAvailable() {
        return stock > 0 && condition != MaterialCondition.DAMAGED;
    }

    public void decreaseStock() {
        if (isAvailable()) stock--;
    }

    public void increaseStock() {
        stock++;
    }

    @Override
    public boolean validate() {
        return id != null && !id.trim().isEmpty() &&
               name != null && !name.trim().isEmpty() &&
               author != null && !author.trim().isEmpty() &&
               stock >= 0 &&
               condition != null;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public void setPublicationDate(LocalDate publicationDate) { this.publicationDate = publicationDate; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public MaterialCondition getCondition() { return condition; }
    public void setCondition(MaterialCondition condition) { this.condition = condition; }

    @Override
    public String toString() {
        return "Material[id='" + id + "', name='" + name + "', author='" + author + 
               "', publicationDate=" + publicationDate + ", stock=" + stock + 
               ", condition=" + condition + "]";
    }
}
