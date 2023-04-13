package bai2;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentProgram {
    private static final String FILENAME = "students.txt";

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Menu");
            System.out.println("-----------------------------");
            System.out.println("1. Add a list of student and save to File");
            System.out.println("2. Loading list of students from a file");
            System.out.println("3. Exit");
            System.out.println("Your choice:  ");

            try{
                int choice = Integer.parseInt(br.readLine());

                switch (choice){
                    case 1:
                        addStudentsToFile();
                        break;
                    case 2:
                        loadStudentsFromFile();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }

    private static void addStudentsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, true))) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Enter name (or 'q' to quit): ");
                String name = br.readLine();

                if (name.equals("q")) {
                    break;
                }

                System.out.print("Enter age: ");
                int age = Integer.parseInt(br.readLine());

                System.out.print("Enter mark: ");
                double mark = Double.parseDouble(br.readLine());

                Student student = new Student(name, age, mark);
                bw.write(student.toString());
                bw.newLine();
            }

            System.out.println("Students added to file.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error writing to file.");
        }
    }

    private static void loadStudentsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split("\t");

                String name = fields[0];
                int age = Integer.parseInt(fields[1]);
                double mark = Double.parseDouble(fields[2]);

                Student student = new Student(name, age, mark);
                System.out.println(student);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading from file.");
        }
    }
}
