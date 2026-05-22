package ru.epam.lessonA.lesson;


public class ALesson7 extends ALesson {
    @Override
    public void game() {
        System.out.println("7 Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson7().game();
    }
}