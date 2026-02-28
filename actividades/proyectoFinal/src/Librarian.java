import java.io.Serializable;

public class Librarian extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String role;

    public Librarian() { }

    public Librarian(String id, String name, String lastName, int age, String email, double balance, String role) {
        super(id, name, lastName, age, email, balance, 0);
        this.role = role;
    }

    public Librarian(Librarian other) {
        super(other);
        this.role = other.role;
    }

    @Override
    public boolean canBorrow() {
        return true;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Librarian[" + super.toString() + ", role='" + role + "']";
    }
}
