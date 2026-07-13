package ru.yandex.lessonB.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class BLesson1 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n1 Вывести на экран таблицу умножения.");


        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", j, i, (j * i));
            }
            System.out.println();
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson1().game();
    }
}