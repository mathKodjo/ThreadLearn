package com.javacircle.anonymous;

import org.w3c.dom.ls.LSOutput;

public class AnonymousClass {

    public static void main(String[] args) {
        new Age() {
            @Override
            public void getAge() {
                System.out.println("**********  Salem from Anonymous Inner Class ********");
            }
        }.getAge();
    }
}
