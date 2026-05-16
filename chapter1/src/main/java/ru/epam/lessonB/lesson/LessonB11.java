package ru.epam.lessonB.lesson;

public class LessonB11 extends LessonB {
    /*
    11 Элементы, которые равны полусумме соседних элементов.
     */
    @Override
    public void game() {
        array = arr(0, 10);
        System.out.println("\nВводимый массив цифр:");
        show(array);

        System.out.println("Элементы, которые равны полусумме соседних элементов:");
        for (int i = 1; i < array.length-1; i++) {
           int avr = (array[i-1] + array[i+1]) / 2;
           if (avr == i) {
               System.out.printf("%d\t", i);
           }
        }
    }

    public static void main(String[] args) {
        new LessonB11().game();
    }
}