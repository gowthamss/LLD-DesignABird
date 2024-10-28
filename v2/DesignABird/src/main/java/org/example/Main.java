package org.example;

import org.example.children.*;
import org.example.interfaces.*;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
            In v1, we created interfaces and made the birds which can fly and eat implement them and not others.

            Problem statement: What if one or more birds fly in the same manner? Then we are duplicating the behavior of fly.

            For example, if Crow-Owl are flying in same manner and Sparrow-Parrot are flying in same manner, it violates DRY.
            What we can do is to extract out the behavior and create two new classes. One for Crow-Owl and another for Sparrow-Parrot.

            Possible solution: We implemented two new classes CrowOwlFlyingBehavior and SparrowParrotFlyingBehavior,
            which are then used by respective child classes to call common behavior.

            The individual birds still implement Flyable because they fly.
        */
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