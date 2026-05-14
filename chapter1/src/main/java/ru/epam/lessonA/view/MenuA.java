package ru.epam.lessonA.view;

import ru.epam.lessonA.controller.ControllerA;

import static ru.epam.console.ReadConsole.getString;

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
                Введите действие:
                1 - упражнение1
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
                System.out.println("выход из меню А%n");
                break;
            default:
                System.out.println("Выбирите действие из списка%n");
        }
    }
}
