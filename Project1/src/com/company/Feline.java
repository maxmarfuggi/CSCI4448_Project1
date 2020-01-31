package com.company;
import java.util.Random;

// Feline Subclass
// Implements roam and eat methods used by all subclasses of feline
class Feline extends Animal {
    // Constructor that sets the type name once the animal has been created
    public Feline() {
        type = "Feline";
    }
    public void roam(){
        System.out.println(name + " the " + species + "/" + type + " sneakily prowling around.");
    }
    public void eat(){
        System.out.println(name + " the " + species + "/" + type + " is eating food.");
    }
}

// Tiger Class - Subclass of Feline
// Implements noise and wake methods
class Tiger extends Feline {
    // Constructor that sets the species name and animal name once the animal has been created
    public Tiger(String animal_name){
        name = animal_name;
        species = "Tiger";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " lets out a roar!");
    }
    public void wake() {
        System.out.println(name + " the " + species + "/" + type + " goes back to sleep.");
    }
}

// Lion Class - Subclass of Feline
// Implements noise and wake methods
class Lion extends Feline {
    // Constructor that sets the species name and animal name once the animal has been created
    public Lion(String animal_name){
        name = animal_name;
        species = "Lion";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " growls and shakes their mane!");
    }
    public void wake() {
        System.out.println(name + " the " + species + "/" + type + " says roar!");
    }
}

// Cat Class - Subclass of Feline
// Implements noise and wake methods
// Wake method implements random number generator to select a random phrase each time the wake
// method is called.
class Cat extends Feline {
    // Constructor that sets the species name and animal name once the animal has been created
    public Cat(String animal_name){
        name = animal_name;
        species = "Cat";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " says meow!");
    }
    public void wake() {
        // Creating phrase bank
        String[] phrases = {"hiss!", "MEOOOOWW! HISSS! *scratch*", "nothing and continues sleeping.", "nothing but gives an evil scowl.", "purrrrrrr."};

        // Creating a random object and using it to get a random index in the range of the phrase bank size
        Random num = new Random();
        int index = num.nextInt(4);
        String phrase = phrases[index];

        // Outputting name and species with random phrase
        System.out.println(name + " the " + species + "/" + type + " says " + phrase);
    }
}
