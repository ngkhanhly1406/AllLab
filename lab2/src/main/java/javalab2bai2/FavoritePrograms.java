package javalab2bai2;
import java.io.IOException;
import java.util.Scanner;

public class FavoritePrograms {
        private static final String[] PROGRAMS = {"notepad.exe", "mspaint.exe", "winword.exe ", "excel.exe", "calc.exe", "iexplore.exe", "explorer.exe"};

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("RUN MY FAVORITE PROGRAMS\n");
                System.out.println("1. Notepad");
                System.out.println("2. Paint");
                System.out.println("3. Microsoft Word");
                System.out.println("4. Microsoft Excel");
                System.out.println("5. Calculator");
                System.out.println("6. Internet Explorer");
                System.out.println("7. Windows Explorer");
                System.out.println("8. Exit\n");
                System.out.print("Run: ");
                String input = scanner.nextLine();
                try {
                    int choice = Integer.parseInt(input);
                    if (choice >= 1 && choice <= PROGRAMS.length) {
                        Runtime.getRuntime().exec(PROGRAMS[choice - 1]);
                    } else if (choice == PROGRAMS.length + 1) {
                        running = false;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice. Please enter a number.");
                } catch (IOException e) {
                    System.out.println("Error running program: " + e.getMessage());
                }
                System.out.println();
            }
        }
    }


