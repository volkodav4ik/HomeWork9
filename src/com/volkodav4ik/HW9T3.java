package com.volkodav4ik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW9T3 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter some text: ");
        String text = null;
        text = SCANNER.nextLine();
        System.out.println("Please, enter file name for writing:");
        String fileName = SCANNER.next();
        for (int i = 0; i < fileName.length(); i++) {
            char tmp = fileName.charAt(i);
            if ((tmp < '0' || tmp > '9') && (tmp < 'a' || tmp > 'z') && (tmp < 'A' || tmp > 'Z') && tmp != '_') {
                System.out.println("Please, enter correct file name");
                System.exit(0);
            }
        }
        writeToFile(text, fileName);
    }

    private static void writeToFile(String text, String fileName) {
        fileName.trim();
        fileName = fileName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Something is wrong. Please, enter again.");
        }
    }
}
