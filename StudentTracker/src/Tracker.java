import java.util.Scanner;

public class Tracker
{

    public static void main(String[] args)
    {
        // Initialize students array
        Student[] students = new Student[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grades Tracker!");

        // Loop to create and populate student objects
        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter details for student " + (i +1) + ":");
            System.out.print("Name: ");
            String name =scanner.nextLine();
            System.out.print("Grade: ");
            double grade =scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name,grade);

        }

        for (Student student : students) {
            System.out.print(student.getDetails());
        }
    }
}



