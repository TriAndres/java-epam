package ru.yandex.learn.main;

import ru.yandex.learn.action.TutorialAction;

public class FirstProgram {
    public static void main(String[] args) {
        TutorialAction action = new TutorialAction();
        action.ptintMessage("tutorial-> http://docs.oracle.com/javase/tutorial/");
    }
}
