package com.javacircle.overidden;

public class Main {
    public static void main(String[] args)
    {
        Parent parent = new Parent();
        parent.m2();
        parent.show();

        Parent child = new Child();
        child.m2();
        child.show();
        child.m3();
    }
}
