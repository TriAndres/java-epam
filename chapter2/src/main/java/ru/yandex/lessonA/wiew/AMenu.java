package ru.yandex.lessonA.wiew;

import ru.yandex.lessonA.controller.AController;

import static ru.yandex.console.ReadConsole.getString;

public class AMenu {
    private final AController aController;

    public AMenu() {
        aController = new AController();
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
                0 - выход из меню A
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
                aController.ALesson1();
                break;
            case "2":
                aController.ALesson2();
                break;
            case "3":
                aController.ALesson3();
                break;
            case "4":
                aController.ALesson4();
                break;
            case "5":
                aController.ALesson5();
                break;
            case "6":
                aController.ALesson6();
                break;
            case "7":
                aController.ALesson7();
                break;
            case "8":
                aController.ALesson8();
                break;
            case "9":
                aController.ALesson9();
                break;
            case "0":
                System.out.println("выход из меню A");
                break;
            default:
                System.out.println("Выбирите действие из списка");
                break;
        }
    }
}
