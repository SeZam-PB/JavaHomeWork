package com.pb.zamnius.hw6;

import java.awt.*;

public class Animal {
    private String food;
    private String location;
    private String name;


    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void sleep() {
        System.out.println(name + " зараз спить");
    }
    public void eat(){
        System.out.println("food");
    }
    public void makeNoise() {
        System.out.println("voice");
    }
    public void live() {
        System.out.println("location");
    }
}

