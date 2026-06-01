package ru.epam.lessonA.lesson;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class ALesson4 extends ALesson {
    @Override
    public void game() {
        System.out.println("4 Найти число, в котором число различных цифр минимально. Если таких чисел несколько, " +
                "найти первое из них.");
        array = arr(1000, 9999);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        HashSet<Num> arr = new HashSet<>();
        Arrays.sort(array);
        for (int a : array) {
            String[] s = String.valueOf(a).split("");
            HashSet<String> kk = new HashSet<>(Arrays.asList(s));
            arr.add(new Num(a, kk));
        }

        System.out.println("\nВывод:");
        ArrayList<Num> list = new ArrayList<>(arr);
        list.sort((a, b) -> a.getArr().size() - b.getArr().size());

        System.out.print(list.getFirst().num + "=" + list.getFirst().getArr().size() + "\t");


        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }


    public static void main(String[] args) {
        new ALesson4().game();
    }

    static class Num {
        private final int num;
        private final HashSet<String> arr;

        public Num(int num, HashSet<String> arr) {
            this.num = num;
            this.arr = arr;
        }

        public int getNum() {
            return num;
        }

        public HashSet<String> getArr() {
            return arr;
        }
    }
}