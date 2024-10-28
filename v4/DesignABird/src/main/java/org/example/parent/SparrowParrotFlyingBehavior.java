package org.example.parent;

import org.example.interfaces.FlyingBehavior;

public class SparrowParrotFlyingBehavior implements FlyingBehavior
{
    public void makeFly() {
        System.out.println("Sparrow and Parrot fly in same manner");
    }
}
