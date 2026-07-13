package ru.yandex.lessonB.lesson;

import java.util.Random;

import static ru.yandex.console.ReadConsole.getInteger;

public abstract class LessonB {
    protected int[] array;

    public abstract void game();

    public int[] arr(int from, int to) {
        System.out.println("Введите количество цифр в массиве:");
        int count = getInteger();
        array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + new Random().nextInt(to - from);
        }
        return array;
    }

    public void show(int ... a) {
        int count = 0;
        int to = 10;
        for (int i : a) {
            count++;
            System.out.printf("%d\t", i);
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }
    }


}
