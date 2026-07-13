package ru.yandex.lessonA.view;

import ru.yandex.lessonA.controller.ControllerA;

import static ru.yandex.console.ReadConsole.getString;

public class MenuA {
    private ControllerA controllerA;

    public MenuA() {
        controllerA = new ControllerA();
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
                0 - выход из меню А
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
               controllerA.lessonA1();
               break;
            case "2":
                controllerA.lessonA2();
                break;
            case "3":
                controllerA.lessonA3();
                break;
            case "4":
                controllerA.lessonA4();
                break;
            case "5":
                controllerA.lessonA5();
                break;
            case "6":
                controllerA.lessonA6();
                break;
            case "0":
                System.out.println("выход из меню А");
                break;
            default:
                System.out.println("Выбирите действие из списка");
                break;
        }
    }
}
