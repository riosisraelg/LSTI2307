import java.time.LocalDate;
import java.io.Serializable;

public class Magazine extends Material implements Serializable {
    private static final long serialVersionUID = 1L;
    private int volume;
    private int number;

    public Magazine() { }

    public Magazine(String id, String name, String author, LocalDate publicationDate, int stock, MaterialCondition condition, int volume, int number) {
        super(id, name, author, publicationDate, stock, condition);
        this.volume = volume;
        this.number = number;
    }

    public Magazine(Magazine other) {
        super(other);
        this.volume = other.volume;
        this.number = other.number;
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    @Override
    public String toString() {
        return "Magazine[" + super.toString() + ", volume=" + volume + ", number=" + number + "]";
    }
}
