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

    public static int getIntegerFroAndTo(int from, int to) {
        int a;
        while (true) {
            if (scanner.hasNextInt())  {
                a = scanner.nextInt();
                if (a >= from && a <= to) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
        }
        return a;
    }

    public static double getDouble() {
        double a;
        while (true) {
            if (scanner.hasNextDouble())  {
                a = scanner.nextDouble();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return a;
    }
}