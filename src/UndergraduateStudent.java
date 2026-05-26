public class UndergraduateStudent extends Student {

    private String department;

    // Constructor
    public UndergraduateStudent(
            String name,
            int id,
            double grade,
            String department
    ) {

        super(name, id, grade);

        this.department = department;
    }

    // Method overriding
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Department: " + department);

        System.out.println("Level: Undergraduate");
    }
}