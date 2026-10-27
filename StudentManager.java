package objects_classes.student_manager_v6_1;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This creates a collection that can hold multiple student object.
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Student Management System!");


        System.out.print("How many students do you want to register? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

// This repeats the registration process for the number of students entered by the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            Student student = getStudent(scanner);

            Student.add(student);
        }
        // This displays every registered student.
        System.out.println("===== REGISTERED STUDENTS =====");
        for (Student student : students) {
            info(student);
        }
        System.out.println();
    }


    public static objects_classes.student_manager_v6_1.Student getStudent(Scanner scanner) {

        System.out.print("Mat Number: ");
        int matNumber = scanner.nextInt();

        // Clear the input stream
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("School: ");
        String school = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Mark: ");
        double mark = scanner.nextDouble();

        return new Student(matNumber, name, school, age, mark);
    }

    public static void info(Student student) {
        System.out.printf("Student(matNumber=%d, name=%s, school=%s, age=%d, mark=%.1f)",
                student.matNumber,
                student.name,
                student.school,
                student.age,
                student.mark
        );

    }
}





