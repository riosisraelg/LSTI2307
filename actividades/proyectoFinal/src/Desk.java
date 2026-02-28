import java.time.LocalDate;
import java.io.Serializable;

public class Desk extends Furniture implements Serializable {
    private static final long serialVersionUID = 1L;
    private int seatCapacity;
    private String location;

    public Desk() { }

    public Desk(String id, String name, LocalDate entryDate, int seatCapacity, String location) {
        super(id, name, entryDate);
        this.seatCapacity = seatCapacity;
        this.location = location;
    }


    public Desk(Desk d) {
        super(d);
        this.seatCapacity = d.seatCapacity;
        this.location = d.location;
    }

    @Override
    public boolean validate() {
        return super.validate() && seatCapacity > 0;
    }

    public int getSeatCapacity() { return seatCapacity; }
    public void setSeatCapacity(int seatCapacity) { this.seatCapacity = seatCapacity; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public String toString() {
        return "Desk[" + super.toString() + ", seatCapacity=" + seatCapacity + ", location='" + location + "']";
    }
}
