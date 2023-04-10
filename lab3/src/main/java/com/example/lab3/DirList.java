package com.example.lab3;

import java.io.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList {
    public static void main(String[] args) {
        // Get the path of the directory from user input
        System.out.print("Enter the directory path: ");
        String dirPath = System.console().readLine();

        // Create a File object with the directory path
        File dir = new File(dirPath);

        // Check if the directory exists and is a directory
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        // Get the list of files and directories in the directory
        File[] files = dir.listFiles();

        // Print the header for the file list
        System.out.println("Directory of " + dirPath);
        System.out.println("");

        // Loop through the files and print their details
        for (File file : files) {
            // Get the file details
            String name = file.getName();
            String type = file.isDirectory() ? "<DIR>" : "<FILE>";
            long size = file.length();
            long lastModified = file.lastModified();

            // Format the date/time of the last modification
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
            String date = sdf.format(lastModified);

            // Print the file details
            System.out.printf("%-30s%-10s%15d %s%n", name, type, size, date);
        }
    }
}

