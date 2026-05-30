package ru.epam.lessonA.lesson;


import java.util.ArrayList;
import java.util.Arrays;

public class ALesson8 extends ALesson {
    @Override
    public void game() {
        System.out.println("8 Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.");
        array = arr(100, 999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        System.out.println("\nВывод:");
        Arrays.sort(array);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i : array) {
            String num1 = String.valueOf(i);
            String num2 = new StringBuilder(num1).reverse().toString();
            if (num1.equals(num2)) {
                arrayList.add(i);
            }
        }
        if (!arrayList.isEmpty()) {
            System.out.println(arrayList.getLast());
        }

    }

    public static void main(String[] args) {
        new ALesson8().game();
    }
}