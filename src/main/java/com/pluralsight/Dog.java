package com.pluralsight;

public class Dog extends Animal {
    private int breed;

// if I also want to say "munch" - don't need this but since I add "Chomp"
// im overriding with a method
// takes no parameters
    public void noise() {
        System.out.println("Dog noise: Woof");
    }
// method overloading - needs a parameter so there's no duplicate
    public void noise(int numberOfTimes) {
        System.out.println("Bark 3 times: ");
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Woof");
        }
    }
    public void eat() {
        System.out.println("Chomp");
    }
}

