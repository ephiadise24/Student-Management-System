import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("============================================");
        System.out.println("   Welcome to the Student Management System ");
        System.out.println("============================================");

        System.out.print("\nAre you an undergraduate or graduate student? (u/g): ");
        String type = input.nextLine().trim().toLowerCase();

        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Randomly generate grade 0-100
        double grade = rand.nextInt(101);

        // Convert number grade to letter grade
        String letterGrade = "";
        if (grade >= 90)      letterGrade = "A";
        else if (grade >= 80) letterGrade = "B";
        else if (grade >= 70) letterGrade = "C";
        else if (grade >= 60) letterGrade = "D";
        else if (grade >= 50) letterGrade = "F";
        else if  (grade <=50) letterGrade = "NG";

        System.out.println("\nHello, " + name + "! Let's pull up your details...");

        if (type.equals("u")) {
            UndergraduateStudent ug = new UndergraduateStudent(name, 101, grade, "Software Engineering");
            Student s1 = ug;
            System.out.println("\n===== YOUR STUDENT DETAILS =====");
            s1.displayInfo();
            System.out.println("Your Letter Grade: " + letterGrade);
            System.out.println("\nTotal Students Registered So Far: " + Student.getTotalStudents());

        } else if (type.equals("g")) {
            GraduateStudent grad = new GraduateStudent(name, 202, grade, "Artificial Intelligence");
            Student s2 = grad;
            System.out.println("\n===== YOUR STUDENT DETAILS =====");
            s2.displayInfo();
            System.out.println("Your Letter Grade: " + letterGrade);
            System.out.println("\nTotal Students Registered So Far: " + Student.getTotalStudents());

        } else {
            System.out.println("\nOops That wasn't a valid option. Please enter 'u' for undergraduate or 'g' for graduate.");
        }

        Course course = new Course("Object Oriented Programming", "Mr. John");
        System.out.println("\n===== YOUR COURSE INFORMATION =====");
        course.displayCourse();

        System.out.println("\nThank you for using the Student Management System. Goodbye, " + name + "!");

        input.close();
    }
}