package ru.epam.lessonC.lesson;

import java.util.Random;

import static ru.epam.console.ReadConsole.getInteger;

public abstract class CLesson {
    protected int[][] array;

    public abstract void game();

    public int[][] array() {
        int from = 0;
        int to = 10;
        System.out.println("Введите количество цифр в массиве:");
        int count = getInteger();
        array = new int[count][count];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = from + new Random().nextInt(2 * (to - from) + 1) - (to - from);
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    public void show(int[][] a) {
        System.out.println("\nВывод:");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
}