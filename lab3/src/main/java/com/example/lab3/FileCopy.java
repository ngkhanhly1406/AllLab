package com.example.lab3;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read from the source file
            FileReader fr = new FileReader("source.txt");
            BufferedReader br = new BufferedReader(fr);

            // Create a FileWriter to write to the destination file
            FileWriter fw = new FileWriter("destination.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // Read each line from the source file and write it to the destination file
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Close the streams
            br.close();
            bw.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
