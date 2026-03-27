package ru.epam.learn.main;

import ru.epam.learn.action.TutorialAction;

public class FirstProgram {
    public static void main(String[] args) {
// declaring and creating an object
        TutorialAction action = new TutorialAction();
// calling a method that outputs a string
        action.printMessage("tutorial-> https://docs.oracle.com/javase/tutorial/");
    }
}
