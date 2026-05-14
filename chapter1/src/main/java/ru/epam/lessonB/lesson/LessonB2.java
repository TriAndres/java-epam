package ru.epam.lessonB.lesson;

public class LessonB2 extends LessonB {
    @Override
    public void game() {
        System.out.println("решаю");
    }

    public static void main(String[] args) {
        new LessonB2().game();
    }
}
