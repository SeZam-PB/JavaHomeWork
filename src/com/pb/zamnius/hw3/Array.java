package com.pb.zamnius.hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Введіть значення елементу масиву[" + i + "] = ");
            array[i] = scan.nextInt();
        }

        System.out.println("ВАШ МАСИВ: ");
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сума чисел масиву: " + sum);

        int z=0;
        for(int x:array) {
                if (x>0) {
                    z++;
                }
            }
        System.out.println("Кількість елементів більше 0: " + z);

        boolean isSorted = false;
        int buf;
         while (!isSorted) {
                isSorted = true;
                for (int t = 0; t < 9; t++) {
                    if (array[t] > array[t + 1]) {
                        isSorted = false;
                        buf = array[t];
                        array[t] = array[t + 1];
                        array[t + 1] = buf;
                    }
                }
            }
            System.out.println("Відсортований масив в порядку збільшення:");
            System.out.println(Arrays.toString(array));
        }
    }


