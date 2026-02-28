import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.UUID;
import java.io.*;



public class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<User> users;
    private List<Material> materials;
    private List<Furniture> furniture;
    private List<Loan> loans;

    public Library() {
        this.users = new ArrayList<>();
        this.materials = new ArrayList<>();
        this.furniture = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public boolean registerUser(User user) {
        if (user == null || !user.validate() || users.stream().anyMatch(u -> u.getId().equals(user.getId()))) return false;
        users.add(user);
        return true;
    }

    public boolean registerMaterial(Material material) {
        if (material == null || !material.validate() || materials.stream().anyMatch(m -> m.getId().equals(material.getId()))) return false;
        materials.add(material);
        return true;
    }

    public boolean registerFurniture(Furniture furniture) {
        if (furniture == null || !furniture.validate() || this.furniture.stream().anyMatch(f -> f.getId().equals(furniture.getId()))) return false;
        this.furniture.add(furniture);
        return true;
    }

    public Loan registerLoan(String userId, String materialId) {
        User user = findUserById(userId);
        Material material = findMaterialById(materialId);

        if (user == null || material == null || !user.canBorrow() || !material.isAvailable()) return null;

        String loanId = UUID.randomUUID().toString().substring(0, 4);;
        Loan loan = new Loan(loanId, user, material, LocalDate.now(), LocalDate.now().plusDays(14), LoanStatus.ACTIVE);
        loans.add(loan);
        user.addLoan();
        material.decreaseStock();
        return loan;
    }

    public boolean closeLoan(String loanId) {
        Loan loan = findLoanById(loanId);
        if (loan == null || loan.getStatus() == LoanStatus.RETURNED) return false;
        loan.closeLoan();
        loan.getMaterial().increaseStock();
        loan.getUser().removeLoan();
        return true;
    }

    public String generateReport() {
        long active = loans.stream().filter(l -> l.getStatus() == LoanStatus.ACTIVE).count();
        long overdue = loans.stream().filter(Loan::isOverdue).count();
        return "Library Report\n==============\nTotal Users: " + users.size() +
               "\nTotal Materials: " + materials.size() +
               "\nTotal Furniture: " + furniture.size() +
               "\nTotal Loans: " + loans.size() +
               "\nActive Loans: " + active +
               "\nOverdue Loans: " + overdue + "\n";
    }

    public String generateDetailedReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("DETAILED LIBRARY SYSTEM REPORT\n================================\n");
        sb.append("\n--- USERS (" + users.size() + ") ---\n");
        for (User u : users) sb.append(u.toString()).append("\n");
        
        sb.append("\n--- MATERIALS (" + materials.size() + ") ---\n");
        for (Material m : materials) sb.append(m.toString()).append("\n");
        
        sb.append("\n--- FURNITURE (" + furniture.size() + ") ---\n");
        for (Furniture f : furniture) sb.append(f.toString()).append("\n");
        
        sb.append("\n--- LOANS (" + loans.size() + ") ---\n");
        for (Loan l : loans) sb.append(l.toString()).append("\n");
        
        return sb.toString();
    }

    public User findUserById(String id) { return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null); }
    public Material findMaterialById(String id) { return materials.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null); }
    public Loan findLoanById(String id) { return loans.stream().filter(l -> l.getId().equals(id)).findFirst().orElse(null); }

    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }
    public List<Material> getMaterials() { return materials; }
    public void setMaterials(List<Material> materials) { this.materials = materials; }
    public List<Furniture> getFurniture() { return furniture; }
    public void setFurniture(List<Furniture> furniture) { this.furniture = furniture; }
    public List<Loan> getLoans() { return loans; }
    public void setLoans(List<Loan> loans) { this.loans = loans; }


    public void save(String path) {
        try {
            File parent = new File(path).getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            System.err.println("Error saving: " + e.getMessage());
        }
    }

    public static Library load(String path) {
        try {
            File file = new File(path);
            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                Library library = (Library) ois.readObject();
                ois.close();
                return library;
            }
        } catch (Exception e) {
            System.err.println("Error loading. Starting fresh db.");
        }
        return new Library();
    }

}
