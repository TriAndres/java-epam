package ru.epam.lessonB.lesson;

public class LessonB1 extends LessonB {
    @Override
    public void game() {
        array = arr();
        System.out.println("Вводимый массив цифр:");
        show(array);

        System.out.println("\nЧётные цифры:");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nНечётные цифры:");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
        new LessonB1().game();
    }
}
