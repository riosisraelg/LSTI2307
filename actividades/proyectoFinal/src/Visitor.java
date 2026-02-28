import java.io.Serializable;

public class Visitor extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LOAN_ITEMS = 2;

    public Visitor() { }

    public Visitor(String id, String name, String lastName, int age, String email, double balance) {
        super(id, name, lastName, age, email, balance, 0);
    }

    public Visitor(Visitor other) {
        super(other);
    }

    @Override
    public boolean canBorrow() {
        return getActiveLoans() < MAX_LOAN_ITEMS;
    }

    @Override
    public String toString() {
        return "Visitor[" + super.toString() + "]";
    }
}
