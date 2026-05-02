package student;

public class PhD extends PG {

    private String topic;
    private String supervisor;

    public PhD() { super(); }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Research Topic   : ");
        this.topic      = sc.nextLine().trim();
        System.out.print("  Supervisor Name  : ");
        this.supervisor = sc.nextLine().trim();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  Research Topic   : " + topic);
        System.out.println("  Supervisor       : " + supervisor);
    }

    // --- Getters & Setters ---
    public String getTopic()               { return topic; }
    public void setTopic(String t)         { this.topic = t; }
    public String getSupervisor()          { return supervisor; }
    public void setSupervisor(String s)    { this.supervisor = s; }
}
