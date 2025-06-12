package by.epam.lesson;

import static by.epam.controller.Controller.consoleService;

public class Lesson4 extends Lesson {
    @Override
    public void game() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом. ");
        String sample = "password";

        System.out.println("Введите пароль:");
        String password = consoleService().getString();

        if (sample.equals(password)) {
            System.out.println("Ввели верно.");
        } else {
            System.out.println("повезёт в следующий раз.");
        }
    }
}