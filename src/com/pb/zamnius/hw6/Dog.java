package com.pb.zamnius.hw6;

public class Dog extends Animal {

    public Dog() {
        super("Собака");}

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " говорить ГАВ!");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " їсть Педігрі");
    }
    @Override
    public void live() {
        System.out.println(getName()+ " живе в будці");
    }
}
