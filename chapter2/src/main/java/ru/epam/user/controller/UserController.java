package ru.epam.user.controller;

import ru.epam.user.repository.UserRepository;
import ru.epam.user.service.UserService;

public class UserController {
    private final static UserRepository userRepository = new UserRepository();
    private final static UserService userService = new UserService(userRepository);

    public static UserService getDefaultUser() {
        return userService;
    }
}