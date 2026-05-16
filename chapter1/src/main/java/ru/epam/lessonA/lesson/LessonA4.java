package ru.epam.lessonA.lesson;

import static ru.epam.console.ReadConsole.getString;

public class LessonA4 extends LessonA{

    /*
    4 Ввести пароль из командной строки и сравнить его со строкой-образцом.
     */
    @Override
    public void game() {
        String password = "135";
        System.out.println("Введите пароль:");
        String line = getString();
        if (password.equals(line)) {
            System.out.println("Верно ввели ");
        } else {
            System.out.println("Не верный ввод пароля.");
        }
    }

    public static void main(String[] args) {
        new LessonA4().game();
    }
}