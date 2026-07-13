package ru.yandex.lessonA.lesson;


import java.util.ArrayList;
import java.util.Arrays;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class ALesson7 extends ALesson {
    @Override
    public void game() {
        System.out.println("7 Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        array = arr(100, 999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        System.out.println("\nВывод:");
        Arrays.sort(array);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            String[] a = String.valueOf(i).split("");
            if ((!a[0].equals(a[1]) && !a[1].equals(a[2]) && !a[2].equals(a[0]))) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList.getLast());

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }

    }

    public static void main(String[] args) {
        new ALesson7().game();
    }
}