package student;

public class Master extends PG {

    private String specialization;
    private String project;

    public Master() { super(); }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Specialization   : ");
        this.specialization = sc.nextLine().trim();
        System.out.print("  Project Title    : ");
        this.project        = sc.nextLine().trim();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  Specialization   : " + specialization);
        System.out.println("  Project Title    : " + project);
    }

    // --- Getters & Setters ---
    public String getSpecialization()          { return specialization; }
    public void setSpecialization(String s)    { this.specialization = s; }
    public String getProject()                 { return project; }
    public void setProject(String p)           { this.project = p; }
}
