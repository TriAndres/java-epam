package ru.epam.lessonB.lesson;

public class LessonB6 extends LessonB {
    /*
    6 Простые числа.
     */
    @Override
    public void game() {
        array = arr(0, 100);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("\nПростые числа:");
        int count = 0;
        int to = 10;
        for (int i : array) {
            boolean isPrime = true;
            if (i > 1) {
                for (int a = 2; a < Math.sqrt(i); a++) {
                    if (i % a == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
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
        new LessonB6().game();
    }
}