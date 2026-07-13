package ru.yandex.lessonC.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class CLesson15 extends CLesson {
    @Override
    public void game() {
        System.out.println(" ");

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new CLesson15().game();
    }
}