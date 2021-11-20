package com.pb.zamnius.hw6;

public class Dog extends Animal {

    public Dog() {
        super("Собака", "м'ясо", "будка");}

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " говорить ГАВ!");
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
