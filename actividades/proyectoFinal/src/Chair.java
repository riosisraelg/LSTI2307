import java.time.LocalDate;
import java.io.Serializable;

public class Chair extends Furniture implements Serializable {
    private static final long serialVersionUID = 1L;
    private String material;
    private boolean ergonomic;
    private boolean hasWheels;

    public Chair() { }

    public Chair(String id, String name, LocalDate entryDate, String material, boolean ergonomic, boolean hasWheels) {
        super(id, name, entryDate);
        this.material = material;
        this.ergonomic = ergonomic;
        this.hasWheels = hasWheels;
    }

    public Chair (Chair other
    {
        super(other);
        this.material = other.material;
        this.ergonomic = other.ergonomic;
        this.hasWheels = other.hasWheels;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public boolean isErgonomic() { return ergonomic; }
    public void setErgonomic(boolean ergonomic) { this.ergonomic = ergonomic; }
    public boolean isHasWheels() { return hasWheels; }
    public void setHasWheels(boolean hasWheels) { this.hasWheels = hasWheels; }

    @Override
    public String toString() {
        return "Chair[" + super.toString() + ", material='" + material + 
               "', ergonomic=" + ergonomic + ", hasWheels=" + hasWheels + "]";
    }
}
