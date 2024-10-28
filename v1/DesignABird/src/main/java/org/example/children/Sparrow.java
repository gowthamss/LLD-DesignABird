package org.example.children;

import org.example.interfaces.*;
import org.example.parent.Bird;

public class Sparrow extends Bird implements Flyable, Eater
{
    // Implementation of the methods declared in interface
    public void fly() {
        System.out.println("Sparrow flies");
    }

    public void eat() {
        System.out.println("Sparrow eats");
    }
}
