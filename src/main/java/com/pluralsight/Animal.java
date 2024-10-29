package com.pluralsight;
import java.util.Random;
public class Animal {
    private String name;
    private String color;
    private String[] noises = {"Woof", "Meow", "Chirp", "Moo"};

   // public Animal(String name, String color) {
      //  this.name = name;
      // this.color = color;
  //  }

    public void noise() {
        Random random = new Random();
        int randomIndex = random.nextInt(noises.length);
        System.out.println("Random noise: " + noises[randomIndex]);
    }
    public void eat() {
        System.out.println("nom nom");
    }
}
