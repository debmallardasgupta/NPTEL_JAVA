package student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // In-memory storage
    private static final List<Student> studentList = new ArrayList<>();

    // ─────────────────────────────────────────────
    //  Helpers
    // ─────────────────────────────────────────────
    private static void printBanner() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      STUDENT DATA ENTRY SYSTEM  v1.0     ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("  ┌─────────────────────────────────────┐");
        System.out.println("  │           MAIN MENU                 │");
        System.out.println("  ├─────────────────────────────────────┤");
        System.out.println("  │  1. Add Bachelor   (UG)             │");
        System.out.println("  │  2. Add Master     (PG)             │");
        System.out.println("  │  3. Add PhD        (PG)             │");
        System.out.println("  │  4. Add Scientist  (PG)             │");
        System.out.println("  │  5. Print All Records               │");
        System.out.println("  │  6. Exit                            │");
        System.out.println("  └─────────────────────────────────────┘");
        System.out.print("  Choose an option [1-6] : ");
    }

    private static void separator() {
        System.out.println("  ─────────────────────────────────────────");
    }

    // ─────────────────────────────────────────────
    //  Add helpers
    // ─────────────────────────────────────────────
    private static void addBachelor() {
        System.out.println("\n  [ Bachelor Student Entry ]");
        separator();
        Bachelor b = new Bachelor();
        b.readData();
        studentList.add(b);
        System.out.println("\n  ✔  Bachelor record saved successfully!");
    }

    private static void addMaster() {
        System.out.println("\n  [ Master Student Entry ]");
        separator();
        Master m = new Master();
        m.readData();
        studentList.add(m);
        System.out.println("\n  ✔  Master record saved successfully!");
    }

    private static void addPhD() {
        System.out.println("\n  [ PhD Student Entry ]");
        separator();
        PhD p = new PhD();
        p.readData();
        studentList.add(p);
        System.out.println("\n  ✔  PhD record saved successfully!");
    }

    private static void addScientist() {
        System.out.println("\n  [ Scientist Entry ]");
        separator();
        Scientist s = new Scientist();
        s.readData();
        studentList.add(s);
        System.out.println("\n  ✔  Scientist record saved successfully!");
    }

    // ─────────────────────────────────────────────
    //  Print all records
    // ─────────────────────────────────────────────
    private static void printAll() {
        if (studentList.isEmpty()) {
            System.out.println("\n  ⚠  No records found. Please add some entries first.");
            return;
        }
        System.out.println("\n  ╔═══════════════════════════════════════╗");
        System.out.println("  ║          ALL STUDENT RECORDS          ║");
        System.out.println("  ╚═══════════════════════════════════════╝");

        int count = 1;
        for (Student s : studentList) {
            System.out.println();
            System.out.println("  Record #" + count++
                    + "  [" + s.getClass().getSimpleName() + "]");
            separator();
            s.printData();
        }
        System.out.println();
        separator();
        System.out.println("  Total records : " + studentList.size());
    }

    // ─────────────────────────────────────────────
    //  Entry point
    // ─────────────────────────────────────────────
    public static void main(String[] args) {

        printBanner();

        // Re-use the same Scanner that Student holds
        boolean running = true;
        while (running) {
            printMenu();
            try {
                int choice = Integer.parseInt(Student.sc.nextLine().trim());
                switch (choice) {
                    case 1 -> addBachelor();
                    case 2 -> addMaster();
                    case 3 -> addPhD();
                    case 4 -> addScientist();
                    case 5 -> printAll();
                    case 6 -> {
                        System.out.println("\n  Goodbye! Happy committing 🟩\n");
                        running = false;
                    }
                    default -> System.out.println("\n  ⚠  Invalid option. Please enter 1-6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n  ⚠  Please enter a valid number.");
            }
        }
    }
}
