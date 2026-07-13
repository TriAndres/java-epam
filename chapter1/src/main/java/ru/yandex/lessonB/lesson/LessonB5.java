package ru.yandex.lessonB.lesson;

public class LessonB5 extends LessonB {
    /*
    5 Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
     */
    @Override
    public void game() {
        array = arr(100, 999);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        int count = 0;
        int to = 10;
        System.out.println("\n\nЧисла, в которых нет одинаковых цифр:");
        for (int i : array) {
            char[] a = Integer.toString(i).toCharArray();
            if (a.length == 3) {
                if (a[0] != a[1] && a[1] != a[2] && a[2] != a[0]) {
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
        new LessonB5().game();
    }
}
