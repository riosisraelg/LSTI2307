import java.io.Serializable;

public abstract class User extends LibraryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String lastName;
    protected int age;
    protected String email;
    protected double balance;
    protected int activeLoans;

    public User() { }

    public User(String id, String name, String lastName, int age, String email, double balance, int activeLoans) {
        super(id, name);
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.balance = balance;
        this.activeLoans = activeLoans;
    }

    public User(User other) {
        super(other);
        this.lastName = other.lastName;
        this.age = other.age;
        this.email = other.email;
        this.balance = other.balance;
        this.activeLoans = other.activeLoans;
    }

    public abstract boolean canBorrow();

    public void addLoan() { this.activeLoans++; }
    public void removeLoan() { if (this.activeLoans > 0) this.activeLoans--; }

    @Override
    public boolean validate() {
        return id != null && !id.trim().isEmpty() &&
               name != null && !name.trim().isEmpty() &&
               lastName != null && !lastName.trim().isEmpty() &&
               age > 0 &&
               email != null && email.contains("@") &&
               activeLoans >= 0;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public int getActiveLoans() { return activeLoans; }
    public void setActiveLoans(int activeLoans) { this.activeLoans = activeLoans; }

    @Override
    public String toString() {
        return "User[id='" + id + "', name='" + name + "', lastName='" + lastName + 
               "', age=" + age + ", email='" + email + "', balance=" + balance + 
               ", activeLoans=" + activeLoans + "]";
    }
}
