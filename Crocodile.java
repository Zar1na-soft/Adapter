package com.company;

public class Crocodile  implements Zoo{
    @Override
    public void feed() {
        System.out.println("Feeding crocodile");
    }

    @Override
    public void brush_teeth() {
        System.out.println("Brush teeth");
    }

    @Override
    public void cleaning() {
        System.out.println("Cleaning up behind ");

    }
}
