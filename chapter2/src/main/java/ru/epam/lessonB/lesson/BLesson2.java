package ru.epam.lessonB.lesson;

import static ru.epam.user.controller.UserController.getDefaultUser;

public class BLesson2 extends BLesson {
    @Override
    public void game() {
        System.out.println("\n2 Вывести элементы массива в обратном порядке.");

        String st = "123456789";
        System.out.println("Ввод:\n" + st);

        char[] line = st.toCharArray();

        System.out.println("Вывод:");
        for (int i = line.length; i > 0; i--) {
            System.out.printf("%s\t",i);
        }


        if (!getDefaultUser().isUser()) {
            getDefaultUser().infoUser();
        }
    }

    public static void main(String[] args) {
        new BLesson2().game();
    }
}