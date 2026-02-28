import java.time.LocalDate;
import java.io.Serializable;

public class DVD extends Material implements Serializable {
    private static final long serialVersionUID = 1L;
    private int duration;
    private String region;

    public DVD() { }

    public DVD(String id, String name, String author, LocalDate publicationDate, int stock, MaterialCondition condition, int duration, String region) {
        super(id, name, author, publicationDate, stock, condition);
        this.duration = duration;
        this.region = region;
    }

    public DVD(DVD other) {
        super(other);
        this.duration = other.duration;
        this.region = other.region;
    }

    @Override
    public boolean validate() {
        return super.validate() && duration > 0;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    @Override
    public String toString() {
        return "DVD[" + super.toString() + ", duration=" + duration + "mins, region='" + region + "']";
    }
}
