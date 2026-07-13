package ru.yandex.lessonB.lesson;

public class LessonB2 extends LessonB {
    /*
    2 Наибольшее и наименьшее число.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("\nНаибольшее число: " + max
        + "\nНаименьшее число: " + min);
    }

    public static void main(String[] args) {
        new LessonB2().game();
    }
}
