package com.example.lab3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        int shift = 3; // the number of characters to shift each character by

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.isLetter(c)) {
                    c = (c - 'a' + shift) % 26 + 'a';
                }
                writer.write(c);
            }
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
}

