public class UndergraduateStudent extends Student {

    private String department;
    private int yearLevel;

    // Constructor
    public UndergraduateStudent(
            String name,
            String id,
            double grade,
            String department,
            int yearLevel
    ) {
        super(name, id, grade);
        this.department = department;
        this.yearLevel  = yearLevel;
    }

    // Getters and Setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYearLevel() { return yearLevel; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department : " + department);
        System.out.println("Year Level : Year " + yearLevel);
        System.out.println("Level      : Undergraduate");
    }
}