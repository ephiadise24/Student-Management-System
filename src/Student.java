public class Student {

    // Encapsulation
    private String name;
    private int id;
    private double grade;

    // Static member
    private static int totalStudents = 0;

    // Default constructor
    public Student() {

        this(
                "Unknown",
                0,
                0.0
        );
    }

    // Parameterized constructor
    public Student(
            String name,
            int id,
            double grade
    ) {

        this.name = name;
        this.id = id;
        this.grade = grade;

        totalStudents++;
    }

    // Getters
    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }

    public double getGrade() {

        return grade;
    }

    // Setters
    public void setName(String name) {

        this.name = name;
    }

    public void setGrade(double grade) {

        if (grade >= 0 & grade <= 100) {

            this.grade = grade;
        }
    }

    // Method to override
    public void displayInfo() {

        System.out.println("Student Name: " + name);

        System.out.println("Student ID: " + id);

        System.out.println("Grade: " + grade);
    }

    // Static method
    public static int getTotalStudents() {

        return totalStudents;
    }
}