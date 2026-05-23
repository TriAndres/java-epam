package ru.epam.lessonB.lesson;

public class BLesson7 extends BLesson {
    @Override
    public void game() {
        System.out.println("7 Написать код программы, которая бы переводила числа из десятичной системы счисления " +
                "в любую другую.");
    }

    public static void main(String[] args) {
        new BLesson7().game();
    }
}