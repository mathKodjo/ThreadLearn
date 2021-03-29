package com.javacircle.threadExtents;



public class CarMaker extends Thread {

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
