public class Course {

    private String courseName;

    private String instructor;

    // Constructor
    public Course(
            String courseName,
            String instructor
    ) {

        this.courseName = courseName;

        this.instructor = instructor;
    }

    // Method
    public void displayCourse() {

        System.out.println("Course: "
                + courseName);

        System.out.println("Instructor: "
                + instructor);
    }
}