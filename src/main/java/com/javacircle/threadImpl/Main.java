package com.javacircle.threadImpl;

public class Main {

    public static void main(String[] args) {
        BikeMaker bikeMaker = new BikeMaker();
        Thread thread = new Thread(bikeMaker);
        thread.start();
//        System.out.println("This code is outside of the thread");
    }
}
