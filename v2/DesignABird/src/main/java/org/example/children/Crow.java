package org.example.children;

import org.example.interfaces.*;
import org.example.parent.*;

public class Crow extends Bird implements Flyable, Eater
{
    public void fly() {
        CrowOwlFlyingBehavior fb = new CrowOwlFlyingBehavior();
        fb.makeFly();
    }

    public void eat() {
        System.out.println("Crow eats");
    }
}
