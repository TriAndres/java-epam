package ru.epam.lessonA.lesson;

import java.util.Scanner;

public class LessonA5 extends LessonA{
    private final Scanner scanner;

    public LessonA5() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void game() {
        int num = 0;
        int sum = 0;
        int mul = 1;
        do {
            System.out.println("Введите целые числа :");
            num = getInteger();
            if (num != 0) {
                sum = sum + num;
                System.out.println("Сумма = " + sum);
                mul = mul * num;
                System.out.println("Произведение = " + mul);
            } else {
                System.out.println("Ввели не число или 0.");
            }
        } while (num != 0);
    }

    public int getInteger() {
        int a;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            scanner.nextLine();
            a = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        new LessonA5().game();
    }
}