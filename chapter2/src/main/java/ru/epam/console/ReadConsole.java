package ru.epam.console;

import java.util.Scanner;

public class ReadConsole {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.next();
    }

    public static int getInteger() {
        int a;
        while (true) {
           if (scanner.hasNextInt())  {
               a = scanner.nextInt();
               break;
           } else {
               scanner.nextLine();
           }
        }
        return a;
    }
}