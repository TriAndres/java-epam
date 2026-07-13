package ru.yandex.lessonB.lesson;

public class LessonB8 extends LessonB {
    /*
    8 Числа в порядке убывания частоты встречаемости чисел.
     */
    @Override
    public void game() {
        array = arr(0, 10);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        int[] sortNum = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            sortNum[i] = array[i];
        }

        int countNum1 = 0;
        int countNum2 = 0;
        int num = 0;

        System.out.println("\nЧисла в порядке убывания частоты встречаемости чисел:");
        for (int k : sortNum) {
            for (int i : sortNum) {
                if (k == i) {
                    ++countNum1;
                    num = i;
                }
            }
            if (k == num) {
                ++countNum2;
            }
            if (countNum1 == countNum2) {
                System.out.println(num + "=" + countNum1);
                countNum2 = 0;
            }
            countNum1 = 0;
            num = 0;
        }
    }

    public static void main(String[] args) {
        new LessonB8().game();
    }
}