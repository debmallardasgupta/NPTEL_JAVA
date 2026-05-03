package student;

public class Bachelor extends UG {

    private String branch;
    private String college;

    public Bachelor() { super(); }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Enter Branch     : ");
        this.branch  = sc.nextLine().trim();
        System.out.print("  Enter College    : ");
        this.college = sc.nextLine().trim();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  Branch           : " + branch);
        System.out.println("  College          : " + college);
    }

    // --- Getters & Setters ---
    public String getBranch()          { return branch; }
    public void setBranch(String b)    { this.branch = b; }
    public String getCollege()         { return college; }
    public void setCollege(String c)   { this.college = c; }
}
