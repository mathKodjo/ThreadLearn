package com.javacircle.lambda;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> { System.out.println("From inside thread");}).start();
        }
    }

