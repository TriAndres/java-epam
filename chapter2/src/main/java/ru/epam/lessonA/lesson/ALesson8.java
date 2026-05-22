package ru.epam.lessonA.lesson;


public class ALesson8 extends ALesson {
    @Override
    public void game() {
        System.out.println("8 Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson8().game();
    }
}