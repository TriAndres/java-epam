package ru.epam.lessonB.lesson;

public class BLesson1 extends BLesson {
    @Override
    public void game() {
        System.out.println("1 Вывести на экран таблицу умножения.");
    }

    public static void main(String[] args) {
        new BLesson1().game();
    }
}