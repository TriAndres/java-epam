package ru.epam.lessonA.lesson;

import static ru.epam.console.ReadConsole.getString;

public class LessonA2 extends LessonA{

    @Override
    public void game() {
        System.out.println("Введите аргумент:");
        String name = getString();
        System.out.println("В обратном прядке:");
        char[] nameArray = name.toCharArray();
        for (int i = nameArray.length; i > 0 ; i--) {
            System.out.print(nameArray[i-1] + " ");
        }
    }

    public static void main(String[] args) {
        new LessonA2().game();
    }
}