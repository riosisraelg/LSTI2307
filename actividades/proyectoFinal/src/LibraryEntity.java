import java.time.LocalDate;
import java.io.Serializable;

public abstract class LibraryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String id;
    protected String name;
    protected LocalDate createdAt;

    public LibraryEntity() { }

    public LibraryEntity(String id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = LocalDate.now();
    }

    public LibraryEntity(LibraryEntity other) {
        this.id = other.id;
        this.name = other.name;
        this.createdAt = other.createdAt;
    }

    public abstract boolean validate();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "LibraryEntity[id='" + id + "', name='" + name + "', createdAt=" + createdAt + "]";
    }
}
