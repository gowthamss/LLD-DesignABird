package org.example.children;

import org.example.interfaces.Flyable;
import org.example.parent.CrowOwlFlyingBehavior;

public class Owl implements Flyable
{
    public void fly() {
        CrowOwlFlyingBehavior fb = new CrowOwlFlyingBehavior();
        fb.makeFly();
    }
}
