package com.company;

import java.util.Random;

// Pachyderm Subclass
// Implements roam and eat methods that apply are used by the subclasses of Pachyderm
class Pachyderm extends Animal {
    // Constructor that sets the type name once the animal has been created
    public Pachyderm() {
        type = "Pachyderm";
    }
    public void roam(){
        System.out.println(name + " the " + species + "/" + type + " is playing in the water.");
    }
    public void eat(){
        System.out.println(name + " the " + species + "/" + type + " is eating " + type + " food.");
    }
}

// Hippo Class - Subclass of Pachyderm
// Implements noise and wake methods
class Hippo extends Pachyderm {
    // Constructor that sets the species name and animal name once the animal has been created
    public Hippo(String animal_name){
        name = animal_name;
        species = "Hippo";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " splashes out from the water.");
    }
    public void wake() {
        // Creating phrase bank
        String[] phrases = {" lets out a yawn.", " splashes in the water.", " asks for food immediately.", " ignores zookeeper and goes back to sleep without hesitation.", " does a nice long stretch in the sun."};

        // Creating a random object and using it to get a random index in the range of the phrase bank size
        Random num = new Random();
        int index = num.nextInt(4);
        String phrase = phrases[index];
        System.out.println(name + " the " + species + "/" + type + phrase);
    }
}

// Elephant Class - Subclass of Pachyderm
// Implements noise and wake methods
class Elephant extends Pachyderm {
    // Constructor that sets the species name and animal name once the animal has been created
    public Elephant(String animal_name){
        name = animal_name;
        species = "Elephant";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " says toooooooooot!");
    }
    public void wake() {
        System.out.println(name + " the " + species + "/" + type + " stretches their trunk.");
    }
}

// Rhino Class - Subclass of Pachyderm
// Implements noise and wake methods
 class Rhino extends Pachyderm {
    // Constructor that sets the species name and animal name once the animal has been created
    public Rhino(String animal_name){
         name = animal_name;
        species = "Rhino";
    }
    public void makeNoise() {
        System.out.println(name + " the " + species + "/" + type + " stomps their hooves.");
    }
    public void wake() {
         System.out.println(name + " the " + species + "/" + type + " rolls over and keeps sleeping because he's comfortable.");
    }
}
