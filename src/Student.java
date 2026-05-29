public class Student {

    // Private fields (Encapsulation)
    private String name;
    private String id;
    private double grade;

    // Static field to count total students
    private static int totalStudents = 0;

    // Constructor
    public Student(String name, String id, double grade) {
        this.name  = name;
        this.id    = id;
        this.grade = grade;
        totalStudents++;
    }

    // Getters
    public String getName()  { return name; }
    public String getId()    { return id; }
    public double getGrade() { return grade; }

    // Setters
    public void setName(String name)   { this.name  = name; }
    public void setId(String id)       { this.id    = id; }
    public void setGrade(double grade) { this.grade = grade; }

    // Static method to get total students
    public static int getTotalStudents() { return totalStudents; }

    // Base display method — subclasses call super.displayInfo()
    public void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Grade : " + grade);
    }
}