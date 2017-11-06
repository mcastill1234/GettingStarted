package com.examples;

public class Baby {
    String name;
    double weight = 5.0;
    boolean isMale;
    int numPoops = 0;
    Baby[] siblings;

    Baby(String myname, boolean maleBaby) {
        name = myname;
        isMale = maleBaby;
    }

    void sayHi() {
        System.out.println("Hi, my name is... " + name);
    }

    void eat(double foodWeight) {
        if (foodWeight >= 0 && foodWeight < weight) {
            weight = weight + foodWeight;
        }
    }

    public static void main(String[] arguments) {
        Baby ourBaby = new Baby("Gaby", false);
        ourBaby.sayHi();
        ourBaby.eat(1);
        System.out.println(ourBaby.weight);
    }
}
