package org.example.children;

import org.example.interfaces.Flyable;
import org.example.parent.Bird;

public class Parrot extends Bird implements Flyable
{
    // Implementation of the methods declared in interface
    public void fly() {
        System.out.println("Parrot flies");
    }
}
