package ru.yandex.lessonB.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class BLesson5 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n5 Сколько значащих нулей в двоичной записи числа 129?");

        int num = 129;

        String st = Integer.toBinaryString(num);
        int count = 0;
        for (char c : st.toCharArray()) {
            if (c == '0') {
                ++count;
            }
        }

        System.out.println(st + "=" + count);

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson5().game();
    }
}