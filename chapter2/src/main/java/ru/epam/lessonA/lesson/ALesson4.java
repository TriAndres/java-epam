package ru.epam.lessonA.lesson;


public class ALesson4 extends ALesson {
    @Override
    public void game() {
        System.out.println("4 Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson4().game();
    }
}