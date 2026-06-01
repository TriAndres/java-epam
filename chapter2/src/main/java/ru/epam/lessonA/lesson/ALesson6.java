package ru.epam.lessonA.lesson;


import java.util.ArrayList;
import java.util.Arrays;

public class ALesson6 extends ALesson {
    @Override
    public void game() {
        System.out.println("6 Найти число, цифры в котором идут в строгом порядке возрастания. Если таких " +
                "чисел несколько, найти первое из них.");
        array = arr(100, 999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        System.out.println("\nВывд:");
        ArrayList<Integer> num = new ArrayList<>();
        Arrays.sort(array);
        for (int i : array) {
            int count = 0;
            char[] a = String.valueOf(i).toCharArray();
            for (int j = 1; j < a.length; j++) {
                if ((int) a[j - 1] < (int) a[j]) {
                    ++count;
                }
            }
            if (count == a.length - 1) {
                num.add(i);
            }
        }
        System.out.print(num.getFirst());
    }

    public static void main(String[] args) {
        new ALesson6().game();
    }
}