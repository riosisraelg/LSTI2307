import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void flushConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int sgs) {
        try {
            Thread.sleep(sgs * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Library library = Library.load("data/library.dat");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                flushConsole();
                System.out.println("\n--- Library Management System ---");
                System.out.println("1. Register User");
                System.out.println("2. Register Material");
                System.out.println("4. Borrow Material");
                System.out.println("5. Return Material");
                System.out.println("6. Generate Summary Report");
                System.out.println("7. Generate Detailed Report");
                System.out.println("8. Exit");
                System.out.print("Select an option: ");

                String option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.print("Type (v=Visitor, l=Librarian): ");
                        String type = scanner.nextLine();
                        System.out.print("ID: "); String id = scanner.nextLine();
                        System.out.print("Name: "); String name = scanner.nextLine();
                        System.out.print("Last Name: "); String lastName = scanner.nextLine();
                        System.out.print("Age: "); int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Email: "); String email = scanner.nextLine();
                        User u = type.equals("v") ? new Visitor(id, name, lastName, age, email, 0.0) : new Librarian(id, name, lastName, age, email, 0.0, "Role");
                        if (library.registerUser(u)) {
                            System.out.println("Success! Created: " + u.toString());
                        } else {
                            System.out.println("Failed to register User.");
                        }
                        sleep(2);
                        break;
                    case "2":
                        System.out.print("Type (b=Book, m=Magazine, d=DVD): ");
                        String mtype = scanner.nextLine();
                        System.out.print("ID: "); String mid = scanner.nextLine();
                        System.out.print("Name: "); String mname = scanner.nextLine();
                        System.out.print("Author: "); String mauthor = scanner.nextLine();
                        System.out.print("Stock: "); int stock = Integer.parseInt(scanner.nextLine());
                        Material m = null;
                        if (mtype.equals("b")) m = new Book(mid, mname, mauthor, LocalDate.now(), stock, MaterialCondition.NEW, "ISBN", "Pub", "Shelf");
                        else if (mtype.equals("m")) m = new Magazine(mid, mname, mauthor, LocalDate.now(), stock, MaterialCondition.NEW, 1, 1);
                        else if (mtype.equals("d")) m = new DVD(mid, mname, mauthor, LocalDate.now(), stock, MaterialCondition.NEW, 120, "1");
                        if (library.registerMaterial(m)) {
                            System.out.println("Success! Created: " + m.toString());
                        } else {
                            System.out.println("Failed to register Material.");
                        }
                        sleep(2);
                        break;
                    case "4":
                        System.out.println("--- Available Users ---");
                        library.getUsers().forEach(user -> System.out.println(user.getId() + " - " + user.getName() + " " + user.getLastName()));
                        System.out.println("-----------------------");
                        System.out.print("User ID: "); String uid = scanner.nextLine();

                        System.out.println("--- Available Materials ---");
                        library.getMaterials().stream().filter(Material::isAvailable).forEach(mat -> System.out.println(mat.getId() + " - " + mat.getName()));
                        System.out.println("---------------------------");
                        System.out.print("Material ID: "); String matid = scanner.nextLine();
                        
                        Loan newLoan = library.registerLoan(uid, matid);
                        if (newLoan != null) {
                            System.out.println("Success! Created: " + newLoan.toString());
                        } else {
                            System.out.println("Failed to register Loan. Check if user/material exists and limits.");
                        }
                        sleep(2);
                        break;
                    case "5":
                        System.out.println("--- Active Loans ---");
                        library.getLoans().stream().filter(l -> l.getStatus() == LoanStatus.ACTIVE).forEach(l -> System.out.println(l.getId() + " - User: " + l.getUser().getName() + " | Material: " + l.getMaterial().getName()));
                        System.out.println("--------------------");
                        System.out.print("Loan ID: "); String lid = scanner.nextLine();
                        if (library.closeLoan(lid)) {
                            System.out.println("Success! Returned Loan ID: " + lid);
                        } else {
                            System.out.println("Failed to return Loan.");
                        }
                        sleep(2);
                        break;
                    case "6":
                        System.out.println(library.generateReport());
                        System.out.println("(Press Enter to continue)");
                        scanner.nextLine();
                        break;
                    case "7":
                        System.out.println(library.generateDetailedReport());
                        System.out.println("(Press Enter to continue)");
                        scanner.nextLine();
                        break;
                    case "8":
                        running = false;
                        library.save("data/library.dat");
                        System.out.println("Goodbye!");
                        sleep(1);
                        flushConsole();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sleep(2);
            }
        }
        scanner.close();
    }
}
