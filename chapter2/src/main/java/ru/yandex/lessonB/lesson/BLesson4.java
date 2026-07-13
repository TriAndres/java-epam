package ru.yandex.lessonB.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class BLesson4 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n4 Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d\t", i);
            }
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson4().game();
    }
}