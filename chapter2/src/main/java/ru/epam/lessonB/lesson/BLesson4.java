package ru.epam.lessonB.lesson;

public class BLesson4 extends BLesson {
    @Override
    public void game() {
        System.out.println("4 Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.");
    }

    public static void main(String[] args) {
        new BLesson4().game();
    }
}