package ru.yandex.user.controller;

import ru.yandex.user.repository.UserRepository;
import ru.yandex.user.service.UserService;

public class UserController {
    private final static UserRepository userRepository = new UserRepository();
    private final static UserService userService = new UserService(userRepository);

    public static UserService getDefaultUser() {
        return userService;
    }
}