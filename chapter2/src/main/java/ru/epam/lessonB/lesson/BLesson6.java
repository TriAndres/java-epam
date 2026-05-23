package ru.epam.lessonB.lesson;

public class BLesson6 extends BLesson {
    @Override
    public void game() {
        System.out.println("6 В системе счисления с некоторым основанием десятичное число 81 записывается " +
                "в виде 100. Найти это основание.");
    }

    public static void main(String[] args) {
        new BLesson6().game();
    }
}