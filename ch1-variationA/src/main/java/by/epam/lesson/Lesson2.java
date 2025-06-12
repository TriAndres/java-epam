package by.epam.lesson;

import static by.epam.controller.Controller.consoleService;

public class Lesson2 extends Lesson {
    @Override
    public void game() {
        System.out.println("Отобразить в окне консоли " +
                "аргументы командной строки в обратном порядке. ");
        System.out.println("Введите аргумент:");
        StringBuilder argument = new StringBuilder();
        argument.append(consoleService().getString());

        System.out.println("Ввели:\n" + argument);

        System.out.println("В обратном порядке:\n" + argument.reverse());
    }
}