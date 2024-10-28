package org.example.parent;

import org.example.interfaces.FlyingBehavior;

public class CrowOwlFlyingBehavior implements FlyingBehavior
{
    public void makeFly() {
        System.out.println("Crow and Owl fly in the same manner");
    }
}
