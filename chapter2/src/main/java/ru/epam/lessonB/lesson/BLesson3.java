package ru.epam.lessonB.lesson;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class BLesson3 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n3 Определить принадлежность некоторого значения " +
                "k интервалам (n, m], [n, m), (n, m), [n, m].");

        int n = 1;
        int m = 10;
        int k = 5;
        System.out.println("""
                n = 1
                m = 10
                k = 5
                """);

        if (k > n && k <= m) {
            System.out.println("k принадлежит интервалу (n, m]");
        }

        if (k >= n && k < m) {
            System.out.println("k принадлежит интервалу [n, m)");
        }

        if (k > n && k < m) {
            System.out.println("k принадлежит интервалу (n, m)");
        }

        if (k >= n && k <= m) {
            System.out.println("k принадлежит интервалу [n, m]");
        }


        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson3().game();
    }
}