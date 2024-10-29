package com.pluralsight;

public class Cat extends Animal {
    private boolean indoorCat;

    public void noise() {
        System.out.println("Cat noise: Meow");
    }
    public void eat() {
        System.out.println("Munch");
    }
}
