package com.pb.zamnius.hw6;


public class Horse extends Animal {

    public Horse() {
        super("Кінь", "сіно", "хлів");
    }
    @Override
    public void makeNoise() {
        System.out.println(getName() + " говорить ІГОГО!");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " їсть " +getFood());
    }
    @Override
    public void live() {
        System.out.println(getName()+ " живе " +getLocation());
    }
}
