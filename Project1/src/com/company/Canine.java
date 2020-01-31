package com.company;

import java.util.Random;

// Canine Class
// Implements roam and eat methods used by all subclasses of Canine
class Canine extends Animal {
    // Constructor that sets the type name once the animal has been created
    public Canine() {
        type = "Canine";
    }
    public void roam(){
        System.out.println(name + " the " + species + "/" + type + " is chewing on a bone.");
    }
    public void eat(){
        System.out.println(name + " the " + species + "/" + type + " is eating " + type + " food.");
    }
}

// Wolf Class - Subclass of Canine
// Implements noise and wake methods
class Wolf extends Canine {
    public Wolf(String animal_name){
        name = animal_name;
        species = "Wolf";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " goes AWOOOOO!");
    }
    public void wake() {
        System.out.println(name + " the " + species + "/" + type + " jumps awake.");
    }
}

// Dog Class - Subclass of Canine
// Implements noise and wake methods
class Dog extends Canine {
    public Dog(String animal_name){
        name = animal_name;
        species = "Dog";
    }
    public void makeNoise() {
        // Creating phrase bank
        String[] phrases = {"bow wow!", "bark bark.", "woof!", "grrrrrr.", "treat please."};

        // Creating a random object and using it to get a random index in the range of the phrase bank size
        Random num = new Random();
        int index = num.nextInt(4);
        String phrase = phrases[index];
        System.out.println(name + " the " + species + "/" + type + " says " + phrase);
    }
    public void wake() {
        System.out.println(name + " the " + species + "/" + type + " pops up excitedly.");
    }
}