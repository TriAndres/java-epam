package ru.epam.lessonB.lesson;

import java.util.Scanner;

import static ru.epam.console.ReadConsole.getInteger;
import static ru.epam.console.ReadConsole.getIntegerFroAndTo;
import static ru.epam.user.controller.UserController.getDefaultUser;

public class BLesson8 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n8 Написать код программы, которая бы переводила числа одной любой системы счисления" +
                " в любую другую.");

        Scanner sc = new Scanner(System.in);
        System.out.println("В какой системе счисления число?");
        int nsnumb = Integer.parseInt(sc.nextLine());//номер системы в которой число
        System.out.println("Введите число: ");
        long number = Long.parseLong(sc.nextLine(), nsnumb);// вводимое число
        System.out.println("Введите систему счисления: ");
        int ns = sc.nextInt();//номер системы счисления
        System.out.println("Полученое число " + Long.toString(number, ns));


        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson8().game();
    }
}