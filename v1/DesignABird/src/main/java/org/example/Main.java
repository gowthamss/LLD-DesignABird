package org.example;

import org.example.children.*;
import org.example.interfaces.*;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
            Use case1: Each bird flies in its own manner
        */
        // Get a list of all birds that can fly
        List<Flyable> flyingBirds = new ArrayList<Flyable>();
        flyingBirds.add(new Crow());
        flyingBirds.add(new Owl());
        flyingBirds.add(new Sparrow());
        flyingBirds.add(new Parrot());

        // If I try to add a Penguin, I get compile time error indicating that Penguin is not of type Flyable since it doesn't implement it
        // flyingBirds.add(new Penguin());

        System.out.println("----- All Birds that can fly -----");
        for (Flyable f: flyingBirds) {
            f.fly();
        }

        // Get a list of all birds that can eat
        List<Eater> eatingBirds = new ArrayList<Eater>();
        eatingBirds.add(new Crow());
        eatingBirds.add(new Sparrow());

        // If I try to add any other bird, the compiler throws error indicating they are not type of Eater
        // eatingBirds.add(new Owl());
        // eatingBirds.add(new Parrot());

        System.out.println("----- All Birds that can eat -----");
        for (Eater e: eatingBirds) {
            e.eat();
        }
    }
}