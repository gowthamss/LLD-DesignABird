package org.example.children;

import org.example.interfaces.*;
import org.example.parent.Bird;

public class Crow extends Bird implements Flyable, Eater
{
    public Crow() {}
    FlyingBehavior fb;
    public Crow(FlyingBehavior fb) {
        this.fb = fb;
    }
    public void fly() {
        this.fb.makeFly();
    }

    public void eat() {
        System.out.println("Crow eats");
    }
}
