package org.example.children;

import org.example.interfaces.*;
import org.example.parent.Bird;

public class Sparrow extends Bird implements Flyable, Eater
{
    public Sparrow() {}
    FlyingBehavior fb;

    public Sparrow(FlyingBehavior fb) {
        this.fb = fb;
    }
    // Implementation of the methods declared in interface
    public void fly() {
        this.fb.makeFly();
    }

    public void eat() {
        System.out.println("Sparrow eats");
    }
}
