package com.pb.zamnius.hw6;

import java.awt.*;

public class Animal {
    private String food;
    private String location;
    private String name;


    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
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

