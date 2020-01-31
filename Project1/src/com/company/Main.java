package com.company;

// Max Marfuggi
// CSCI 4448
// Project 1 - Q4
// Team: Solo

// Main File, Runs the zoo program
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to the Object-Oriented Zoo!");
        System.out.println("The Zookeeper will now start the day!\n");

        // Creating Felines
        Animal test1 = new Cat("Caroline");
        Animal test2 = new Cat("Carl");
        Animal test5 = new Tiger("Tony");
        Animal test6 = new Tiger("Teemu");
        Animal test7 = new Lion("Larry");
        Animal test8 = new Lion("Lorraine");

        // Creating Canines
        Animal test3 = new Dog("Danny");
        Animal test4 = new Dog("Dre");
        Animal test9 = new Wolf("Warren");
        Animal test10 = new Wolf("Wilma");

        // Creating Pachyderms
        Animal test11 = new Hippo("Henrietta");
        Animal test12 = new Hippo("Harry");
        Animal test13 = new Elephant("Ella");
        Animal test14 = new Elephant("Emilio");
        Animal test15 = new Rhino("Roland");
        Animal test16 = new Rhino("Randy");

        // Creating array of Animals, and loading created animals into the array
        Animal zoo[] = new Animal[16];
        zoo[0] = test1;
        zoo[1] = test2;
        zoo[2] = test3;
        zoo[3] = test4;
        zoo[4] = test5;
        zoo[5] = test6;
        zoo[6] = test7;
        zoo[7] = test8;
        zoo[8] = test9;
        zoo[9] = test10;
        zoo[10] = test11;
        zoo[11] = test12;
        zoo[12] = test13;
        zoo[13] = test14;
        zoo[14] = test15;
        zoo[15] = test16;

        // Creating a Zookeeper object and passing in the array of animals
        Zookeeper zooKeep = new Zookeeper(zoo);

        // Execute zookeeper responsibilities
        zooKeep.wakeAnimals();
        zooKeep.rollCall();
        zooKeep.feedAnimals();
        zooKeep.exerciseAnimals();
        zooKeep.shutDown();

    }
}





