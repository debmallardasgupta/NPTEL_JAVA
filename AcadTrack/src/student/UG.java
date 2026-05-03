package student;

public class UG extends Student {

    private String resultUG;

    public UG() { super(); }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Enter UG Result  : ");
        this.resultUG = sc.nextLine().trim();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  UG Result        : " + resultUG);
    }

    // --- Getters & Setters ---
    public String getResultUG()           { return resultUG; }
    public void setResultUG(String r)     { this.resultUG = r; }
}
