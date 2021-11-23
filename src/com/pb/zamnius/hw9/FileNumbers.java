package com.pb.zamnius.hw9;
import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {
    public static void main(String[] args) throws Exception {

    public static void createNumbersFile() {
            try (Writer writer = new FileWriter("C://Java/numbers.txt"))
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = ((int) (Math.random() * 99 + 1));
                    System.out.println(array[i][j] + " ");

                    writer.write(array[i][j] + " ");
                }
            } catch(
                    Exception e)

            {
                System.out.println("error with file write: " + e);

            }
        }
}