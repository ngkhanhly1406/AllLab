package com.example.lab3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return name + "\t" + age + "\t" + mark;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Add a list of Students and save to File");
            System.out.println("2. Loading list of Students from a File");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of students: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("Enter information for student #" + i + ":");
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Mark: ");
                        double mark = scanner.nextDouble();
                        scanner.nextLine();

                        Student student = new Student(name, age, mark);
                        students.add(student);
                    }

                    try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("students.txt"))) {
                        for (Student student : students) {
                            String line = student.toString() + "\n";
                            outputStream.write(line.getBytes());
                        }
                    } catch (IOException e) {
                        System.err.println("Error writing file: " + e.getMessage());
                    }

                    break;

                case 2:
                    try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("students.txt"))) {
                        students.clear();
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        String data;

                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            data = new String(buffer, 0, bytesRead);
                            String[] lines = data.split("\n");

                            for (String line : lines) {
                                String[] fields = line.split("\t");
                                String name = fields[0];
                                int age = Integer.parseInt(fields[1]);
                                double mark = Double.parseDouble(fields[2]);

                                Student student = new Student(name, age, mark);
                                students.add(student);
                            }
                        }

                        for (Student student : students) {
                            System.out.println(student);
                        }
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());

                    }
            }
        }
    }
}