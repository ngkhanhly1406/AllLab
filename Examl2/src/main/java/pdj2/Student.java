package pdj2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String studentID;
    String name;
    String address;
    String phone;

    Student(String studentID, String name, String address, String phone) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-20s %-12s", studentID, name, address, phone);
    }
}



