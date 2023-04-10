package com.example.lab3;

import java.io.File;

public class Dir {
    static void listPath(File path) {
        // get all files (or directories) in File path
        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println(files[i].toString());
            } else if (files[i].isDirectory()) {
                listPath(files[i]);
            }
        }
    }

    public static void main(String args[]) {
        listPath(new File("C:\\WINDOWS"));
    }
}
