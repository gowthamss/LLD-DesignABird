package org.example.children;

import org.example.interfaces.*;

public class Owl implements Flyable
{
    FlyingBehavior fb;

    public Owl(FlyingBehavior fb) {
        this.fb = fb;
    }
    public void fly() {
        this.fb.makeFly();
    }
}
