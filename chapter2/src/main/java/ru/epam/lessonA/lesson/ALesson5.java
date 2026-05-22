package ru.epam.lessonA.lesson;


public class ALesson5 extends ALesson {
    @Override
    public void game() {
        System.out.println("5 Найти количество чисел, содержащих только четные цифры, а среди них — количество чисел с равным числом четных и нечетных цифр.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson5().game();
    }
}