package ru.epam.lessonA.lesson;


import java.util.Arrays;

public class ALesson2 extends ALesson {
    @Override
    public void game() {
        System.out.println("2 Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson2().game();
    }
}