package com.javacircle.threadImpl;

public class BikeMaker implements Runnable {

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
