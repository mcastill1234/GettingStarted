package com.examples;

public class loops {
    public static void main (String[] arguments) {
        int i = 0;
        while (i < 3) {
            System.out.println("Rule #" + i);
            i = i+1;
        }

        for (i=0; i<3; i=i+1) {
            System.out.println("Rule #" + i);
        }
    }
}
