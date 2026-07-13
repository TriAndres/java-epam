package ru.yandex.lessonA.lesson;


import java.util.Arrays;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class ALesson1 extends ALesson {
    @Override
    public void game() {
        System.out.println("1 Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        Arrays.sort(array);

        int length = 0;
        int min = array[length];
        int minLength = String.valueOf(min).length();
        System.out.println("\n\nСамое короткое число=" + min + " длина=" + minLength);

        length = array.length - 1;
        int max = array[length];
        int maxLength = String.valueOf(max).length();
        if (minLength < maxLength) {
            System.out.println("\nСамое длинное число=" + max + " длина=" + maxLength);
        } else {
            System.out.println("\nЦифры одинаковой длины.");
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new ALesson1().game();
    }
}