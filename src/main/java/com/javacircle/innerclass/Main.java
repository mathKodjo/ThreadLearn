package com.javacircle.innerclass;

public class Main {
    public static void main(String[] args) {

        // inner classs
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        // static class
        OuterClass.InnerStaticClass myStaticInner = new OuterClass.InnerStaticClass();
        System.out.println(myStaticInner.y);
    }
}
