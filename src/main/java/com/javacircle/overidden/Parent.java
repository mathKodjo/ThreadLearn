package com.javacircle.overidden;

public class Parent {

    // Can't be overridden
     final void show() {
        System.out.println("From parent show can't be overridden");
    }

    // Static method in base class
    // which will be hidden in subclass
    static void m3()
    {
        System.out.println("From parent "
                + "static m3()");
    }

    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }


}
