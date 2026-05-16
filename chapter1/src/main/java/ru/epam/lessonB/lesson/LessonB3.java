package ru.epam.lessonB.lesson;

public class LessonB3 extends LessonB {
    /*
    3 Числа, которые делятся на 3 или на 9.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("\nЧисла, делятся на 3 или на 9:");
        int count = 0;
        int to = 10;
        for (int i : array) {
            if (i % 3 == 0) {
                count++;
                System.out.printf("%d\t", i);
                if (count == to) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        new LessonB3().game();
    }
}
