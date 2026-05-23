package ru.epam.lessonB.lesson;

public class BLesson5 extends BLesson {
    @Override
    public void game() {
        System.out.println("5 Сколько значащих нулей в двоичной записи числа 129?");
    }

    public static void main(String[] args) {
        new BLesson5().game();
    }
}