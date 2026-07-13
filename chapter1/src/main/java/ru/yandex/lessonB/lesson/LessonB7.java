package ru.yandex.lessonB.lesson;

public class LessonB7 extends LessonB {
    /*
    7 Отсортированные числа в порядке возрастания и убывания.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        int count = 0;
        int to = 10;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j  = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nОтсортированные числа в порядке возрастания:");
        for (int i : array) {
            count++;
            System.out.printf("%d\t", i);
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }

        count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j  = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nОтсортированные числа в порядке убывания:");
        for (int i : array) {
            count++;
            System.out.printf("%d\t", i);
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        new LessonB7().game();
    }
}