package ru.yandex.lessonC.lesson;

import java.util.Arrays;

import static ru.yandex.user.controller.UserController.getDefaultUser;

public class CLesson2 extends CLesson {
    @Override
    public void game() {
        System.out.println("2 Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).");
        System.out.println("\nВвод:");
        array = array();

        System.out.println("\nСдвиг вправо на 1:");
        right(array, 1, 3);
//
//        System.out.println("\nСдвиг влево на 1:");
//        show(left(array, 1));
//
//        System.out.println("\nСдвиг вниз на 1:");
//        show(down(array, 1));
//
//        System.out.println("\nСдвиг вверх на 1:");
//        show(up(array, 1));

        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void right(int[][] matrix, int from, int to) {

        for (int i = 0; i < matrix.length; i++) {
            int[] temp1 = matrix[from - 1];
            matrix[to - 1] = temp1;
            if (i == from - 1) {
            } else if (i == to - 1) {
                System.out.println(Arrays.toString(temp1));
            }
            //else if (i == to) {

            //}

            else {
                System.out.println(Arrays.toString(matrix[i]));
            }


        }
    }
/*
    // Сдвиг матрицы вправо на k позиций
    public static int[][] right(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] row = matrix[i];
            int[] newRow = new int[cols];
            int effectiveShift = k % cols; // Оптимизация для k > cols
            for (int j = 0; j < cols; j++) {
                // Вычисляем индекс исходного элемента
                int originalIndex = (j - effectiveShift + cols) % cols;
                newRow[j] = row[originalIndex];
            }
            result[i] = newRow;
        }

        return result;
    }

    // Сдвиг матрицы влево на k позиций
    public static int[][] left(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] row = matrix[i];
            int[] newRow = new int[cols];
            int effectiveShift = k % cols;
            for (int j = 0; j < cols; j++) {
                // Вычисляем индекс исходного элемента
                int originalIndex = (j + effectiveShift) % cols;
                newRow[j] = row[originalIndex];
            }
            result[i] = newRow;
        }
        return result;
    }

    // Сдвиг матрицы вниз на k позиций
    public static int[][] down(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int j = 0; j < cols; j++) {
            // Создаем временный столбец
            int[] column = new int[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = matrix[i][j];
            }

            // Сдвигаем временный столбец
            int effectiveShift = k % rows;
            for (int i = 0; i < rows; i++) {
                int originalIndex = (i - effectiveShift + rows) % rows;
                result[i][j] = column[originalIndex];
            }
        }
        return result;
    }

    // Сдвиг матрицы вверх на k позиций
    public static int[][] up(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int j = 0; j < cols; j++) {
            // Создаем временный столбец
            int[] column = new int[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = matrix[i][j];
            }

            // Сдвигаем временный столбец
            int effectiveShift = k % rows;
            for (int i = 0; i < rows; i++) {
                int originalIndex = (i + effectiveShift) % rows;
                result[i][j] = column[originalIndex];
            }
        }
        return result;
    }

 */

    public static void main(String[] args) {
        new CLesson2().game();
    }
}