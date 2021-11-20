package com.pb.zamnius.hw8;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Auth {
    public static void main(String[] args) {
       // String login;
       // String password;

      //  System.out.println("придумайте логин");
      //  Scanner log = new Scanner(System.in);
       // login = log.next();
      //  int len1 = login.length();

       // if (len1>20) {
        //    System.out.println("придумайте логин");
        //    login = log.next();}
        //    else

         //       System.out.println("придумайте пароль");

       // Scanner log1 = new Scanner(System.in);
      //  password = log1.next();
      //  int len2 = password.length();

      //  if (len2>20) {
       //     System.out.println("придумайте логин");
        //    login = log.next();}
      //  else
      //      System.out.println("ведите логин и пароль");
       FileInputStream file;
       String fileName = "test.txt";
        byte x;

        try {

            file = new FileInputStream(fileName);
            x = (byte) file.read();
            System.out.println("Данные: " + x);

        } catch (FileNotFoundException e2) {

            System.out.println("Блок e2");
            e2.printStackTrace();

        } catch (IOException e1) {

            System.out.println("Блок e1");
            e1.printStackTrace();
        }
    }
    }

