import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        // Undergraduate student input
        System.out.print("Enter Undergraduate Student Name: ");
        String ugName = input.nextLine();

        UndergraduateStudent ug =
                new UndergraduateStudent(
                        ugName,
                        101,
                        88.5,
                        "Software Engineering"
                );

        // Graduate student input
        System.out.print("Enter Graduate Student Name: ");
        String gName = input.nextLine();

        GraduateStudent grad =
                new GraduateStudent(
                        gName,
                        202,
                        92.0,
                        "Object Oriented Programming"
                );

        // POLYMORPHISM (Upcasting)
        Student s1 = ug;
        Student s2 = grad;

        System.out.println("\n===== STUDENT DETAILS =====");

        s1.displayInfo();

        System.out.println();

        s2.displayInfo();

        // Static member
        System.out.println("\nTotal Students Evaluated: "
                + Student.getTotalStudents());

        // Course object
        Course course =
                new Course(
                        "Object Oriented Programming",
                        "Mr.Abel"
                );

        System.out.println("\n===== COURSE INFO =====");

        course.displayCourse();

        input.close();
    }
}
