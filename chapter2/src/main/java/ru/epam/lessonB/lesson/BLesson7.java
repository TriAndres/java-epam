package ru.epam.lessonB.lesson;

import java.math.BigInteger;

import static ru.epam.console.ReadConsole.*;
import static ru.epam.user.controller.UserController.getDefaultUser;

public class BLesson7 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n7 Написать код программы, которая бы переводила числа из десятичной системы счисления " +
                "в любую другую.");
        System.out.println("Поступим иначе.\nВведите число:");
        int num1 = getInteger();
        System.out.println("Введите системы счисления от 2 до 36:");
        int num2 = getIntegerFroAndTo(2,36);

        String result1 = Integer.toString(num1, num2);
        System.out.println("Число=" + result1 + " система_счисления=" + num2);




        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson7().game();
    }
}