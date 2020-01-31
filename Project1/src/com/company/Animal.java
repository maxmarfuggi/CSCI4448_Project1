package com.company;

// Animal Class
// Abstract because it is never instantiated
// All animals in this zoo go to sleep the same way, so I have implemented the sleep behavior in this tier.
abstract class Animal {
    // Name, species, and type for each animal in the zoo
    String name;
    String species;
    String type;

    // Method definitions for each of the animal actions
    public void wake() {}
    public void makeNoise(){}
    public void eat() {}
    public void roam(){}
    public void sleep() {
        System.out.println(name + " the " + species + "/" + type + " dozes off to sleep.");
    }
}