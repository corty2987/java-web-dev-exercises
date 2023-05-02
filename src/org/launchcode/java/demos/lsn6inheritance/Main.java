package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        HouseCat spike = new HouseCat("Spike");
        HouseCat jax = new HouseCat("Jax", 15);
        Cat suki = new HouseCat("Suki", 8);//polymorphism (storing an object of one type in a variable or field of another "compatible" type.
        ((HouseCat) suki).isSatisfied(); //only cast an object to another type when you are SURE that it's safe to do so

        System.out.println(garfield.isTired());
        System.out.println(garfield.isHungry());
        System.out.println(garfield.getFamily());
        System.out.println(spike.getWeight());
        System.out.println(garfield.getWeight());
        System.out.println(jax.getWeight());
        System.out.println(suki.noise());
    }
}
