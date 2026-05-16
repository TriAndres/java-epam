package ru.epam.lessonB.view;

import ru.epam.lessonA.controller.ControllerA;
import ru.epam.lessonB.controller.ControllerB;

import static ru.epam.console.ReadConsole.getString;

public class MenuB {
    private ControllerB controllerB;

    public MenuB() {
        controllerB = new ControllerB();
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
                10 - упражнение10
                11 - упражнение11
                0 - выход из меню B
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
                controllerB.lessonB1();
                break;
            case "2":
                controllerB.lessonB2();
                break;
            case "3":
                controllerB.lessonB3();
                break;
            case "4":
                controllerB.lessonB4();
                break;
            case "5":
                controllerB.lessonB5();
                break;
            case "6":
                controllerB.lessonB6();
                break;
            case "7":
                controllerB.lessonB7();
                break;
            case "8":
                controllerB.lessonB8();
                break;
            case "9":
                controllerB.lessonB9();
                break;
            case "10":
                controllerB.lessonB10();
                break;
            case "11":
                controllerB.lessonB11();
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
