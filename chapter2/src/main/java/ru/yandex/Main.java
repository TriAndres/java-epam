package ru.yandex;

import ru.yandex.lessonA.wiew.AMenu;
import ru.yandex.lessonB.wiew.BMenu;

import static ru.yandex.console.ReadConsole.getString;
import static ru.yandex.user.controller.UserController.getDefaultUser;

public class Main {
    public static void main(String[] args) {
        new Main().game();
    }

    public void game() {
        getDefaultUser().activationUser();
        String line = null;
        do {
            line = menu();
            select(line);
        } while (!line.equals("0"));
    }

    private String menu() {
        System.out.println("""
                \nВведите действие:
                1 - упражнения варианта А.
                2 - упражнения варианта B.
                3 - упражнения варианта C.
                0 - выход из программы.
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
                new AMenu().game();
                break;
            case "2":
                new BMenu().game();
                break;
            case "3":
                break;
            case "0":
                System.out.println("выход из программы");
                break;
            default:
                System.out.println("Выбирите действие из списка");
                break;
        }
    }
}