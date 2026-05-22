package ru.epam.lessonA.lesson;


public class ALesson6 extends ALesson {
    @Override
    public void game() {
        System.out.println("6 Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson6().game();
    }
}