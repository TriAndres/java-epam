package ru.epam.lessonC.lesson;

import java.util.Arrays;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class CLesson1 extends CLesson {
    @Override
    public void game() {
        System.out.println("1 Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
        System.out.println("\nВвод:");
        array = array();

        for (int k = 0; k < array[0].length; k++) {
            Arrays.sort(array[k]);
        }

        show(array);

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new CLesson1().game();
    }
}