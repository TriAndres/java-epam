package by.epam.lesson;

import org.w3c.dom.ls.LSOutput;

import static by.epam.controller.Controller.consoleService;

public class Lesson1 extends Lesson{
    @Override
    public void game() {
        System.out.println("1. Приветствовать любого пользователя при " +
                "вводе его имени через командную строку.");
        System.out.println("Введите имя:");
        String name = consoleService().getString();
        System.out.println(name + ", вас приветствую!");
    }
}
