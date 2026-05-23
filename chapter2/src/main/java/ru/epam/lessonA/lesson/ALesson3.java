package ru.epam.lessonA.lesson;


import static ru.epam.user.controller.UserController.getDefaultUser;

public class ALesson3 extends ALesson {
    @Override
    public void game() {
        System.out.println("3 Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        array = arr(0, 100);
        System.out.println("\nВведите количиство цифр в массиве:");
        show(array);

        int avg = 0;
        int length = 0;
        int sum = 0;
        for (int j : array) {
            sum += j;
            avg = sum / array.length;
        }

        System.out.println("\n\nДлина которых меньше средней, а также длину:");

        for (int i : array) {
            if (avg > i) {
                length = String.valueOf(i).length();
                System.out.printf("%d=%d\t", i, length);
            }
        }

        System.out.println("\n\nдлина которых больше средней, а также длину:");

        for (int i : array) {
            if (avg < i) {
                length = String.valueOf(i).length();
                System.out.printf("%d=%d\t", i, length);
            }
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new ALesson3().game();
    }
}