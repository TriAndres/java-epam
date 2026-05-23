package ru.epam.lessonA.lesson;


import java.util.ArrayList;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class ALesson4 extends ALesson {
    @Override
    public void game() {
        System.out.println("4 Найти число, в котором число различных цифр минимально. Если таких чисел несколько, " +
                "найти первое из них.");
        array = arr(100, 999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        ArrayList<Num> arrayList = new ArrayList<>();

        for (int j : array) {
            int count1 = 0;
            int count2 = 0;
            String num = null;
            String[] a = String.valueOf(j).split("");
            for (int i = 0; i < a.length; i++) {
                for (int k = i; k < a.length; k++) {
                    if (a[i].equals(a[k])) {
                        ++count1;
                        num = a[k];
                    }
                }
                if (a[i].equals(num)) {
                    ++count2;
                }
                if (count1 == count2) {
                    break;
                }
                count1 = 0;
                num = null;
            }
            if (count2 - 1 > 0) {
                arrayList.add(new Num(j, count2 - 1));
                count2 = 0;
            }
        }

        if (!arrayList.isEmpty()) {
            System.out.println("\n\nсортировка массива:");
            arrayList.sort((a, b) -> a.getNum() - b.getNum());
            arrayList.sort((a, b) -> b.getLength() - a.getLength());
            int count = 0;
            int to = 10;
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i).num + "-" + arrayList.get(i).getLength() + "\t");
                ++count;
                if (count == to) {
                    System.out.println();
                    count = 0;
                }
            }

            int firstNum = arrayList.getLast().num;
            int firstNumLength = arrayList.getLast().getLength();
            System.out.println("\n\bчисло с различными цифрами минимально: " + firstNum + "-" + firstNumLength);
        } else {
            System.out.println("\nНет числа по условию.");
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    static class Num {
        private final int num;
        private final int length;

        public Num(int num, int length) {
            this.num = num;
            this.length = length;
        }

        public int getNum() {
            return num;
        }

        public int getLength() {
            return length;
        }
    }

    public static void main(String[] args) {
        new ALesson4().game();
    }
}