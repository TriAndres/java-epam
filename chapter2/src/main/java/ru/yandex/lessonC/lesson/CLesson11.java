package ru.yandex.lessonC.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class CLesson11 extends CLesson {
    @Override
    public void game() {
        System.out.println(" ");

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new CLesson11().game();
    }
}