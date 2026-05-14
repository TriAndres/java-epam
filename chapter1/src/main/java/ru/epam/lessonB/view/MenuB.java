package ru.epam.lessonB.view;

import ru.epam.lessonA.controller.ControllerA;
import ru.epam.lessonB.controller.ControllerB;

public class MenuB {
    private ControllerB controllerB;

    public MenuB() {
        controllerB = new ControllerB();
    }

    public void game() {
        String line = null;
        do {
            line = menu();
            select(line);
        } while (!line.equals("0"));
    }

    private String menu() {
        return "";
    }

    private void select(String line) {
    }
}
