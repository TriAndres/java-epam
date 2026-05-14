package ru.epam;

import ru.epam.lessonA.view.MenuA;
import ru.epam.lessonB.view.MenuB;

import static ru.epam.console.ReadConsole.getString;

public class Main {

    public static void main(String[] args) {
        new Main().game();
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
                1 - упражнения варианта А.
                2 - упражнения варианта B.
                0 - выход из программы.
                """);
        return getString();
    }

    private void select(String line) {
        switch (line) {
            case "1":
                new MenuA().game();
                break;
            case "2":
                new MenuB().game();
                break;
            case "0":
                System.out.println("выход из программы");
                break;
            default:
                System.out.println("Выбирите действие из списка");
        }
    }
}