public class Course {

    private String courseName; // unique course has nothing to do with students it only stores course info

    private String instructor; // unique course has nothing to do with students it only stores course info


    // Constructor
    public Course( // set both fields
            String courseName,
            String instructor
    ) {

        this.courseName = courseName;

        this.instructor = instructor;
    }

    // Method
    public void displayCourse() { // this one is unique because it prints course name and instructor

        System.out.println("Course: "
                + courseName);

        System.out.println("Instructor: "
                + instructor);
    }
}