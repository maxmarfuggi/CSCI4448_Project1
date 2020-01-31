package com.company;

import java.util.List;

// Zookeeper Class
// Responsible for implementing the methods of the zookeeper tasks
// Has a private method that is an array of Animal objects, used for importing the animals once instantiated.
public class Zookeeper {
    private Animal[] zoo;

    // Constructor takes in the array of animals and sets the zoo array equal to it for reference
    public Zookeeper(Animal[] my_zoo){
        zoo = my_zoo;
    }

    // Method to wake the animals, loops through the array of animals and does the wake method on each one.
    public void wakeAnimals() {
        System.out.println("Waking the animals up...\n");
        for (int i = 0; i < zoo.length; i++){
            zoo[i].wake();
        }
        System.out.println();
    }

    // Method for the animal roll call, iterates through the array of animals and applies the makeNoise method on each one.
    public void rollCall() {
        System.out.println("Calling roll for all the animals...\n");
        for (int i = 0; i < zoo.length; i++){
          zoo[i].makeNoise();
        }
        System.out.println();
    }

    // Method for feed animals task, iterates through the array of animals and applies the eat method on each one.
    public void feedAnimals() {
        System.out.println("Feeding all the animals...\n");
        for (int i = 0; i < zoo.length; i++){
            zoo[i].eat();
        }
        System.out.println();
    }

    // Method for the exercise animals task, iterates through the array of animals and applies the roam method on each one.
    public void exerciseAnimals() {
        System.out.println("Letting the animals get their exercise...\n");
        for (int i = 0; i < zoo.length; i++){
            zoo[i].roam();
        }
        System.out.println();
    }

    // Method for the zoo shut down, iterates through the array of animals and applies the sleep method on each one.
    public void shutDown() {
        System.out.println("Shutting down the zoo for the day...\n");
        for (int i = 0; i < zoo.length; i++){
            zoo[i].sleep();
        }
        System.out.println();
        System.out.println("That's all, thanks for coming!");
    }
}
