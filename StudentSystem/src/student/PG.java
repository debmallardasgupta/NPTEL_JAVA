package student;

public class PG extends Student {

    // --- Inner structure for Publications ---
    public static class Publications {
        private int book;
        private int paper;
        private int patent;

        public Publications() {}

        public void readPublications() {
            System.out.print("    No. of Books   : ");
            this.book   = Integer.parseInt(Student.sc.nextLine().trim());
            System.out.print("    No. of Papers  : ");
            this.paper  = Integer.parseInt(Student.sc.nextLine().trim());
            System.out.print("    No. of Patents : ");
            this.patent = Integer.parseInt(Student.sc.nextLine().trim());
        }

        public void printPublications() {
            System.out.println("    Books          : " + book);
            System.out.println("    Papers         : " + paper);
            System.out.println("    Patents        : " + patent);
        }

        // Getters & Setters
        public int getBook()          { return book; }
        public void setBook(int b)    { this.book = b; }
        public int getPaper()         { return paper; }
        public void setPaper(int p)   { this.paper = p; }
        public int getPatent()        { return patent; }
        public void setPatent(int p)  { this.patent = p; }
    }

    // --- PG Fields ---
    private String resultPG;
    private Publications publications;

    public PG() {
        super();
        this.publications = new Publications();
    }

    @Override
    public void readData() {
        super.readData();
        System.out.print("  Enter PG Result  : ");
        this.resultPG = sc.nextLine().trim();
        System.out.println("  Publications --");
        publications.readPublications();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("  PG Result        : " + resultPG);
        System.out.println("  Publications --");
        publications.printPublications();
    }

    // --- Getters & Setters ---
    public String getResultPG()               { return resultPG; }
    public void setResultPG(String r)         { this.resultPG = r; }
    public Publications getPublications()     { return publications; }
    public void setPublications(Publications p){ this.publications = p; }
}
