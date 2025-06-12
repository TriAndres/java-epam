package by.epam.menu;

import by.epam.lesson.*;

import static by.epam.controller.Controller.consoleService;
import static by.epam.menu.Command.from;

public class LessonMenu extends Menu {
    @Override
    String menu() {
        System.out.println("\t\nВведите действие" +
                "\t\n1 - lesson1" +
                "\t\n2 - lesson2" +
                "\t\n3 - lesson3" +
                "\t\n4 - lesson4" +
                "\t\n5 - lesson5" +
                "\t\n6 - lesson6" +
                "\t\n7 - выход из программы"
        );
        return consoleService().getString();
    }

    @Override
    void select(String line) {
        switch (from(line)) {
            case COMMAND1:
                new Lesson1().game();
                break;
            case COMMAND2:
                new Lesson2().game();
                break;
            case COMMAND3:
                new Lesson3().game();
                break;
            case COMMAND4:
                new Lesson4().game();
                break;
            case COMMAND5:
                new Lesson5().game();
                break;
            case COMMAND6:
                new Lesson6().game();
                break;
            case COMMAND7:
                out();
                break;
            case NULL:
                System.out.println("Неизвестная команда.");
                break;
        }
    }

    @Override
    void out() {
        System.out.println("Выход из программы");
    }
}
