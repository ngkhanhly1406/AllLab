package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//RaceCar method extends Thread. Therefore, It is runnable.
//RaceCar method extends Thread. Therefore, It is runnable.
class RaceCar extends Thread {
    int finish;
    String name;

    RaceCar(int finish, String name) {
        this.finish = finish;
        this.name = name;
    }

    // Override run() method for racing logic
    public void run() {
        for (int i = 0; i < finish; i++) {
            System.out.println(name + ": " + (i + 1) + " running...");

            try {
                // sleep for a random amount of time. To get a random value,
                // java.util.Math.random() method is used.
                Thread.sleep(Math.round(Math.random() * 5000));
            } catch (Exception e) {
            }
        }

        System.out.println(name + " finished");
    }
}

public class Race {
    public static void main(String a[]) {
        // create an array of runnable RaceCar objects
        RaceCar[] cars = new RaceCar[5];
        cars[0] = new RaceCar(10, "Mario");
        cars[1] = new RaceCar(10, "Songoku");
        cars[2] = new RaceCar(10, "Herman");
        cars[3] = new RaceCar(10, "Doremon");
        cars[4] = new RaceCar(10, "Hoang Phi Hong");

        // start racing
        for (int i = 0; i < 5; i++)
            cars[i].start();
    }
}

