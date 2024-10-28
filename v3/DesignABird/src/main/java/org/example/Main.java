package org.example;

import org.example.children.*;
import org.example.interfaces.*;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
            In v2, we created two classes to extract out the common behavior.
            But as per DI(dependency inversion), no two classes should **directly** dependent on each other as the Crow-Owl classes depend on CrowOwlFlyingBehavior
            and Sparrow-Parrot depends on SparrowParrotFlyingBehavior.

            Instead, they should depend on each other via an interface.

            For example, if someday Crow want to fly in same manner as Sparrow, then will have to
            make changes in the Crow class(instead of creating CrowOwlFlyingBehavior, we will have to modify it to
            SparrowParrotFlyingBehavior).

            Instead, create an interface on which both CrowOwlFlyingBehavior and SparrowParrotFlyingBehavior depend on and implement the common behavior.
         */

        // Get a list of all birds that can fly
        List<Flyable> flyingBirds = new ArrayList<>();
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
        List<Eater> eatingBirds = new ArrayList<>();
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