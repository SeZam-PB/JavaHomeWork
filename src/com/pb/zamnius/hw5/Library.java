package com.pb.zamnius.hw5;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.setKniga("Приключения");
        b1.setAvtor("Иванов И.И.");
        b1.setYear("2000");

        b2.setKniga("Словарь");
        b2.setAvtor("Сидоров А.В.");
        b2.setYear("1980");

        b3.setKniga("Энциклопедия");
        b3.setAvtor("Гусев К.В");
        b3.setYear("2010");

        System.out.println("Данные по книгам:");
        System.out.println(b1.InfoB());
        System.out.println(b2.InfoB());
        System.out.println(b3.InfoB());

        Reader r1 = new Reader();
        r1.setPib("Петров В.В.");
        r1.setBilet("120-555");
        r1.setFak("Джава-програмирования");
        r1.setData("01.01.2001");
        r1.setTel("+380501118855");

        System.out.println("Данные по читателю:");
        System.out.println(r1.InfoR());

        int takeBook;
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите сколько книг взял Петров В.В.: ");
        takeBook = scan.nextInt();
        if (takeBook>=1 && takeBook<=3){
        System.out.println( "[" +r1.InfoR()+"] взял " +takeBook+ " книг");
        if (takeBook == 1){
            System.out.println(r1.Person()+" взял книгу " +b1.Books());
            System.out.println(r1.Person()+" взял книгу " +b1.InfoB());
        }
        if (takeBook == 2) {
            System.out.println(r1.Person() + " взял книги: ' " + b1.Books()+ " ' и ' " +b2.Books()+ " ' ");
            System.out.println(r1.Person() + " взял " + b1.InfoB()+ " ' и ' " +b2.InfoB());
        }
        if (takeBook == 3) {
            System.out.println(r1.Person() + " взял книги: ' " + b1.Books()+ " ' и ' " +b2.Books()+ " ' и ' " +b3.Books()+ " ' ");
            System.out.println(r1.Person() + " взял " + b1.InfoB()+ " и " +b2.InfoB()+ " и " +b3.InfoB());
            }
        }
        else {
            System.out.println("Столько книг нет в библиотеке");
        }

        int returnBook;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Укажите сколько книг вернул Петров В.В.: ");
        returnBook = scan1.nextInt();
        if (returnBook>=1 && returnBook<=3){
            System.out.println( "[" +r1.InfoR()+"] вернул " +returnBook+ " книг");
            if (returnBook == 1){
                System.out.println(r1.Person()+" вернул книгу " +b1.Books());
                System.out.println(r1.Person()+" вернул " +b1.InfoB());
            }
            if (returnBook == 2) {
                System.out.println(r1.Person() + " вернул книги: ' " + b1.Books()+ " ' и ' " +b2.Books()+ " ' ");
                System.out.println(r1.Person() + " вернул " + b1.InfoB()+ " и " +b2.InfoB());
            }
            if (returnBook == 3) {
                System.out.println(r1.Person() + " вернул книги: ' " + b1.Books()+ " ' и ' " +b2.Books()+ " ' и ' " +b3.Books()+ " ' ");
                System.out.println(r1.Person() + " вернул " + b1.InfoB()+ " и " +b2.InfoB()+ " и " +b3.InfoB());
            }
        }
        else {
            System.out.println("У " +r1.Person()+ " не может быть столько книг");
        }
    }
}
