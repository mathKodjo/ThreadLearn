package com.javacircle.breakcontinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        find();
    }

    static void find() {
        List<Integer> list = Arrays.asList(8, 8);

        for (int num : list) {
            int t = 0;
            if (num == 8) {
                System.out.println( t +"...." + num);
                continue;
            }
            System.out.println(" Try again ... .....");
        }
    }

    static void find1() {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
