package com.company;

public class Main {


    public static void main(String[] args) {
    Crocodile croc = new Crocodile();
    Lion lion = new LionZoo();

    Lion adapt = new LionAdapt(croc);

    System.out.println("Crocodile ");
    croc.brush_teeth();
    croc.cleaning();
    croc.feed();

    System.out.println("Lion ");
    lion.feed();

    System.out.println("Lion Adapter ");
    adapt.feed();
    }
}
