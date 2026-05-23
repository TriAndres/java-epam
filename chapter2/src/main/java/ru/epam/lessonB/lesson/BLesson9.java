package ru.epam.lessonB.lesson;

public class BLesson9 extends BLesson {
    @Override
    public void game() {
        System.out.println("9 Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего " +
                "данному числу. Осуществить проверку корректности ввода чисел.");
    }

    public static void main(String[] args) {
        new BLesson9().game();
    }
}