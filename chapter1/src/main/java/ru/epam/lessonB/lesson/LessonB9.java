package ru.epam.lessonB.lesson;

public class LessonB9 extends LessonB {
    /*
    9 «Счастливые» числа.
     */
    @Override
    public void game() {
        array = arr(1000, 9999);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("\n«Счастливые» числа:");
        for (int i : array) {
            char[] a = String.valueOf(i).toCharArray();
            if (a.length == 4) {
                int left = (int) a[0] + (int) a[1];
                int right = (int) a[2] + (int) a[3];
                if (left == right) {
                    System.out.printf("%d\t", i);
                }
            }
        }
    }

    public static void main(String[] args) {
        new LessonB9().game();
    }
}