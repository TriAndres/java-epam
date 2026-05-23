package ru.epam.lessonB.lesson;

public class BLesson8 extends BLesson {
    @Override
    public void game() {
        System.out.println("8 Написать код программы, которая бы переводила числа одной любой системы счисления" +
                " в любую другую.");
    }

    public static void main(String[] args) {
        new BLesson8().game();
    }
}