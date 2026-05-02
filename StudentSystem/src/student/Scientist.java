package student;

public class Scientist extends PG {

    private String area;

    public Scientist() { super(); }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Research Area    : ");
        this.area = sc.nextLine().trim();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  Research Area    : " + area);
    }

    // --- Getters & Setters ---
    public String getArea()           { return area; }
    public void setArea(String a)     { this.area = a; }
}
