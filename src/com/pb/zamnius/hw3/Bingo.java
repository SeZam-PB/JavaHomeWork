package com.pb.zamnius.hw3;
import java.util.Scanner;
import java.util.Random;
public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x, y;
        int z = 0;
        final int z_max = 100000000;
        while (z < z_max) {
            z++;
            System.out.println("Спроба " + z + ":");
            System.out.println("Уведіть ціле число більше 0 (Для виходу з гри введіть будь-яке відьємне число): ");
            x = scan.nextInt();
            y = rand.nextInt(101);
            do {
                while (x >= 0 && x < y) {
                    z++;
                    System.out.println("Спроба " + z + ":");
                    System.out.println("шукане число більше ніж задане ");
                    x = scan.nextInt();
                }
                while (x > y) {
                    z++;
                    System.out.println("Спроба " + z + ":");
                    System.out.println("шукане число менше ніж задане ");
                    x = scan.nextInt();
                }
            }
            while (x >= 0 && x < y || x > y);
            if (x == y)
                System.out.println("ВИ ВГАДАЛИ З " + z + " СПРОБИ ");
            System.out.println("ГРА ЗАКІНЧЕНА!!! ");
            break;
        }
    }
}





