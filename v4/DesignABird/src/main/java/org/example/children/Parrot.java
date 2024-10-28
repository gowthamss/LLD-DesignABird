package org.example.children;

import org.example.interfaces.*;
import org.example.parent.Bird;

public class Parrot extends Bird implements Flyable
{
    FlyingBehavior fb;

    public Parrot(FlyingBehavior fb) {
        this.fb = fb;
    }
    // Implementation of the methods declared in interface
    public void fly() {
        this.fb.makeFly();
    }
}
