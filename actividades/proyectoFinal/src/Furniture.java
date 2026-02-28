import java.time.LocalDate;
import java.io.Serializable;

public abstract class Furniture extends LibraryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected LocalDate entryDate;

    public Furniture() { }

    public Furniture(String id, String name, LocalDate entryDate) {
        super(id, name);
        this.entryDate = entryDate;
    }

    public Furniture(Furniture other) {
        super(other);
        this.entryDate = other.entryDate;
    }

    @Override
    public boolean validate() {
        return id != null && !id.trim().isEmpty() &&
               name != null && !name.trim().isEmpty() &&
               entryDate != null;
    }

    public boolean isOperational() { return true; }

    public LocalDate getEntryDate() { return entryDate; }
    public void setEntryDate(LocalDate entryDate) { this.entryDate = entryDate; }

    @Override
    public String toString() {
        return "Furniture[id='" + id + "', name='" + name + "', entryDate=" + entryDate + "]";
    }
}
