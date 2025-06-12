package by.epam.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static by.epam.controller.Controller.consoleService;

public class Lesson3 extends Lesson {
    @Override
    public void game() {
        System.out.println("3. Вывести заданное количество случайных" +
                " чисел с переходом и без перехода на новую строку. ");

        int number;
        do {
            System.out.println("Введите количество чисел:");
            number = consoleService().getInteger();
        } while (number <= 0);

        int from;
        do {
            System.out.println("Введите from:");
            from = consoleService().getInteger();
        } while (from <= 0);

        int to;
        do {
            System.out.println("Введите to:");
            to = consoleService().getInteger();
        } while (to <= from);

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            num.add(from + new Random().nextInt(to - from));
        }

        int line;
        do {
            System.out.println("Длинна line:");
            line = consoleService().getInteger();
        } while (line <= 0);

        int count = 0;
        System.out.println("Вывод с переходом:");
        for (Integer num1 : num) {
            System.out.print("\t" + num1);
            count++;
            if (line == count) {
                System.out.println();
                count = 0;
            }
        }

        System.out.println("\nВывод без перехода:");
        for (Integer num1 : num) {
            System.out.print("\t" + num1);
        }
    }
}