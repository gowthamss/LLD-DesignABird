package org.example.children;

import org.example.interfaces.*;
import org.example.parent.*;

public class Parrot extends Bird implements Flyable
{
    // Implementation of the methods declared in interface
    public void fly() {
        FlyingBehavior fb = new SparrowParrotFlyingBehavior();
        fb.makeFly();
    }
}
