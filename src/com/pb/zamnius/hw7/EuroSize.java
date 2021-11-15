package com.pb.zamnius.hw7;

public class EuroSize {
    private Size size;

    public EuroSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void start() {
        System.out.println("Соответствие европейским размерам начиная с размера " + size);
    }
}
