package com.pb.zamnius.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String c1 = scan1.nextLine();
        String c2 = scan2.nextLine();
        String c11 = c1.replaceAll("\\s", "");
        String c21 = c2.replaceAll("\\s", "");

        String c111 = c11.replaceAll("\\W+", "");
        String c211 = c21.replaceAll("\\W+", "");

        String c12 = c111.toLowerCase();
        String c22 = c211.toLowerCase();

            char[] chArr1 = "c12".toCharArray();
            char[] chArr2 = "c22".toCharArray();

      for(int i = chArr1.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            if( chArr1[j] > chArr1[j+1] ){
                 char tmp = chArr1[j];
              chArr1[j] = chArr1[j+1];
               chArr1[j+1] = tmp;
             }
        }
     }
       for(int i = chArr2.length-1 ; i > 0 ; i--){
         for(int j = 0 ; j < i ; j++){
           if( chArr2[j] > chArr2[j+1] ){
              char tmp = chArr2[j];
              chArr2[j] = chArr2[j+1];
              chArr2[j+1] = tmp;
         }
      }

      String valueOfchar1 = String.valueOf(chArr1);
       String valueOfchar2 = String.valueOf(chArr2);
       System.out.println( valueOfchar1 );
      System.out.println( valueOfchar2 );
       System.out.println(valueOfchar1.equalsIgnoreCase(valueOfchar2));
 }
    }
}



