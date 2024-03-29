package com.pb.zamnius.hw6;

import com.pb.zamnius.hw5.Book;

public class VetClinic {

    public static void main(String[] args) {
        Cat cat = new Cat("kicya", "smetana", "dvor");
        Cat cat1 = new Cat("barsik", "moloko", "dim");

        cat.sleep();

        Dog dog = new Dog();
        dog.sleep();

        Horse horse = new Horse();
        horse.sleep();

        System.out.println("---------------------------------------");

        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();

        System.out.println("---------------------------------------");

        Animal[] ans = new Animal[]{cat, cat1, dog, horse};
        for (Animal c : ans) {
            c.live();
        }

    }

}