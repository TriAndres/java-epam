package ru.yandex.lessonB.lesson;

public class LessonB10 extends LessonB {
    /*
    10 Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
     */
    @Override
    public void game() {
        array = arr(10, 99);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("\nЧисла-палиндромы:");
        for (int i : array) {
            String left = String.valueOf(i);
            String right = new StringBuilder(left).reverse().toString();
            if (left.equals(right)) {
                System.out.printf("%d\t", i);
            }
        }
    }

    public static void main(String[] args) {
        new LessonB10().game();
    }
}