package org.example.children;

import org.example.interfaces.*;
import org.example.parent.Bird;

public class Crow extends Bird implements Flyable, Eater
{
    public void fly() {
        System.out.println("Crow flies");
    }

    public void eat() {
        System.out.println("Crow eats");
    }
}
