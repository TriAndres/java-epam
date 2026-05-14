package ru.epam.lessonA.lesson;

import static ru.epam.console.ReadConsole.getString;

public class LessonA1 extends LessonA{

    @Override
    public void game() {
        System.out.println("Введите своё имя:");
        String name = getString();
        System.out.println(name + " , приветствую Вас!\n");
    }

    public static void main(String[] args) {
        new LessonA1().game();
    }
}