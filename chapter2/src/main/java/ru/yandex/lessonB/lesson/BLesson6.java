package ru.yandex.lessonB.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class BLesson6 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n6 В системе счисления с некоторым основанием десятичное число 81 записывается " +
                "в виде 100. Найти это основание.");
        int num1 = 81;
        String num2 = "100";

        System.out.println("Вывод:");
        for (int i = 2; i < 36; i++) {
            int value = Integer.parseInt(num2,i);
            if (num1 == value) {
                System.out.println("Системе счисления: " + i);
            }
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson6().game();
    }
}