package by.epam.controller;

import by.epam.service.ConsoleService;

public class Controller {

    public static ConsoleService consoleService() {
        return new ConsoleService();
    }
}
