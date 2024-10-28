package org.example;

import org.example.children.*;
import org.example.interfaces.*;
import org.example.parent.*;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
            In v3, we made the two classes depend on an Interface(behavior) instead of directly depending on an Entity.

            But, we still need to make changes(creating objects) in individual classes, if for example Crow wants to fly like Sparrow, then
            we will have to replace 'new CrowOwlFlyingBehavior()' with 'new SparrowParrotFlyingBehavior()'.

            Dependency Injection says, don't even create an object of a dependency yourself. Instead, let the client pass the dependency
            to you.

            So, instead of you creating an object like 'new CrowOwlFlyingBehavior()', it will be passed as a dependency to you
            via constructor.
        */

        // Get a list of all birds that can fly
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Crow(new CrowOwlFlyingBehavior()));
        flyingBirds.add(new Owl(new CrowOwlFlyingBehavior()));
        flyingBirds.add(new Sparrow(new SparrowParrotFlyingBehavior()));
        flyingBirds.add(new Parrot(new SparrowParrotFlyingBehavior()));

        System.out.println("----- All Birds that can fly -----");
        for (Flyable f: flyingBirds) {
            f.fly();
        }

        // Get a list of all birds that can eat
        List<Eater> eatingBirds = new ArrayList<>();
        eatingBirds.add(new Crow());
        eatingBirds.add(new Sparrow());

        System.out.println("----- All Birds that can eat -----");
        for (Eater e: eatingBirds) {
            e.eat();
        }
    }
}