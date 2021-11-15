package com.pb.zamnius.hw7;

public class Description {
    private Size size;

    public Description(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void start() {
        System.out.println("Соответствие размеров начиная с размера " + size);
    }

}
