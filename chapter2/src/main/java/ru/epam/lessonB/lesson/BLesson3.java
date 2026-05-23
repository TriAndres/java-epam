package ru.epam.lessonB.lesson;

public class BLesson3 extends BLesson {
    @Override
    public void game() {
        System.out.println("3 Определить принадлежность некоторого значения " +
                "k интервалам (n, m], [n, m), (n, m), [n, m].");
    }

    public static void main(String[] args) {
        new BLesson3().game();
    }
}