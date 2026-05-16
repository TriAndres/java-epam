package ru.epam.lessonB.lesson;

public class LessonB4 extends LessonB {
    /*
    4 Числа, которые делятся на 5 и на 7.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("\nЧисла, делятся на 5 и на 7:");
        int count = 0;
        int to = 10;
        for (int i : array) {
            if (i % 5 == 0 && i % 7 == 0) {
                if (i != 0) {
                    count++;
                    System.out.printf("%d\t", i);
                    if (count == to) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new LessonB4().game();
    }
}
