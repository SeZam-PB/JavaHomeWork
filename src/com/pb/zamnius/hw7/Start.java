package com.pb.zamnius.hw7;

public class Start {
    public static void main(String[] args) {

        Size[] levels = Size.values();
        System.out.println("Размеры: ");
        for (Size level : levels) {
            System.out.println(level);
        }
        Description getDescription  = new Description(Size.XXS);
        getDescription.start();

        Size level = getDescription.getSize();
        switch (level) {
            case XXS:
                System.out.println("XXS - Детский размер");
            case XS:
                System.out.println("XS - Взрослый размер");
            case S:
                System.out.println("S - Взрослый размер");
            case M:
                System.out.println("M - Взрослый размер");
            case L:
                System.out.println("L - Взрослый размер");
                break;
        }
        EuroSize getEuroSize = new EuroSize(Size.XXS);
        getEuroSize.start();
        level = getEuroSize.getSize();
        switch (level) {
            case XXS:
                System.out.println("XXS - 32");
            case XS:
                System.out.println("XS - 34");
            case S:
                System.out.println("S - 36");
            case M:
                System.out.println("M - 38");
            case L:
                System.out.println("L - 40");
                break;
        }
    }
}