import java.time.LocalDate;
import java.io.Serializable;

public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private User user;
    private Material material;
    private LocalDate startDate;
    private LocalDate dueDate;
    private LoanStatus status;

    public Loan() { }

    public Loan(String id, User user, Material material, LocalDate startDate, LocalDate dueDate, LoanStatus status) {
        this.id = id;
        this.user = user;
        this.material = material;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Loan (Loan other) {
        this.id = other.id;
        this.user = other.user;
        this.material = other.material;
        this.startDate = other.startDate;
        this.dueDate = other.dueDate;
        this.status = other.status;
    }

    public void closeLoan() {
        this.status = LoanStatus.RETURNED;
    }

    public boolean isOverdue() {
        return status == LoanStatus.ACTIVE && LocalDate.now().isAfter(dueDate);
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Material getMaterial() { return material; }
    public void setMaterial(Material material) { this.material = material; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public LoanStatus getStatus() { return status; }
    public void setStatus(LoanStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Loan[id='" + id + "', user.id='" + user.getId() + "', material.id='" + 
               material.getId() + "', startDate=" + startDate + ", dueDate=" + dueDate + 
               ", status=" + status + "]";
    }
}
