package by.epam.lesson;

import static by.epam.controller.Controller.consoleService;

public class Lesson5 extends Lesson {
    @Override
    public void game() {
        System.out.println("5. Ввести целые числа как аргументы командной строки, " +
                "подсчитать их суммы и произведения. Вывести результат на консоль. ");
        int sum = 0;
        int mul = 1;
        int predel = 100_000;

        while (true) {
            int num;
            do {
                System.out.println("""
                    \tВведите действие:
                    \t - Введите число.
                    \t - 0 Выход.
                    """);
                num = consoleService().getInteger();
            } while (num <= -1);

            if (num == 0) {
                break;
            } else if (num > predel) {
                System.out.println("Вышли за предел " + predel);
            } else {
                System.out.println("сумма: " + (sum += num));
                System.out.println("произведение: " + (mul *= num));
            }
        }

        System.out.println("Выход из меню.");
    }
}