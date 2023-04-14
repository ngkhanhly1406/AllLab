package Part4;
import java.io.*;
import java.util.*;

public class StudentManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Students");
            System.out.println("2. Update a Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Search Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    saveToFile();
                    break;
                case 7:
                    loadFromFile();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void loadFromFile() {

    }

    private static void saveToFile() {

    }

    private static void displayAllStudents() {

    }

    public static void addStudent() {
        System.out.println("Enter student details:");
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Mark: ");
        int mark = scanner.nextInt();

        Student student = new Student(rollNumber, name, age, mark);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public static void updateStudent() {
        System.out.print("Enter the Roll Number of the student to update: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Enter updated details:");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Mark: ");
                int mark = scanner.nextInt();

                student.setName(name);
                student.setAge(age);
                student.setMark(mark);

                System.out.println("Student updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter the Roll Number of the student to delete: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public static void searchStudent() {
        System.out.print("Enter the Roll Number of the student to search: ");
        int rollNumber = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println(student);


            }
        }
    }
}


