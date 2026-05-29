public class UndergraduateStudent extends Student {

    private String department; // unique to ug, which year they are
    private int yearLevel;

    // Constructor
    public UndergraduateStudent(
            String name,
            String id,
            double grade,
            String department,
            int yearLevel
    ) {
        super(name, id, grade);  // same as graduate
        this.department = department; // unique saves both extra fields
        this.yearLevel  = yearLevel;
    }

    // Getters and Setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYearLevel() { return yearLevel; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }
                   // it has 2 getters and setters because we have 2 extra fields

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();   // first, then adds "Department", "Year Level", and "Level : Undergraduate" — unique: three print lines instead of Graduate's two
        System.out.println("Department : " + department);
        System.out.println("Year Level : Year " + yearLevel);
        System.out.println("Level      : Undergraduate");
    }
}