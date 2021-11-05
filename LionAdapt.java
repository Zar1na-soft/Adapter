package com.company;

public class LionAdapt  implements Lion{
    Zoo zoo;
    public LionAdapt(Zoo zoo){
        this.zoo = zoo;
    }
    @Override
    public void feed() {
        zoo.brush_teeth();
    }
}
