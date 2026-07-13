package ru.yandex.lessonB.lesson;

import static ru.yandex.console.ReadConsole.getIntegerFroAndTo;
import static ru.yandex.lessonB.lesson.BLesson9.Month.*;
import static ru.yandex.user.controller.UserController.getDefaultUser;

public class BLesson9 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n9 Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего " +
                "данному числу. Осуществить проверку корректности ввода чисел.");

        System.out.println("Введите число от 1 до 12:");
        int month = getIntegerFroAndTo(1, 12);
        switch (Month.select(month)) {
            case JAMUARY -> System.out.println(JAMUARY);
            case FEBRUARY -> System.out.println(FEBRUARY);
            case MARCH -> System.out.println(MARCH);
            case APRIL -> System.out.println(APRIL);
            case MAY -> System.out.println(MAY);
            case JUNE -> System.out.println(JUNE);
            case JULY -> System.out.println(JULY);
            case AUGUST -> System.out.println(AUGUST);
            case SEPTEMBER -> System.out.println(SEPTEMBER);
            case OCTOBER -> System.out.println(OCTOBER);
            case NOVEMBER -> System.out.println(NOVEMBER);
            case DECEMBER -> System.out.println(DECEMBER);
            case null -> System.out.println();
        }

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    enum Month {
        JAMUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

        Month() {
        }

        public static Month select(int s) {
            return switch (s) {
                case 1 -> JAMUARY;
                case 2 -> FEBRUARY;
                case 3 -> MARCH;
                case 4 -> APRIL;
                case 5 -> MAY;
                case 6 -> JUNE;
                case 7 -> JULY;
                case 8 -> AUGUST;
                case 9 -> SEPTEMBER;
                case 10 -> OCTOBER;
                case 11 -> NOVEMBER;
                case 12 -> DECEMBER;
                default -> null;
            };
        }
    }

    public static void main(String[] args) {
        new BLesson9().game();
    }
}