package com.pb.zamnius.hw6;

public class Cat extends Animal {



    public Cat() {
        super("Кіт");
    }

    @Override
    public void makeNoise(){
        System.out.println(getName()+ " говорить МЯУ!");}

        @Override
    public void eat() {
        System.out.println(getName()+ " їсть Віскас");
    }
    @Override
    public void live() {
        System.out.println(getName()+ " живе на горищі");
    }
}

