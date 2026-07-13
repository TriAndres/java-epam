package ru.yandex.lessonB.lesson;

public class LessonB1 extends LessonB {
    /*
    1 Четные и нечетные числа.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        int to = 10;
        int count = 0;
        System.out.println("\nЧётные цифры:");
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
                System.out.printf("%d\t", i);
                if (count == to) {
                    System.out.println();
                    count = 0;
                }
            }
        }

        count = 0;
        System.out.println("\nНечётные цифры:");
        for (int i : array) {
            if (i % 2 != 0) {
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
        new LessonB1().game();
    }
}
