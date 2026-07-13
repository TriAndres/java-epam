package ru.yandex.lessonB.wiew;

import ru.yandex.lessonB.controller.BController;

import static ru.yandex.console.ReadConsole.getString;

public class BMenu {
    private final BController bController;

    public BMenu() {
        bController = new BController();
    }

    public void game() {
        String line = null;
        do {
            line = menu();
            select(line);
        } while (!line.equals("0"));
    }

    private String menu() {
        System.out.println("""
                \nВведите действие:
                1 - упражнение1
                2 - упражнение2
                3 - упражнение3
                4 - упражнение4
                5 - упражнение5
                6 - упражнение6
                7 - упражнение7
                8 - упражнение8
                9 - упражнение9
                0 - выход из меню B
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
                bController.BLesson1();
                break;
            case "2":
                bController.BLesson2();
                break;
            case "3":
                bController.BLesson3();
                break;
            case "4":
                bController.BLesson4();
                break;
            case "5":
                bController.BLesson5();
                break;
            case "6":
                bController.BLesson6();
                break;
            case "7":
                bController.BLesson7();
                break;
            case "8":
                bController.BLesson8();
                break;
            case "9":
                bController.BLesson9();
                break;
            case "0":
                System.out.println("выход из меню B");
                break;
            default:
                System.out.println("Выбирите действие из списка");
                break;
        }
    }
}