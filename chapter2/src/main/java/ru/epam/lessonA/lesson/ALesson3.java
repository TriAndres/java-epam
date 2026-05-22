package ru.epam.lessonA.lesson;


public class ALesson3 extends ALesson {
    @Override
    public void game() {
        System.out.println("3 Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

    }

    public static void main(String[] args) {
        new ALesson3().game();
    }
}