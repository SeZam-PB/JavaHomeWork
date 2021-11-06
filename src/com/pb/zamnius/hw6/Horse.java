package com.pb.zamnius.hw6;


public class Horse extends Animal {

    public Horse() {
        super("Кінь");
    }
    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорить ІГОГО!");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " їсть сіно");
    }
    @Override
    public void live() {
        System.out.println(getName()+ " живе в хліву");
    }
}
