package org.example.children;

import org.example.interfaces.Flyable;
import org.example.parent.*;

public class Parrot extends Bird implements Flyable
{
    // Implementation of the methods declared in interface
    public void fly() {
        SparrowParrotFlyingBehavior fb = new SparrowParrotFlyingBehavior();
        fb.getToFly();
    }
}
