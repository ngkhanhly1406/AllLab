package com.example.lab2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> counter.count());
        Thread thread2 = new Thread(() -> counter.downCount());
        Thread thread3 = new Thread(() -> counter.countdown());


        thread1.start();
        thread2.start();
        thread3.start();
    }
}

