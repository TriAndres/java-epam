package ru.epam.lessonA.lesson;


public class ALesson5 extends ALesson {
    @Override
    public void game() {
        System.out.println("5 Найти количество чисел, содержащих только четные цифры, " +
                "а среди них — количество чисел с равным числом четных и нечетных цифр.");
        array = arr(1000, 9999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        System.out.println("\nВывод:");

        int count = 0;
        int to = 0;
        for (int i : array) {
        int countNum1 = 0;
        int countNum2 = 0;
            char[] a = String.valueOf(i).toCharArray();
            for (char c : a) {
                if ((int) c % 2 == 0) {
                    ++countNum1;
                } else {
                   ++countNum2;
                }
            }
            if (countNum1 == countNum2) {
                System.out.printf("%d\t",i);
                ++count;
                if (count == to) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        new ALesson5().game();
    }
}