package ru.yandex.lessonA.lesson;

import java.util.Random;

import static ru.yandex.console.ReadConsole.getInteger;

public class LessonA3 extends LessonA{

    /*
    3 Вывести заданное количество случайных чисел с переходом и без перехода
     на новую строку.
     */
    @Override
    public void game() {
        System.out.println("Введите количество цифр:");
        int num = getInteger();

        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }

        System.out.println("Без перехода на новую строку:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nC переходом на новую строку:");
        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        new LessonA3().game();
    }
}