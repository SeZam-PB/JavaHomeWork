package com.pb.zamnius.hw6;

public class Cat extends Animal {



    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise(){
        System.out.println(getName()+ " говорить МЯУ!");}

    //    @Override
   // public void eat() {
     //   System.out.println(getName()+ " їсть " +getFood());
    //}
    //@Override
    //public void live() {
      //  System.out.println(getName()+ " живе " +getLocation());
    //}
}

