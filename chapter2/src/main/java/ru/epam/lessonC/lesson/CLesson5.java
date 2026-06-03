package ru.epam.lessonC.lesson;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class CLesson5 extends CLesson {
    @Override
    public void game() {
        System.out.println(" ");

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new CLesson5().game();
    }
}