public class Student {

    // These fields are shared by every student
    private final String name;
    private final int studentId;
    private double grade;

    // Static counter — belongs to the CLASS, counts all students created
    private static int totalStudents = 0;

    // Constructor — runs when we do "new Student(...)"
    public Student(String name, int studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        totalStudents++;                // Every time a student is created, add 1
    }

    // Getters — allows other classes to READ private fields
    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public double getGrade() { return grade; }

    // Static method — called on the CLASS not an object
    public static int getTotalStudents() { return totalStudents; }

    // This method will be OVERRIDDEN by child classes
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Grade: " + grade);
    }
}