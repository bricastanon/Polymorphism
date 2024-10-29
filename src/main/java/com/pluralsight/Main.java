package com.pluralsight;

public class Main {
    public static void main(String[] args) {

// Polymorphism mean many forms bc method overriding
    Animal myAnimal = new Animal();
    myAnimal.noise();
    myAnimal.eat();

    Dog myDog = new Dog();
// overriding
    myDog.noise();
// overloading to say "Woof" 3 times
    myDog.noise(3);
    myDog.eat();


    Cat myCat = new Cat();
    myCat.noise();
    myCat.eat();




    }
}