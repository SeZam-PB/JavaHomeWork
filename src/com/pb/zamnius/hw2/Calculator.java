package com.pb.zamnius.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Operand1, Operand2, dod, vid, mnoj, dil;
        String sign;
        System.out.println("Уведіть перше ціле число: ");
        Operand1 = scan.nextInt();
        System.out.println("Уведіть друге ціле число: ");
        Operand2 = scan.nextInt();
        System.out.println("Оберіть одну із дій: +, -, *, /: ");
        sign = scan.next();
        dod = Operand1 + Operand2;
        vid = Operand1 - Operand2;
        mnoj = Operand1 * Operand2;
        switch (sign) {
            case "+":
                System.out.print(dod);
                break;
            case "-":
                System.out.print(vid);
                break;
            case "*":
                System.out.print(mnoj);
                break;
            case "/":
                if (Operand2 == 0) {
                    System.out.print("ERROR: на нуль ділити не можна!");
                } else {
                    dil = Operand1 / Operand2;
                    System.out.print(dil);
                }
                break;
        }
    }
}
