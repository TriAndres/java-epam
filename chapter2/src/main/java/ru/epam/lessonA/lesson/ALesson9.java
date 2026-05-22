package ru.epam.lessonA.lesson;


public class ALesson9 extends ALesson {
    @Override
    public void game() {
        System.out.println("9 Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson9().game();
    }
}