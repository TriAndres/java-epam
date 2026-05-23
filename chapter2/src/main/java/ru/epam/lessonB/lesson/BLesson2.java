package ru.epam.lessonB.lesson;

public class BLesson2 extends BLesson {
    @Override
    public void game() {
        System.out.println("2 Вывести элементы массива в обратном порядке.");
    }

    public static void main(String[] args) {
        new BLesson2().game();
    }
}