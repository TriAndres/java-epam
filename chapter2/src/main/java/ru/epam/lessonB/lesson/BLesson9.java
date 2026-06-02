package ru.epam.lessonB.lesson;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class BLesson9 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n9 Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего " +
                "данному числу. Осуществить проверку корректности ввода чисел.");


        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson9().game();
    }
}