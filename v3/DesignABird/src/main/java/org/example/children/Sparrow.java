package org.example.children;

import org.example.interfaces.*;
import org.example.parent.*;

public class Sparrow extends Bird implements Flyable, Eater
{
    // Implementation of the methods declared in interface
    public void fly() {
        FlyingBehavior fb = new SparrowParrotFlyingBehavior();
        fb.makeFly();
    }

    public void eat() {
        System.out.println("Sparrow eats");
    }
}
