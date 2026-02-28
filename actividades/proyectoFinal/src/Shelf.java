import java.time.LocalDate;
import java.io.Serializable;

public class Shelf extends Furniture implements Serializable {
    private static final long serialVersionUID = 1L;
    private int capacity;
    private String section;

    public Shelf() { }

    public Shelf(String id, String name, LocalDate entryDate, int capacity, String section) {
        super(id, name, entryDate);
        this.capacity = capacity;
        this.section = section;
    }

    public Shelf(Shelf other) {
        super(other);
        this.capacity = other.capacity;
        this.section = other.section;
    }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }

    @Override
    public String toString() {
        return "Shelf[" + super.toString() + ", capacity=" + capacity + ", section='" + section + "']";
    }
}
