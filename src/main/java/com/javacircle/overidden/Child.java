package com.javacircle.overidden;

public class Child  extends Parent{

    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
//    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }

    // Static method in base class
    // which will be hidden in subclass
    static void m3()
    {
        System.out.println("From child  "
                + "static m3()");
    }



}
