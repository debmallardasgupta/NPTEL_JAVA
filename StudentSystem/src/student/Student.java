package student;

import java.util.Scanner;

public class Student {

    private String name;
    private int rollNo;
    private String course;
    private String department;

    protected static final Scanner sc = new Scanner(System.in);

    public Student() {}

    public void readData() {
        System.out.print("  Enter Name       : ");
        this.name = sc.nextLine().trim();
        System.out.print("  Enter Roll No    : ");
        this.rollNo = Integer.parseInt(sc.nextLine().trim());
        System.out.print("  Enter Course     : ");
        this.course = sc.nextLine().trim();
        System.out.print("  Enter Department : ");
        this.department = sc.nextLine().trim();
    }

    public void printData() {
        System.out.println("  Name             : " + name);
        System.out.println("  Roll No          : " + rollNo);
        System.out.println("  Course           : " + course);
        System.out.println("  Department       : " + department);
    }

    // --- Getters & Setters ---
    public String getName()           { return name; }
    public void setName(String n)     { this.name = n; }

    public int getRollNo()            { return rollNo; }
    public void setRollNo(int r)      { this.rollNo = r; }

    public String getCourse()         { return course; }
    public void setCourse(String c)   { this.course = c; }

    public String getDepartment()     { return department; }
    public void setDepartment(String d){ this.department = d; }
}
