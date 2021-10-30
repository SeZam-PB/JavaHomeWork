package com.pb.zamnius.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static void procedure() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Текст: ");
            String s = scan.nextLine();
            StringBuilder sb = new StringBuilder(s.length());
            boolean a = false;
            for (char c : s.toCharArray()) {
                if (Character.isWhitespace(c))
                    a = false;
                else if (!a) {
                    c = Character.toUpperCase(c);
                    a = true;
                }
                sb.append(c);
            }
            System.out.println("Результат: " + sb.toString());
            break;
        }
    }
    public static void main(String[] args) {
        procedure();
    }
}
