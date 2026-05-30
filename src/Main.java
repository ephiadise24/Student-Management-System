import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("============================================");
        System.out.println("   Welcome to the Student Management System ");
        System.out.println("============================================");

        // Ask student type
        System.out.print("\nAre you an undergraduate or graduate student? (u/g): ");
        String type = input.nextLine().trim().toLowerCase();

        // Ask name
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // Ask ID number (4 digits only)
        System.out.print("Enter your 4-digit ID number:");
        String idNumber = input.nextLine().trim();

        // Ask year
        System.out.print("Enter your enrollment year:");
        String year = input.nextLine().trim();

        // Ask department
        System.out.println("Select your department:");
        System.out.println("  1 - Software Engineering");
        System.out.println("  2 - Information Technology");
        System.out.print("Enter choice (1 or 2): ");
        String deptChoice = input.nextLine().trim();

        String department;
        if (deptChoice.equals("1")) {
            department = "Software Engineering";
        } else if (deptChoice.equals("2")) {
            department = "Information Technology";
        } else {
            System.out.println("\nInvalid department choice. Defaulting to Software Engineering.");
            department = "Software Engineering";
        }

        // Randomly generate grade 0-100
        double grade = rand.nextInt(101);

        // Convert number grade to letter grade
        String letterGrade = "";
        if (grade >= 90)      letterGrade = "A";
        else if (grade >= 80) letterGrade = "B";
        else if (grade >= 70) letterGrade = "C";
        else if (grade >= 60) letterGrade = "D";
        else if (grade >= 50) letterGrade = "F";

        System.out.println("\nHello, " + name + "! Let's pull up your details...");

        if (type.equals("u")) {
            // Build undergraduate ID: BITS/UGR/1234/2023
            String studentId = "BITS/UGR/" + idNumber + "/" + year;

            UndergraduateStudent ug = new UndergraduateStudent(name, studentId, grade, department, 1);
            System.out.println("\n===== YOUR STUDENT DETAILS =====");
            ug.displayInfo();
            System.out.println("Your Letter Grade : " + letterGrade);
            System.out.println("\nTotal Students Registered So Far: " + Student.getTotalStudents());

        } else if (type.equals("g")) {
            // Build graduate ID: BITS/GRAD/1234/2023
            String studentId = "BITS/GRAD/" + idNumber + "/" + year;

            GraduateStudent grad = new GraduateStudent(name, studentId, grade, department);
            System.out.println("\n===== YOUR STUDENT DETAILS =====");
            grad.displayInfo();
            System.out.println("Your Letter Grade : " + letterGrade);
            System.out.println("\nTotal Students Registered So Far: " + Student.getTotalStudents());

        } else {
            System.out.println("\nOops! That wasn't a valid option. Please enter 'u' for undergraduate or 'g' for graduate.");
        }

        Course course = new Course("Object Oriented Programming", "Mr. Habtamu");
        System.out.println("\n===== YOUR COURSE INFORMATION =====");
        course.displayCourse();

        System.out.println("\nThank you for using the Student Management System. Goodbye, " + name + "!");

        input.close();
    }
}      // testing pipeline