package ru.epam.lessonB.lesson;

import java.util.Random;

import static ru.epam.console.ReadConsole.getInteger;

public abstract class LessonB {
    protected int[] array;

    public abstract void game();

    public int[] arr() {
        System.out.println("Введите количество цифр в массиве:");
        int count = getInteger();
        int to = 100;
        array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(to);
        }
        return array;
    }

    public void show(int ... a) {
        int count = 0;
        int to = 10;
        for (int i : a) {
            System.out.print(i + " ");
            ++count;
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }
    }


}
