package ru.yandex.lessonA.lesson;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class ALesson2 extends ALesson {
    @Override
    public void game() {
        System.out.println("2 Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        array = arr(0, 1000);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        int count = 0;
        int to = 10;
        int length = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nВ порядке убывания значений их длины:");
        for (int i : array) {
            length = String.valueOf(i).length();
            System.out.printf("%d=%d\t", i, length);
            ++count;
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j +1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nВ порядке возрастания значений их длины:");
        count = 0;
        for (int i : array) {
            length = String.valueOf(i).length();
            System.out.printf("%d=%d\t", i, length);
            ++count;
            if (count == to) {
                System.out.println();
                count = 0;
            }
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new ALesson2().game();
    }
}